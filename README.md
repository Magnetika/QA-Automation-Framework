# QA-Automation-Framework

This project is a Java-based automated testing framework using Selenium, Cucumber, and Maven for web application testing.

## Main Technologies
- Java
- Maven
- Selenium WebDriver
- Cucumber (BDD)
- JUnit

## Folder Structure
```
qa-automation-framework/
├── pom.xml
├── src/
│   ├── main/java/com/magnetika/qa/
│   └── test/java/com/magnetika/qa/
│       ├── pages/
│       ├── runners/
│       ├── steps/
│       ├── utils/
│       └── resources/features/
```

## Installation
1. Clone the repository:
	```
	git clone https://github.com/Magnetika/QA-Automation-Framework.git
	```
2. Navigate to the project folder:
	```
	cd qa-automation-framework
	```
3. Install dependencies:
	```
	mvn clean install
	```

## Running Tests
To run the tests, use:
```
mvn test
```
Test results can be found in the `target/surefire-reports` directory.

## Reports
After execution, test reports are available in XML and TXT format in the `target/surefire-reports` directory.

## Contribution
Pull requests and suggestions are welcome!

## Contact
For questions, contact the project owner: Magnetika