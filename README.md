# spring-web-rest-demo-app
A monolithic Spring application with examples of Web development common requirements (MVC and REST)

Based on the examples provided in the following tutorials: 

- [Java Spring Tutorial: The Only Tutorial You Need to Get Started (VS Code) by Alex Therrien](https://medium.com/@alexandre.therrien3/java-spring-tutorial-the-only-tutorial-you-will-need-to-get-started-vs-code-13413e661db5)
- [Spring Boot application with CRUD operations using Spring Data JPA and MySQL by Chandan Kumar](https://medium.com/@chandantechie/spring-boot-application-with-crud-operations-using-spring-data-jpa-and-mysql-23c8019660b1)

Written by Cristian Romero.

Steps:
1. Create an Spring application from [Spring Initialzr](https://start.spring.io/)
- The pom.xml should contain at least the following dependencies:
 
```xml
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-web</artifactId>
   </dependency>

   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-tomcat</artifactId>
       <scope>provided</scope>
   </dependency>
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-thymeleaf</artifactId>
   </dependency>
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-jdbc</artifactId>
   </dependency>
   <dependency>
       <groupId>com.mysql</groupId>
       <artifactId>mysql-connector-j</artifactId>
       <scope>runtime</scope>
   </dependency>
   <dependency>
       <groupId>org.springframework</groupId>
       <artifactId>spring-jdbc</artifactId>
       <version>6.1.12</version>
       <type>jar</type>
   </dependency>
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-data-jpa</artifactId>
   </dependency>
   <dependency>
       <groupId>jakarta.persistence</groupId>
       <artifactId>jakarta.persistence-api</artifactId>
       <version>3.1.0</version>
       <type>jar</type>
   </dependency>
</dependencies>
```

2. The "main" class in this project is `DemoApplication` (see [Alex Therrien](https://medium.com/@alexandre.therrien3/java-spring-tutorial-the-only-tutorial-you-will-need-to-get-started-vs-code-13413e661db5) and [The demo source for DemoApplication.java](https://github.com/CristianRomero1234/spring-web-rest-demo-app/blob/main/demo/src/main/java/com/cristianromero/demo/DemoApplication.java))

3. Create a "view" controller (see [Alex Therrien](https://medium.com/@alexandre.therrien3/java-spring-tutorial-the-only-tutorial-you-will-need-to-get-started-vs-code-13413e661db5) and [View Controller Sources](https://github.com/CristianRomero1234/spring-web-rest-demo-app/blob/main/demo/src/main/java/com/cristianromero/demo/controllers/DemoViewController.java))

4. Add Frontend content HTML, JS, CSS (see [Alex Therrien](https://medium.com/@alexandre.therrien3/java-spring-tutorial-the-only-tutorial-you-will-need-to-get-started-vs-code-13413e661db5) and [check the example resources provided in this project](https://github.com/CristianRomero1234/spring-web-rest-demo-app/tree/main/demo/src/main/resources))

5. Link your project to a database (see [Chandan Kumar](https://medium.com/@chandantechie/spring-boot-application-with-crud-operations-using-spring-data-jpa-and-mysql-23c8019660b1))

6. Create the Entities for your project (see [Chandan Kumar](https://medium.com/@chandantechie/spring-boot-application-with-crud-operations-using-spring-data-jpa-and-mysql-23c8019660b1) and [models package of this project](https://github.com/CristianRomero1234/spring-web-rest-demo-app/tree/main/demo/src/main/java/com/cristianromero/demo/models))

7. Create Repositories for your project (see [Chandan Kumar](https://medium.com/@chandantechie/spring-boot-application-with-crud-operations-using-spring-data-jpa-and-mysql-23c8019660b1) and [repositories package of this project]([https://github.com/CristianRomero1234/spring-web-rest-demo-app/tree/main/demo/src/main/java/com/cristianromero/demo/models](https://github.com/CristianRomero1234/spring-web-rest-demo-app/tree/main/demo/src/main/java/com/cristianromero/demo/datasources/repositories))

8. Create Services for your project (see [Chandan Kumar](https://medium.com/@chandantechie/spring-boot-application-with-crud-operations-using-spring-data-jpa-and-mysql-23c8019660b1) and [services package of this repository](https://github.com/CristianRomero1234/spring-web-rest-demo-app/tree/main/demo/src/main/java/com/cristianromero/demo/services))

9. Create a "REST" controller for your project, in the case of this repository there is a "REST" controller for the table, but you could fit al your "API endpoints" in one file as well.  (see [Chandan Kumar](https://medium.com/@chandantechie/spring-boot-application-with-crud-operations-using-spring-data-jpa-and-mysql-23c8019660b1) and [TestTableRESTController source](https://github.com/CristianRomero1234/spring-web-rest-demo-app/blob/main/demo/src/main/java/com/cristianromero/demo/controllers/TestTableRESTController.java))

10. Run your Spring application.
---

### Spring-Related Glossary

- **Annotations**: Special metadata in Java used to provide additional information to the Spring Framework, which influences how components are wired, configured, and managed at runtime. Examples include `@Component`, `@Service`, and `@Autowired`.

- **Autowired**: A Spring annotation used to automatically inject dependencies into a class, managing the creation and linking of beans through dependency injection.

- **Spring Initializr**: An online tool that helps developers quickly create Spring Boot project templates by providing configuration options like dependencies, project type (Maven/Gradle), and Java version.

- **Maven**: A build automation tool and dependency management system for Java-based projects. It is widely used with Spring to manage libraries and plugins via an XML file (`pom.xml`).

- **Spring Boot**: A Spring Framework extension designed to simplify the development of production-ready Spring applications by reducing boilerplate code and providing auto-configuration and embedded servers.

- **Spring MVC**: A web framework within Spring that follows the Model-View-Controller (MVC) pattern for building web applications, handling web requests, and rendering views.

- **Dependency Injection (DI)**: A core design pattern in Spring where objects (dependencies) are provided to a class rather than being created within it, promoting loose coupling and easier testing.

- **Bean**: An object that is instantiated, assembled, and managed by the Spring IoC container. Beans represent the core components of Spring applications.

- **Inversion of Control (IoC)**: A design principle used by Spring, where the framework takes control of object creation and dependency management, delegating it to the Spring IoC container.

- **ApplicationContext**: The central interface to the Spring IoC container, responsible for managing and configuring Spring beans, handling lifecycle callbacks, and enabling dependency injection.

- **Controller**: A class annotated with `@Controller` or `@RestController` in Spring MVC that handles incoming web requests, typically associated with specific URL routes, and returns responses.

- **Spring Security**: A comprehensive security framework that provides authentication, authorization, and other security-related features for Java applications, commonly used with Spring Boot.

- **Spring Data JPA**: A part of Spring Data that simplifies the use of JPA (Java Persistence API) for database operations, providing abstractions like repositories to handle common data access patterns.

- **Actuator**: A Spring Boot feature that exposes operational information about the application, such as health status, metrics, and environment details, typically used for monitoring.

- **Java**: A high-level programming language and platform used for developing Spring applications. It’s known for its portability, object-oriented design, and widespread use in enterprise environments.

- **Gradle**: An alternative build automation tool to Maven, commonly used with Spring Boot projects for managing dependencies and automating tasks like compiling code and packaging applications.

- **REST**: A web service architectural style used in Spring applications to build scalable and stateless web services by adhering to HTTP principles like GET, POST, PUT, and DELETE.

- **Thymeleaf**: A server-side Java template engine often used with Spring MVC for rendering HTML views. It integrates easily with Spring to dynamically generate web pages.

- **Spring AOP (Aspect-Oriented Programming)**: A programming paradigm in Spring that allows for separation of cross-cutting concerns, such as logging and security, by applying behaviors to objects at runtime.

- **Transactional**: A Spring annotation that ensures a method runs within a database transaction, helping to ensure data consistency and providing rollback mechanisms in case of failure.








   
