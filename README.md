# Spring Framework Essentials and Spring Boot Lab Projects

Labs for the Spring Framework Essentials (formerly Core Spring) and Spring Boot courses at [Spring Academy](https://spring.academy/).

1. Register and login at [Spring Academy](https://spring.academy/). It's free!
    * When accessing with Menlo security enabled, you may encounter problems registering. If so, try disabling it, reloading the web page, and registering again.
2. Start with the [Building a REST API with Spring Boot](https://spring.academy/courses/building-a-rest-api-with-spring-boot). (approx. 5 hours)
    * The labs in this course (Building a REST API...) are done interactively within the browser.
3. Continue with the [Introduction to the Spring Professional Learning Path](https://spring.academy/courses/spring-introduction). (approx. 30 minutes)
    * The labs that follow are in this Git repository.
    * ☝️ _No need to download/extract the ZIP file(s) from the course._
    * Unlike the labs from Spring Academy, the labs here have been upgraded to Spring Boot 3.5.x, and the `lab/pom.xml` is set to use Java 21.
4. Continue with the [Spring Framework Essentials](https://spring.academy/courses/spring-framework-essentials). (approx. 9 hours)
    * The lab notes have been added as `README.md` files.
    * You may also look at the `TODO`s embedded in the source files.
    * It is strongly recommended to use an IDE plugin that will allow you to navigate through all the `TODO`s across the source files in each project.
5. Finish strong with the [Spring Boot](https://spring.academy/courses/spring-boot) course. (approx. 11 hours)

### Prerequisites

The prerequisites are included as part of the _Introduction to the Spring Professional Learning Path_ course _Lab Setup_ lesson.

If you already completed it, you should be ready to do this lab. If not, assuming you already have JDK 21 or later installed and Java IDE, you will need to do the following:

1. Fork this Git repository.
2. In the cloned local folder, go to `lab` and run `./mvnw clean install`.

To import these labs into your IDE, import the parent pom `lab/pom.xml` as Maven projects.
