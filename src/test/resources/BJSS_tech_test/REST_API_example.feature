
Feature: Basic REST API functionality

  POST to the http://dummy.restapiexample.com/ create route and verify you receive a response that indicates that a user was made.


@RESTCreateUser
  Scenario: Create user via POST request against dummy REST API example endpoint
    Given A valid create user request JSON body is defined
    When A create user POST request is submitted
    Then A 200 response is recieved and the name used in the create request is found in the response body
    And The created record is accessible via a GET request against the name used