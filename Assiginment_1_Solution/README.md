# Home Automation System

This project is a Java-based Home Automation System that allows users to manage and control lights in different rooms using an intuitive GUI built with Swing. The system follows a layered architecture and incorporates design principles to ensure scalability and maintainability.

## Table of Contents
- [Visual Explnation](#overview)
- [Overview](#overview)
- [Features](#features)
- [Architecture](#architecture)
- [GRASP and SOLID Principles](#grasp-and-solid-principles)
- [UML Diagrams](#uml-diagrams)
- [Code Structure](#code-structure)
- [Getting Started](#getting-started)
- [Future Enhancements](#future-enhancements)
- [Author](#author)
## Visual Explanation

https://github.com/user-attachments/assets/2faee981-f12b-41eb-9dc3-b6881265ad8b

## Overview
The Home Automation System allows users to:
- Turn lights on or off.
- Adjust the brightness of lights using sliders.
- Use master controls to operate all lights simultaneously.
- Schedule lights to turn on or off using a timer feature.

## Features
- **Individual Light Control**: Users can control each light independently, adjusting its brightness and toggling its on/off status.
- **Master Controls**: Manage all lights at once, either turning them on/off or adjusting their brightness.
- **Timer Functionality**: Set timers to automatically switch lights on or off.

## Architecture
The system is built using a three-layer architecture:
- **Model Layer**: Contains the `House` and `Light` classes, which manage the state and properties of the lights.
- **GUI Layer**: Implements the user interface using Java Swing components in the `Gui` class.
- **Controller Logic**: Embedded in the `Gui` class, handling user actions and updating the model accordingly.

## GRASP and SOLID Principles
### GRASP Principles
- **Indirection**: The `Gui` class serves as an intermediary between the user interface and the model, decoupling the components.
- **Controller**: The `Gui` class acts as a controller, managing user input and coordinating the system's behavior.
- **Creator**: The `House` class is responsible for creating and managing `Light` objects.

### SOLID Principles
- **Single Responsibility Principle (SRP)**: Each class has a distinct responsibility, like `Light` managing light properties and `Gui` handling the GUI.
- **Open/Closed Principle (OCP)**: The design is open for extension, such as adding new features, without modifying existing classes.
- **Liskov Substitution Principle (LSP)**: Future subclasses of `Light` should seamlessly integrate with the existing system.
- **Interface Segregation Principle (ISP)**: If interfaces were to be introduced, each would define only necessary methods, ensuring classes do not implement unused methods.
- **Dependency Inversion Principle (DIP)**: The system promotes abstraction by having higher-level modules depend on abstractions rather than concrete implementations.

## UML Diagrams
The project includes various UML diagrams:
1. **Use Case Diagram**: Illustrates user interactions with the system.
2. **Class Diagram**: Shows the relationship between classes, such as `House`, `Light`, and `Gui`.
3. **Package Diagram**: Demonstrates the organization of classes into packages for better modularity.
4. **System Sequence Diagram**: Details the sequence of operations when a user interacts with the system.
5. **Communication Diagram**: Explains how objects communicate to fulfill user actions.

## Code Structure
- **model**
  - `House.java`: Manages the collection of lights.
  - `Light.java`: Represents a light object with properties like status and dim value.
- **gui**
  - `Gui.java`: Handles the graphical user interface and event management.

## Getting Started
To run this project:
1. Clone the repository: `git clone <repository-url>`
2. Open the project in an IDE like IntelliJ or NetBeans.
3. Make sure to have Java Development Kit (JDK) installed.
4. Run `Gui.java` to launch the Home Automation System.

## Future Enhancements
- **Add More Appliances**: Extend the system to control more devices like fans, thermostats, or smart locks.
- **Voice Control**: Implement voice commands for easier control.
- **Mobile App**: Develop a mobile interface for remote access.

## Author
- **Abdul Momin** (FA22-BSE-006, COMSATS University Islamabad)


