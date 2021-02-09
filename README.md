# CRUD
Created a sample project to perform basic crud operation.

Please find the below examples for testing the apis

API for creating user
curl -v -H "Content-Type: application/json" -d "{\"users\":{\"name\":\"kavya\",\"phone\":\"999999999\",\"email\":\"kavya@gmail.com\"}}" http://localhost:8080/CRUDProject/createUser

API for updating user
curl -v -X PUT -H "Content-Type: application/json" -d "{\"users\":{\"name\":\"kavya.k \",\"phone\":\"999999999\",\"email\":\"kavya.k@gmail.com\",\"id\":3}}" http://localhost:8080/CRUDProject/updateUser

API for getting user details by id
curl -v -H "Content-Type: application/json" http://localhost:8080/CRUDProject/getUser?userId=3

API for deleting user by id
curl -v -X DELETE -H "Content-Type: application/json" http://localhost:8080/CRUDProject/deleteUser?userId=3

