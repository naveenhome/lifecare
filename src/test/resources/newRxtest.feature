Feature: New Rx Regression test

  Scenario Outline: Testing
    Given <pname> has entered doc name <dname>, Date as <vdate>, time as <vtime> and file name is <filename>
    When click on <button>
    Then System should display <message>

    Examples: 
      | pname    | dname | vdate        | vtime    | filename  | button   | message                     |
      | "Naveen" | "XYZ" | "06/15/2016" | "5.30pm" | "abc.jpg" | "Submit" | "Sucess"                    |
      | " "      | "XYZ" | "06/15/2016" | "5.30pm" | "abc.jpg" | "Submit" | "Patient Name required"     |
      | "Naveen" | " "   | "06/15/2016" | "5.30pm" | "abc.jpg" | "Submit" | "Doc Name needed"           |
      | "Naveen" | "XYZ" | "09/15/2016" | "5.30pm" | "abc.jpg" | "Submit" | "Date can't be future date" |
