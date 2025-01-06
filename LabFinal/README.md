# Control Lights Service

This repository contains the implementation of a **Control Lights Service** microservice built with **Java Spring Boot** as part of an energy-saving system project. This microservice focuses on managing lights, their status, and related events.

---

## Features
- **Toggle Light Status**: Enable or disable lights.
- **Light Event Management**: Process light-related events.
- **Send Alerts**: Notify users about status changes.
- **Database Integration**: MySQL database to persist light and event data.

---

## Requirements

1. **Java**: JDK 17 or later
2. **Maven**: Build automation tool
3. **MySQL**: Relational database for data persistence
4. **Postman** (or cURL): For testing endpoints
5. **Git**: For cloning this repository

---

## Folder Structure

```
control-lights-service/
|-- src/
|   |-- main/
|   |   |-- java/
|   |   |   |-- com.example.controllights/
|   |   |   |   |-- controller/
|   |   |   |   |   |-- LightController.java
|   |   |   |   |   |-- HomeAutomationController.java
|   |   |   |   |-- model/
|   |   |   |   |   |-- Light.java
|   |   |   |   |   |-- LightEvent.java
|   |   |   |   |   |-- HomeAutomationSystem.java
|   |   |   |   |-- service/
|   |   |   |   |   |-- LightService.java
|   |   |   |   |   |-- LightEventService.java
|   |   |   |   |   |-- HomeAutomationService.java
|   |   |   |-- repository/
|   |   |   |   |   |-- LightRepository.java
|   |   |   |   |   |-- LightEventRepository.java
|   |   |-- resources/
|   |   |   |-- application.properties
|   |-- test/
|-- pom.xml
|-- README.md
```

---

## Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/control-lights-service.git
cd control-lights-service
```

### 2. Configure Database

1. Ensure MySQL is installed and running.
2. Create a database named `control_lights_db`:
   ```sql
   CREATE DATABASE control_lights_db;
   ```
3. Update `src/main/resources/application.properties` with your MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/control_lights_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
   server.port=8081
   ```
   Replace `your_password` with your MySQL password.

### 3. Build the Application

Use Maven to build the project:
```bash
mvn clean install
```

### 4. Run the Application

Start the Spring Boot application:
```bash
mvn spring-boot:run
```

The service will run on `http://localhost:8081/`.

---

## API Endpoints

### **1. Toggle Light Status**
- **URL**: `PUT /api/lights/{id}/toggle?status={true|false}`
- **Method**: `PUT`
- **Description**: Toggle the status of a light.
- **Response**:
  ```json
  {
    "lightId": 1,
    "status": true
  }
  ```

### **2. Process Light Event**
- **URL**: `POST /api/light-events`
- **Method**: `POST`
- **Description**: Create and process a new light event.
- **Request Body**:
  ```json
  {
    "lightController": {
      "lightId": 1,
      "status": true
    }
  }
  ```
- **Response**:
  ```json
  {
    "eventId": 1,
    "lightController": {
      "lightId": 1,
      "status": true
    }
  }
  ```

### **3. Send Alert**
- **URL**: `POST /api/home-automation/send-alert`
- **Method**: `POST`
- **Description**: Send an alert related to home automation.
- **Request Body**:
  ```json
  {
    "systemId": 1,
    "location": "Living Room"
  }
  ```
- **Response**:
  ```json
  {
    "systemId": 1,
    "location": "Living Room"
  }
  ```

---

## Testing the Service

1. Use **Postman** or **cURL** to test the above endpoints.
2. Verify data persistence in the `control_lights_db` database using a MySQL client.

---

## Contributing

Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Submit a pull request.

---

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

---

## Acknowledgments
Special thanks to all contributors and collaborators who made this project possible.

