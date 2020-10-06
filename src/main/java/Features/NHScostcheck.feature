Feature: User from wales checks NHS cost

Background:
   
    Given User navigate to NHS Costs checker tool
    
    Scenario: User checks NHS cost providing circumstances as YES
            
      		Given User is from Wales
			When User enters circumstances into the Checker tool as YES
			Then User get a result of whether User will get help or not
			
	Scenario: User checks NHS cost providing circumstances as NO
            
      		Given User is from Wales
			When User enters circumstances into the Checker tool as NO
			Then User get a result of whether User will get help or not	
			
	Scenario: User checks NHS cost as aged under sixteen
            
      		Given User is from Wales
			When User enters circumstances into the Checker tool as aged under sixteen
			Then User get a result of whether User will get help or not		
				