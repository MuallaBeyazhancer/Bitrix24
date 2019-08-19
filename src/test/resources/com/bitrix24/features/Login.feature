Feature: Create a task from activity stream
  Agile Story:
  As a user I should be able to create a task from activity stream.

  @login
  Scenario:Login as a helpdesk employee
    Given I am on the login page
    When I login as a helpdesk employee
    Then I should be able to see the portal page