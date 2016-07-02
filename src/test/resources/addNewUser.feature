Feature: New User Add
Scenario: Add valid user
Given user click on "Add New" on home page
And Enter "Naveen" as first Name, "World Pay" as Last name and "test@abc.com" as email
When click on button "Create User"
Then System display message on top "User was successfully created."
