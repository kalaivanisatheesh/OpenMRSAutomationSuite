Feature: Pataint details 

Background:
When user 

Scenario: Login Page on openmrs appliocation 
	Given user launch the application 
	When user enter the user name 
	And user enter the password 
	Then user click the login button and it navigate to next page 
	
Scenario: Dashboard page on openmrs application 
	When user click on the patant menu 
	Then user enter the details are name 
	Then user enter the gender 
	Then user enter the date of birth 
	Then user contact info in phone number 
	And usen enter the address 
	Then user confirm the details 
	
Scenario: Registration page on openmrs application 
	When user select start visit 
	Then user click the confirm button 
	And user select the attachment 
	And user drop the file in selected place 
	And user click the upload button 
	Then user click the endvisit 
	
Scenario: Revisit the user confirmation 
	Then user enter the height 
	Then user enter the weight 
	And user click the save button 
	And user select the  visits to merge visit 
	And user merge selelcted visit 
	And user add the past visit 
	And user click confirm button 
	Then user click the confirm button 
	
 