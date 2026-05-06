Feature: To check the facebook login page
Scenario: To check the invalid email and password field 

Given Open chrome and launch the facebook page
And Maximixe the page
When Pass the value in emal and password field
And Click the login button
Then Close the browser