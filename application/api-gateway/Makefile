build: 
	cd ../job-service; mvn -q clean package
	cd ../candidate-service; mvn -q clean package

run: build 
	docker-compose up --build

stop:
	docker-compose down