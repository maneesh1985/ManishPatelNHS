Commands to run this Test Suite in command prompt :-

To run on Windows os with Chrome browser
mvn clean
mvn verify -DOS=Windows -Dbrowser=chrome

To run on Windows os with Firefox browser 
mvn clean
mvn verify -DOS=Windows -Dbrowser=firefox


I have covered 3 scenarios on this user story :-

1.	In first scenario user is aged over 16  and user provides the circumstances as YES starting from  
DO YOU LIVE WITH YOUR PARTNER PAGE  :-

2.	In second scenario user is aged over 16  and user provides the circumstances as NO starting from  
DO YOU LIVE WITH YOUR PARTNER PAGE  :-

3.	In third scenario user is aged Under 16 and provides the circumstances  :-

Tools used for this project :-

1.	Selenium WebDriver 3.141.59
2.	JAVA 
3.	Apache Maven
4.	Cucumber 1.2.6 
5.	TestNG 
6.	Extent Report 2.41.2

I have configured IretryAnalyser,ITestListener, IAnnotationTransformer Listeners in this project.   