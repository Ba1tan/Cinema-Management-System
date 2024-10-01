Cinema Management System
Overview
The Cinema Management System is a Java project demonstrating the use of creational design patterns including Singleton, Factory Method, Abstract Factory, Builder, and Prototype. The system manages cinema operations like movie creation, ticket booking, movie scheduling, and UI generation.

This project is divided into packages for each major component, making it modular and easier to maintain.

Design Patterns Implemented
1. Singleton Pattern: Cinema Configuration
Ensures that only one instance of the CinemaConfig class exists globally to manage cinema settings like the cinema name and operating hours.
2. Factory Method Pattern: Movie Creation
Allows the creation of different types of movies (e.g., Regular, IMAX) using MovieFactory classes.
3. Abstract Factory Pattern: User Interface Generation
Provides a consistent way to generate themed user interfaces using DarkThemeFactory and LightThemeFactory classes.
4. Builder Pattern: Ticket Booking
Simplifies the creation of complex ticket bookings with a TicketBookingBuilder class that allows step-by-step configuration (movie, seat, snack combo, etc.).
5. Prototype Pattern: Movie Schedule
Uses the Prototype pattern to clone movie schedules, enabling easy modification of screening times and movies without affecting the original schedule.
Key Features
Singleton Pattern: Ensures global configuration for the cinema system.
Factory Method Pattern: Enables flexible movie creation based on different types.
Abstract Factory Pattern: Facilitates switching between UI themes (e.g., Dark and Light themes).
Builder Pattern: Simplifies complex ticket bookings with various options.
Prototype Pattern: Allows easy cloning of movie schedules for different screening times.
