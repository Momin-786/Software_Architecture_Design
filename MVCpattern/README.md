# MVC Implementation 

This repository includes the Model-View-Controller (MVC) pattern with three implementations:

1. GeneralMVC - A basic implementation that can be compiled and executed using the command line.
2. CarMVC - A slightly advanced implementation that can be executed in VS code.
3. spbootCAR - Spring Boot example of car object.
   
# Car MVC Project

## Project Overview  
This project demonstrates a simple implementation of the **Model-View-Controller (MVC)** design pattern using a `Car` object. The project is structured into `model`, `view`, and `controller` packages and showcases the separation of concerns in MVC.

Additionally, the project is implemented using **Spring Boot**, a popular MVC framework in Java, for a more practical, web-based demonstration.

---

## Features  
- **Car attributes:** brand, model, year, color, engine type, price.  
- Displays car details in the console (Java SE implementation).  
- Web-based implementation using Spring Boot.

---

## Prerequisites  
To run this project, ensure you have the following installed:  
1. **Java Development Kit (JDK) 17** or later  
2. **Maven** (for dependency management)  
3. **Spring Boot CLI** or an IDE like IntelliJ IDEA or Eclipse  

---

## Instructions  

### 1. Java SE (Basic Console) Implementation  
1. **Clone the repository:**  
   ```bash
   git clone https://github.com/yourusername/MVC-Labs.git
   ```

2. **Navigate to the project directory and compile the code:**  
   ```bash
   cd MVC-Labs
   javac Main.java
   ```

3. **Run the project:**  
   ```bash
   java Main
   ```

4. **Expected Output:**  
   ```yaml
   Car Details:
   Brand: Tesla
   Model: Model S
   Year: 2022
   Color: Red
   Engine Type: Electric
   Price: $79999.99
   ```

---

### 2. Spring Boot Implementation  

1. **Add Dependencies**  
   Ensure your `pom.xml` contains the following dependencies:  
   ```xml
   <dependencies>
       <dependency>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-starter-web</artifactId>
       </dependency>
   </dependencies>
   ```

2. **Create Car Entity**  
   Implement the `CarController` class in the `controller` package:  
   ```java
   @RestController
   @RequestMapping("/car")
   public class CarController {
       @GetMapping("/details")
       public Car getCarDetails() {
           return new Car("Tesla", "Model S", 2022, "Red", "Electric", 79999.99);
       }
   }
   ```

3. **Run the Application**  
   Use the following command:  
   ```bash
   mvn spring-boot:run
   ```

4. **Access the Application**  
   Open a browser and go to:  
   [http://localhost:8080/car/details](http://localhost:8080/car/details)

5. **Expected Output (JSON Format):**  
   ```json
   {
       "brand": "Tesla",
       "model": "Model S",
       "year": 2022,
       "color": "Red",
       "engineType": "Electric",
       "price": 79999.99
   }
   ```

---

## License  
This project is licensed under the **MIT License**.  

---

