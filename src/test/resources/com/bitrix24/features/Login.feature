Feature: Tasks
  Agile Story:
  As a user I should be able to create a task from activity stream.
  Background:
    Given I am on the login page
    When I login as a helpdesk employee
  Scenario: Create new task
    And I click on the tasks tab plus symbol
    And I write in the things to do title box
    And I write in the box below the things to do title box
    And I click add task
    Then Our task should appear on the tasks page

  Scenario: Upload a file
    And I click on the tasks tab plus symbol
    And I click on the upload files image
    And I click upload files images box
    And I upload an image
    And I click on the link tab
    And I input the link text
    And I input the link url
    And I click save
    And I click Checklist
    And I input text in the checklist box
    And I click the checkmark
    Then Our task should contain a checklist
    And Our task should contain a hyperlink
    And Our task should contain a file/image

  Scenario: Set up a deadline
    And I click on the tasks tab
    And I select the top task
    And I click the select action menu
    And I click set deadline
    And I choose a date from the input box
    And I click apply
    And I click continue
    Then I should see the specified deadline in the dealine column