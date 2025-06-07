
Feature: testing for books get adv api
 

Scenario: 1.Validate single book json should have title value as Git Pocket Guide
  Given Hit books API
  Then Validate attribute at json path "books[XX].title" and its value "Git Pocket Guide"
  
Scenario: 2.Validate single book json should have author value as Glenn Block et al.
  Given Hit books API
  Then Validate attribute at json path "books[XX].author" and its value "Glenn Block et al."
  
Scenario: 3.Validate single book json should have subTitle value as A JavaScript and jQuery Developers Guide
  Given Hit books API
  Then Validate attribute at json path "books[XX].subTitle" and its value "A JavaScript and jQuery Developer's Guide"
  
Scenario: 4.Validate single book json should have publisher value as OReilly Media
  Given Hit books API
  Then Validate attribute at json path "books[XX].publisher" and its value "O'Reilly Media"
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  