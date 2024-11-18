# University Transport System

This project implements a **transportation system** for commuting to a university, utilizing different transport modes: **Public Transport**, **Own Convenience**, and **University TSP**. The system uses **GRASP principles**, **Observer pattern**, **Pipe and Filter architecture**, and **Layered Architecture** to design and manage transport options and notify users of changes.

## Features

- **Different transport modes**: Public Transport, Own Convenience, and University TSP with varying constraints.
- **Observer pattern**: Notifies users when transport data changes (e.g., cost, schedule, or constraints).
- **Pipe and Filter architecture**: Processes transport data through filters to apply constraints, schedule, and cost calculations.
- **Layered architecture**: Clear separation of UI, Domain, and Data Access layers for better maintainability.

## Architecture

### 1. **Layered Architecture**
The system is divided into the following layers:
- **UI Layer**: The front-end layer where users interact with the system and select transportation modes.
- **Domain Layer**: Contains the business logic and processes transportation data, applying filters and notifying observers.
- **Data Access Layer (DAL)**: Responsible for handling data sources and managing transport-related information (not fully implemented in this example, but can be extended).

### 2. **GRASP Principles**
This project applies the **General Responsibility Assignment Software Patterns (GRASP)**, especially focusing on:
- **Controller**: The Transport System handles the core logic and user interaction.
- **Observer**: The system notifies registered users (observers) of changes in transport modes (cost, schedule, constraints).
  
### 3. **Observer Pattern**
When a user selects a transport mode (e.g., Public Transport), they will be notified with the details of the mode (schedule, cost, constraints). Multiple observers (users) can subscribe to receive updates.

### 4. **Pipe and Filter Architecture**
Filters are used to process the transport data, which may include scheduling, cost calculation, and applying any constraints (e.g., timing restrictions). Each transport mode (Public Transport, Own Convenience, University TSP) can be treated as a filter in this architecture.


## How to Run

### Prerequisites:
- Java 8 or later
- Any Java IDE (e.g., IntelliJ IDEA, NetBeans, Eclipse)
- Java Swing library (for GUI)

### Steps:
1. Clone or download the repository.
2. Open the project in your preferred Java IDE.
3. Compile and run the `Main.java` class.
4. The application window will appear. You can select your preferred transport mode from the UI.
5. Momin and Ali (as observers) will receive notifications when any transport details are updated.

### Example Usage:
1. Select **Public Transport**: Momin and Ali will receive notifications about the schedule, cost, and constraints.
2. Select **Own Convenience**: The system will display different details and notify the observers.
3. Select **University TSP**: The system applies advance payment and timing restrictions.

## Contributing

Feel free to contribute to the project! Fork the repository, make changes, and submit a pull request.

## License

This project is licensed under the MIT License.


