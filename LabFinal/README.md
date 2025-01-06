# Energy Saving System

This repository contains the implementation of an **Energy Saving System** project, built using **Java Spring Boot** with a **Microservices Architecture**. The project consists of two independent microservices:

1. **Control Lights**: Handles light control, events, and automation.

---

## Features

### **User Service**
- **User Management**: CRUD operations for users.
- **Event Requests**: Allow users to request light control events.
- **Email Notifications**: Send alerts and notifications to users.

### **Control Lights Service**
- **Toggle Light Status**: Enable or disable lights.
- **Light Event Management**: Process and log light-related events.
- **Send Alerts**: Notify users about status changes.

Both services have independent databases and are designed to be loosely coupled.

---

## Requirements

1. **Java**: JDK 17 or later
2. **Maven**: Build automation tool
3. **MySQL**: Relational database for both services
4. **Postman** (or cURL): For testing endpoints
5. **Git**: For cloning this repository
6. **Docker** *(optional)*: For containerization

---

## Folder Structure

```
energy-saving-system/
|-- user-service/
|   |-- src/
|   |-- pom.xml
|   |-- README.md
|-- control-lights-service/
|   |-- src/
|   |-- pom.xml
|   |-- README.md
```

Each microservice has its own independent folder, build configuration, and database setup.

---

## Setup Instructions

### **1. Clone the Repository**

```bash
git clone https://github.com/your-username/energy-saving-system.git
cd energy-saving-system
```

### **2. User Service Setup**

#### Configure Database
1. Ensure MySQL is installed and running.
2. Create a database for the user service:
   ```sql
   CREATE DATABASE user_service_db;
   ```
3. Update the `application.properties` file in `user-service/src/main/resources/`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/user_service_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
   server.port=8080
   ```

#### Build and Run
Navigate to the `user-service/` folder and execute:
```bash
mvn clean install
mvn spring-boot:run
```

The User Service will run on `http://localhost:8080`.

---

### **3. Control Lights Service Setup**

#### Configure Database
1. Create a database for the control lights service:
   ```sql
   CREATE DATABASE control_lights_db;
   ```
2. Update the `application.properties` file in `control-lights-service/src/main/resources/`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/control_lights_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
   server.port=8081
   ```

#### Build and Run
Navigate to the `control-lights-service/` folder and execute:
```bash
mvn clean install
mvn spring-boot:run
```

The Control Lights Service will run on `http://localhost:8081`.

---

## API Endpoints

### **User Service**
1. **Create User**:  
   - **URL**: `POST /api/users`  
   - **Body**:  
     ```json
     {
       "name": "John Doe",
       "email": "john@example.com"
     }
     ```
   - **Response**:  
     ```json
     {
       "userId": 1,
       "name": "John Doe",
       "email": "john@example.com"
     }
     ```

2. **Send Event Request**:  
   - **URL**: `POST /api/event-requests`  
   - **Body**:  
     ```json
     {
       "userId": 1,
       "windowId": "WIN123",
       "message": "Requesting light control"
     }
     ```
   - **Response**:  
     ```json
     {
       "eventRequestId": 1,
       "status": "SUCCESS"
     }
     ```

---

### **Control Lights Service**
1. **Toggle Light Status**:  
   - **URL**: `PUT /api/lights/{id}/toggle?status={true|false}`  
   - **Response**:  
     ```json
     {
       "lightId": 1,
       "status": true
     }
     ```

2. **Process Light Event**:  
   - **URL**: `POST /api/light-events`  
   - **Body**:  
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

---

## Testing

1. Use **Postman** or **cURL** to test the above endpoints.
2. Verify database entries in `user_service_db` and `control_lights_db` using a MySQL client.

---

## Future Enhancements
- Implement a **gateway service** for unified API access.
- Add **Docker Compose** for easier deployment.
- Integrate **RabbitMQ** or **Kafka** for inter-service communication.

---

## Contributing

1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Submit a pull request.

---

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

---

## Acknowledgments

Thanks to everyone who contributed to this project. Special thanks to our team members and mentors.

---

Let me know if this covers all necessary details or if you need further additions or changes!
