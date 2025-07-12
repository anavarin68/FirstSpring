# FirstSpring

This is a demo Spring Boot project generated using [Spring Initializr](https://start.spring.io/). It includes basic dependencies for building RESTful web applications and persisting data in a MySQL database using JPA (Hibernate).

## Project Structure

- **Language**: Java
- **Build Tool**: Maven
- **Spring Boot Version**: 3.5.3
- **Java Version**: 17
- **Packaging**: JAR

## Dependencies Used

- **Spring Web** – For creating REST APIs.
- **Spring Data JPA** – For database interaction using Java Persistence API.
- **MySQL Driver** – For MySQL database connectivity.

## How to Add Dependencies (Step-by-step)

You can add dependencies while creating the project at [start.spring.io](https://start.spring.io/), or later by editing your `pom.xml`.

### 📦 Adding Dependencies via Spring Initializr (used in this project)

1. Go to [https://start.spring.io/](https://start.spring.io/)
2. Select:
   - **Project**: Maven
   - **Language**: Java
   - **Spring Boot Version**: 3.5.3
   - **Group**: `com.example`
   - **Artifact**: `FirstSpring`
   - **Name**: `FirstSpring`
   - **Description**: `Demo project for Spring Boot`
   - **Package name**: `com.example.FirstSpring`
   - **Packaging**: Jar
   - **Java Version**: 17
3. Click **Add Dependencies** and include:
   - `Spring Web`
   - `Spring Data JPA`
   - `MySQL Driver`
4. Click **Generate**, and a `.zip` file will be downloaded.
5. Extract the `.zip` and import it into your IDE (Eclipse/IntelliJ).

### ⚙️ Adding Dependencies Manually in `pom.xml`

If you're updating the project later, open the `pom.xml` file and add the following:

```xml
<dependencies>
    <!-- Spring Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- MySQL Driver -->
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>
</dependencies>
