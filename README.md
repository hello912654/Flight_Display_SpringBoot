# Flight Information Display System

This is a Spring Boot-based web application for displaying flight and baggage information using the MVC (Model-View-Controller) pattern. It retrieves flight data from a SQL Server database and presents it through a responsive web interface using Thymeleaf and Bootstrap.

## Features

* View a list of flights with core information such as flight number, origin, destination, and scheduled times.
* Backend controller and service structure with JPA-based data access.
* Frontend developed with Thymeleaf template engine and styled using Bootstrap.
* Connected to a SQL Server database.

## Tech Stack

* Spring MVC
* Spring Data JPA
* Thymeleaf
* SQL Server (via JDBC)
* Bootstrap 4

## Application Architecture

### Controller

`FlightController` handles GET requests for `/flights`, retrieves flight data through `FlightService`, and passes it to the `flights.html` view.

### Service

`FlightService` defines a method `getAllFlights()` that is implemented in a service class which uses `FlightRepository` to fetch all flight records from the database.

### Repository

`FlightRepository` extends `JpaRepository` for basic CRUD operations on the `Flight` entity.

### Model

`Flight` is a JPA entity mapped to the `flight` table with fields such as `flight_no`, `flight_from`, `std`, `sta`, etc.

### View

The `flights.html` page uses Thymeleaf to iterate over the list of flights and display them in a responsive HTML table.

## How to Run

1. **Configure Database Connection**
   In `application.properties`:

   ```
   spring.datasource.url=jdbc:sqlserver://<your-host>\\SQLEXPRESS;databaseName=brs;encrypt=false
   spring.datasource.username=your_db_user
   spring.datasource.password=your_db_password
   spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver
   spring.jpa.hibernate.ddl-auto=none
   ```

2. **Start the Application**
   Run the `DemoApplication` main class from your IDE or use:

   ```bash
   ./mvnw spring-boot:run
   ```

3. **Access the Web Interface**
   Open your browser and go to:

   ```
   http://localhost:8080/flights
   ```

## Project Structure

```
src/
 └── main/
     ├── java/
     │    └── com.example.demo/
     │         ├── controllers/         # Contains FlightController
     │         ├── models/              # Contains Flight entity
     │         ├── repositories/        # Contains FlightRepository
     │         └── services/            # FlightService interface & implementation
     └── resources/
          ├── templates/                # Thymeleaf HTML templates (flights.html)
          └── application.properties    # Database and JPA configuration
```


