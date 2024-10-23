# Payment Processing System

## Overview
Demonstrates the Strategy Pattern for handling multiple payment methods (credit card, PayPal, cryptocurrency).

## Structure
- `PaymentStrategy`: Interface for payment processing.
- `CreditCardPayment`, `PayPalPayment`, `CryptoPayment`: Concrete payment strategies.
- `ShoppingCart`: Uses payment strategies and allows runtime changes.
- `Main`: Demonstrates different payment methods.

## How to Run
Compile all `.java` files and run `Main`.
# Weather Monitoring System

## Overview
Implements the Observer Pattern for a weather station that notifies display devices of weather updates.

## Structure
- `WeatherStation`: Subject that updates and notifies observers.
- `WeatherDisplay`: Observer interface for display updates.
- `CurrentDisplay`, `StatsDisplay`, `ForecastDisplay`: Concrete observers.
- `WeatherData`: Manages weather updates and displays.
- `Main`: Demonstrates observer functionality.

## How to Run
Compile all `.java` files and run `Main`.
# Remote Control System

## Overview
Demonstrates the Command Pattern for operating smart home devices like TV, stereo, and lights.

## Structure
- `Command`: Interface for command execution and undo.
- `TurnTVOn`, `SetVolume`, `DimLights`: Concrete commands.
- `TV`, `Stereo`, `Light`: Receiver classes for smart devices.
- `RemoteControl`: Manages command slots and undo.
- `Main`: Demonstrates command functionality.

## How to Rund
Compile all `.java` files and run `Main`.
# Order Processing System

## Overview
Implements the State Pattern for managing an order's lifecycle (New, Paid, Shipped, Delivered, Cancelled).

## Structure
- `State`: Interface for order actions.
- `NewState`, `PaidState`, `ShippedState`, `DeliveredState`, `CancelledState`: Concrete states.
- `Order`: Maintains the current state and delegates actions.
- `Main`: Demonstrates order processing scenarios.

## How to Run
Compile all `.java` files and run `Main`.
# Expense Approval System

## Overview
Demonstrates the Chain of Responsibility Pattern for processing expense requests through approvers.

## Structure
- `Approver`: Base class for handling requests.
- `TeamLead`, `Manager`, `Director`, `CEO`: Concrete approvers.
- `ExpenseRequest`: Contains expense details.
- `ApprovalChain`: Manages the chain of approvers.
- `Main`: Demonstrates expense approval scenarios.

## How to Run
Compile all `.java` files and run `Main`.
# Chat Room Application

## Overview
Implements the Mediator Pattern for facilitating communication between users in a chat room.

## Structure
- `ChatMediator`: Interface for message sending and user management.
- `ChatRoom`: Concrete mediator that handles messages.
- `User`: Abstract class for chat users.
- `RegularUser`, `PremiumUser`: Concrete user classes.
- `Main`: Demonstrates chat functionality.

## How to Run
Compile all `.java` files and run `Main`.
# Document Version Control System

## Overview
Demonstrates the Memento Pattern for saving and restoring document versions.

## Structure
- `Document`: Manages content and mementos.
- `DocumentVersion`: Memento storing document state.
- `VersionControl`: Manages document versions.
- `Main`: Demonstrates version control functionality.

## How to Run
Compile all `.java` files and run `Main`.
# Shape Area Calculator

## Overview
Implements the Visitor Pattern for calculating areas of different shapes.

## Structure
- `Shape`: Interface for accepting visitors.
- `Circle`, `Rectangle`, `Triangle`: Concrete shape classes.
- `Visitor`: Interface for area calculation.
- `AreaCalculator`: Concrete visitor for area calculations.
- `Drawing`: Holds shapes and demonstrates area calculation.

## How to Run
Compile all `.java` files and run `Main`.
# Report Generation System

## Overview
Demonstrates the Template Method Pattern for generating various report types.

## Structure
- `ReportGenerator`: Abstract class with a template method.
- `PDFReportGenerator`, `HTMLReportGenerator`: Concrete report generators.
- `ReportingSystem`: Uses report generators.
- `Main`: Demonstrates report generation.

## How to Run
Compile all `.java` files and run `Main`.
# Playlist Management System

## Overview
Implements the Iterator Pattern for managing and traversing songs in a playlist.

## Structure
- `Playlist`: Stores songs and provides iterator methods.
- `Song`: Represents a song object.
- `Iterator`: Interface for song iteration.
- `SeqIter`, `ShuffleIter`, `GenreIter`: Concrete iterators.
- `Main`: Demonstrates playlist functionality.

## How to Run
Compile all `.java` files and run `Main`.
  
