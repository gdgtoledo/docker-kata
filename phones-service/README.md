# Phone Service

Service to manage CRUD operations for Phone numbers, using `Golang`, persisting data in Postgres

Fields:
- userId
- phoneNumber
- company
- phone type

Operations:
- retrieve all phones of a user, identified by userId
- retrieve a phone, identified by phoneNumber
- retrieve all phones

Constraints:
- A phone number is unique
- A user can have as many phone numbers as desired
- A phone can be of three types: Mobile, Home, Company