
Feature: testing for books get api
 
Scenario: 1.Response should get multiple books data
	Given Hit books API
  Then Validate API returns multiple books json
  
Scenario: 2.Validate single book json should have title value as Git Pocket Guide
  Given Hit books API
  Then Validate attribute at json path "books[0].title" and its value "Git Pocket Guide11"
  
Scenario: 3.Validate single book json should have title value as Learning JavaScript Design Patterns
  Given Hit books API
  Then Validate attribute at json path "books[1].title" and its value "Learning JavaScript Design Patterns"
  
Scenario: 4.Validate single book json should have author value as Glenn Block et al.
  Given Hit books API
  Then Validate attribute at json path "books[2].author" and its value "Glenn Block et al."
  