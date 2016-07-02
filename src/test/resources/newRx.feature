Feature: New Rx
As A patient 
I want to record my doctor visit
So that prescription should be available

Scenario: Valid data check
Given Patient has entered correct data
When click on "Submit"
Then System should display "Rx uploaded succcessfuly."

@wip
Scenario: Valid data check for logged In user
Given patient is logged In
And Patient has entered correct data
When click on "Submit"
Then System should display "Rx uploaded succcessfuly."

@wip
Scenario: Valid data check with examples
Given "naveen" has entered doc name "Xyz", Date as "31/05/2016", time as "05.30" and file name is "abc.jpg"
When click on "Submit"
Then System should display "Rx uploaded succcessfuly."

@wip
Scenario: Invalid data check with examples without doc name
Given "naveen" has entered doc name " ", Date as "31/05/2016", time as "05.30" and file name is "abc.jpg"
When click on "Submit"
Then System should display "Doctor Name is must in order save data"

