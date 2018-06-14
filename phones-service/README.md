# Phone Service

Service to manage CRUD operations for Phone numbers, using `Golang`, persisting data in Redis

Fields:
- userId
- phoneNumber

Operations:
- retrieve all phones of a user, identified by userId
- retrieve a phone, identified by phoneNumber
- retrieve all phones

Constraints:
- A phone number is unique
- A user can have as many phone numbers as desired