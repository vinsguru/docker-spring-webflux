// create db
db = db.getSiblingDB('candidate');

// create user
db.createUser({
    user: 'candidate_user',
    pwd: 'candidate_password',
    roles:[
        {
            role: 'readWrite',
            db: 'candidate'
        }
    ]
});

// create collection
db.createCollection('candidate');

// create docs
db.candidate.insertMany([
    {
        _id: '1',
        name: 'sam',
        skills: [ 'java', 'spring' ]
    },
    {
        _id: '2',
        name: 'jake',
        skills: [ 'docker' ]
    },
    {
        _id: '3',
        name: 'mike',
        skills: [ 'jira' ]
    }
]);