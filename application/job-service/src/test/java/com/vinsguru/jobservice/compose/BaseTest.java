package com.vinsguru.jobservice.compose;

import org.junit.ClassRule;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.io.File;

@Testcontainers
public abstract class BaseTest {

    private static final int MONGO_PORT = 27017;
    private static final String MONGO = "mongo";
    private static final String MONGO_URI_FORMAT = "mongodb://job_user:job_password@%s:%s/job";

    @ClassRule
    private static final DockerComposeContainer<?> compose = new DockerComposeContainer<>(new File("docker-compose.yaml"));

    @DynamicPropertySource
    static void mongoProperties(DynamicPropertyRegistry registry){
        compose
                .withEnv("HOST_PORT", "0")
                .withExposedService(MONGO, MONGO_PORT, Wait.forListeningPort())
                .start();
        var host = compose.getServiceHost(MONGO, MONGO_PORT);
        var port = compose.getServicePort(MONGO, MONGO_PORT);
        registry.add("spring.data.mongodb.uri", () -> String.format(MONGO_URI_FORMAT, host, port));
    }

}
