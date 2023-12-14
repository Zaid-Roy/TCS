Practice and testing for custom dependencies
To run demo-controller correctly we must create a maven local repository fro the custom dependnecies:
Go to gradle-dependencies project and run ./gradlew publishtoMavenLocal
Run the main application in demo-controller and test by going to http://localhost:8080/employees
