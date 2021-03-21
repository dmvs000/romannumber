# roman-numeral-converter
Part of the take home assessment


## Index 


## 1. Goal

THe goal of this project is to provide REST API endpoint to convert Integers within range (inclusive) 1-3999 into Roman Numerals. The endpoint must accept a URL in the format http://localhost:8080/romannumeral?query={integer}


## 2. Tools Required for the project.

 
  
  *Prerequisites: 
  JDK 8+
  Maven 3.6
  * 
  
  To install JDK 8+ version on your system, go to JAVA SE JDK 8 offical download page [here](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html). Download the executable (.exe) file according to your OS requirements and run the executable on the machine
  
  To run the project on your machine, we need to install Maven, a dependency management system. 
  
### 3. 
  

*Note: refer to 10 to access the docker container to access the api.*

### Dev-dependecies



### Program Execution ( Running the code )



*Note : If there is any application already using port 8080 you may get error saying the port 8080 is already in use. To resolve this, you can either change the port (recommended) or stop the other process running on port 8080 if needed*

## 4. Development methodology

### Step 1: Requirement gathering 


### Step 2: Design considerations  


### Step 3: Test cases and development  


### Step 4: Integration testing 




## 5. Project layout

Folders present at the root of this project:

- **controller**: contains APIs

-  **test**: contains tests cases for both the unit tests and integration tests.

Files present at the root of this project:

-  **pom.xml**: manifest file containing dependencies for this project
- 

-  **logback**: contains code for logging capabilities

-  **.gitignore**: contains instructions for git to exclude some of the files and folders during git commits.



## 6. Data call flow 



## 7. Tests

-    **unit tests**: unit tests 

-    **integration tests**: 


## 8. Error handling

### Query value is 0


  
The server will return a **422 ( UNPROCESSABLE ENTITY ) status code along with a json object**:


    {
    
    }


### Query value is not in range


The server will return a **422 ( UNPROCESSABLE ENTITY ) status code along with a json object**:


    {
	    
    }
 
### Query value is not an integer

The server will return a **422 ( UNPROCESSABLE ENTITY ) status code along with a json object** :

    {
	   
    }

## 10. Containerization and Metrics

## 11. References



