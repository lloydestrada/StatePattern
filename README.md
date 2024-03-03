# Account Management System with State Pattern (Java)

##### Overview
A bank needs to manage different states of customer accounts: active, suspended, and closed. Each state imposes specific rules and restrictions on allowed operations, and accounts come with attributes like account number and balance.

- **Active accounts:** Allow deposits and withdrawals.
- **Suspended accounts:** Disallow deposits and withdrawals transactions but allow viewing account information.
- **Closed accounts:** Disallow all transactions and viewing of account information.

Currently, the system relies on conditional statements within the `Account` class to check the account state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.

##### State Pattern Implementation
To address this issue and enhance code maintainability and flexibility, the State pattern is implemented:

###### Account States
- Create separate classes representing different account states: `ActiveState`, `SuspendedState`, and `ClosedState`.

###### State Interface
- Define an interface `AccountState` with methods for common actions like deposit, withdraw, activate, suspend, and close.

###### State Behaviors
- Each concrete state class implements the `AccountState` interface, providing specific behavior for its respective state. For example, the `ActiveState` class allows deposits and withdrawals, while the `ClosedState` disallows any transactions.

###### Update Account Class
- Include attributes for `accountNumber` and `balance`.
- Remove state-specific logic from the `Account` class.
- Introduce a reference to the current `AccountState` object.
- Delegate actions like deposit, withdraw, activate, suspend, and close to the current state object through its corresponding methods.


# UML Diagram
![StatePatternDiagram](https://github.com/lloydestrada/StatePattern/assets/142376663/2643babe-1f98-4dfd-8a12-8f5f40c6bcde)

