# Home Automation System

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Architecture](#architecture)
- [GRASP Principles](#grasp-principles)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction
The Home Automation System is a simple Java application that allows users to control the status of lights in a home environment. It demonstrates the use of Object-Oriented Programming principles and GRASP (General Responsibility Assignment Software Patterns) principles to create a well-structured and maintainable system.

## Features
- Turn lights ON or OFF.
- Check the current status of the lights.
- User management (basic implementation).

## Architecture
The system is composed of the following classes:
- `HomeAutomationSystem`: Acts as the controller managing the light control flow.
- `LightController`: Responsible for managing the status of the lights.
- `User`: Represents a user of the system with a username and password.

## GRASP Principles
This project demonstrates the following GRASP principles:
1. **Controller**: The `HomeAutomationSystem` class manages the flow of control.
2. **Information Expert**: The `LightController` class contains the logic related to light management.
3. **Low Coupling**: The `User` class operates independently of the light management logic.
4. **Indirection**: The `HomeAutomationSystem` provides an interface between the user and the light control mechanisms.
5. **Creator**: The `HomeAutomationSystem` is responsible for creating instances of `LightController`.

## Installation
To run the Home Automation System, follow these steps:
1. Clone the repository
2. Navigate to the project directory:
   ```bash
   cd home-automation-system
   ```
3. Compile the Java files:
   ```bash
   javac Main.java
   ```

## Usage
Run the application by executing the `Main` class:
```bash
java Main
```
You will see the output indicating the status of the lights and control actions taken by the user.

## Contributing
Contributions are welcome! Please open an issue or submit a pull request if you have suggestions or improvements.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
```
