# ChemEventz - Microservice Spring Gestion
&nbsp;
## About ChemEventz!

ChemEventz is a web application that tracks chemical events around the world. 
ChemEventz has been designed to be a collaborative platform to facilitate meetings between researchers, professors, students or anyone interested in these events.

How to make these meetings easier?
  - ChemEventz lists recent events of the most popular events sites
  - Allows users of the platform to add the next known events
  - ChemEventz may allow you to find your future collaborator, job or internship during these meetings


ChemEventz is divided into 6 parts available in my Github account  [public repositories][Git]
  - [ChemEventz - Scraper][GitScrap]  
  - [ChemEventz - NodeJS - API][GitNodeJS] 
  - [ChemEventz - Spring Boot Microservice Authentication][GitSpringAuth]
  - [ChemEventz - Spring Boot Microservice Events][GitSpringEvents]
  - [ChemEventz - Spring Boot Microservice Gestion][GitSpringGestion]  
  - [ChemEventz - Angular][GitAngular]

  
### Tech Dev

ChemEventz uses a number of open source projects to work properly:

* [Angular] - HTML enhanced for web apps!
* [node.js] - v12 for the backend
* [Express] - fast node.js network app framework 
* [Spring Boot] - focus on application-level business logic
* [MongoDB] - non-relationnal database for events storage
* [MySQL] - relational dataBase for users data storage

### Tech Prod

Technologies used to deploy ChemEvents project:

* [Heroku] - Deploy Spring and NodeJS microservices
* [AWS S3] - Deploy Angular microservice
* [AWS RDS] - Cloud MYSQL database Hosting
* [Mongo Atlas] - Cloud MongoDB database Hosting

&nbsp;
______________________________________
&nbsp;
# ChemEventz - Microservice Spring Gestion

### Tech Dev

* [JAVA] - version 8 
* [Spring Boot] - focus on application-level business logic
* [Maven] - Manage project 
* [MySQL] - Store user data
* [Postman] - for test developpement


### Installation

ChemEventz requires Java 8 to run.


```sh
$ git clone https://github.com/nawelb/ChemEvents_Back_Spring_Gestion.git
$ cd ChemEvents_Back_Spring_Gestion
```
Import the project in your favorite IDE :

Add environnement variables :
 - PORT_EVENT : free port to allow this application to run
 - HOST_NAME : as url of your node API [cf node API]
 - MYSQL_URL : url of your MySQL database
 - MYSQL_DB_NAME : name of your MySQL database
 - MYSQL_USERNAME : Username to access to your MySQL Database
 - MYSQL_PASSWORD : Password to access to your MySQL Database
 
and execute : 
```sh
$ mvn clean install package
```
To create tables in your db :
- Run the project.



### URLs

/POST



/GET



/DELETE




[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

  [Maven]: <https://maven.apache.org/>
  [Java]:<https://www.java.com/fr/download/>
  [Git]: <https://github.com/nawelb>
  [node.js]: <http://nodejs.org>
  [express]: <http://expressjs.com>
  [Angular]: <https://angular.io>
  [Heroku]: <https://heroku.com>
  [Spring Boot]: <https://spring.io/projects/spring-boot>
  [Spring Security]: <https://spring.io/guides/topicals/spring-security-architecture>
  [JWT]: <https://jwt.io/introduction/>
  [GitAngular]: <https://github.com/nawelb/ChemEvents_Front_Angular_Security>
  [GitSpringGestion]:<https://github.com/nawelb/ChemEvents_Back_Spring_Gestion>
  [GitSpringEvents]: <https://github.com/nawelb/ChemEvents_Back_Spring_Events>
  [GitSpringAuth]: <https://github.com/nawelb/ChemEvents_Back_Spring_Security>
  [GitNodeJS]: <https://github.com/nawelb/ChemEvents_Back_NodeJS>
  [cf node API]: <https://github.com/nawelb/ChemEvents_Back_NodeJS>
  [GitScrap]: <https://github.com/nawelb/ChemEvents_Scraper>
  [cf scraping project]: <https://github.com/nawelb/ChemEvents_Scraper>
  [AWS S3]: <https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html>
  [AWS RDS]: <https://aws.amazon.com/fr/rds/>
  [Mongo Atlas]: <https://www.mongodb.com/cloud/atlas>
  [MongoDB]: <https://www.mongodb.com/fr>
  [MySQL]: <https://www.mysql.com/fr/>
 [Postman]: <https://www.postman.com/>