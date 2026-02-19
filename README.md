# Java Programming Repository 📚

A comprehensive collection of Java programs covering fundamental concepts, data structures, and Object-Oriented Programming principles. This repository serves as a learning resource and reference for Java developers.

## 📋 Table of Contents

- [Repository Structure](#repository-structure)
- [Topics Covered](#topics-covered)
- [Getting Started](#getting-started)
- [Directory Details](#directory-details)
- [Resources](#resources)
- [Contributing](#contributing)

## 🗂️ Repository Structure

```
JAVA/
├── Basic/                    # Fundamental Java concepts
├── Linked List/             # Linked list implementations and operations
├── OOP/                     # Object-Oriented Programming concepts
├── Stack/                   # Stack data structure and applications
├── JavaOneShotPart1.pdf    # Reference material (Part 1)
└── JavaOneShotPart2.pdf    # Reference material (Part 2)
```

## 🎯 Topics Covered

### 1. **Basic Java Fundamentals** (`/Basic`)

The Basic directory contains introductory Java programs covering:

- **Hello World & Output**
  - `Basics.java` - Basic print statements and output formatting
  
- **Variables and Data Types**
  - `variables.java` - Variable declaration and usage
  - `doubledatatype.java` - Working with double data type
  
- **User Input**
  - `TakeInput.java` - Scanner class and user input handling
  - `sumInputs.java` - Taking multiple inputs and performing operations
  
- **Arithmetic Operations**
  - `arithmetic.java` - Basic mathematical operations and string concatenation

**Key Concepts**: Print statements, variables, data types, Scanner class, arithmetic operations

---

### 2. **Linked List** (`/Linked List`)

Comprehensive implementation of linked list data structures:

- **Doubly Linked List**
  - `doublyLL.java` - Complete implementation with:
    - Display forward and reverse
    - Insert at head, tail, and specific index
    - Node navigation

- **List Operations**
  - `reverseList.java` - Recursive reversal of linked lists
  - `nthNodefromEnd.java` - Finding and deleting nth node from end
    - Two approaches: basic and two-pointer technique

**Key Algorithms**:
- Recursive display and reversal
- Two-pointer technique for nth node
- Dynamic insertion and deletion

---

### 3. **Object-Oriented Programming** (`/OOP`)

Complete coverage of OOP principles with practical examples:

#### Core OOP Concepts

**Encapsulation**
- `Encapsulation.java` - Data hiding and access control using getters/setters

**Inheritance**
- `Inheritance.java` - Parent-child class relationships
- `Vehicle.class`, `Car.class`, `Scooter.class` - Vehicle hierarchy example

**Polymorphism**
- `CompilePolymorphism.java` - Method overloading (compile-time polymorphism)
- `RuntimePolymorphism.java` - Method overriding (runtime polymorphism)
- `MethodOverloading.class` - Multiple method signatures

**Abstraction**
- `Abstraction.java` - Abstract classes and methods
- `Bank.class`, `SBI.class`, `HDFC.class`, `ICICI.class` - Banking system example

#### Advanced OOP Concepts

**Association**
- `association.java` - Has-A relationship demonstration
- `Dependency.java` - Dependency relationships between classes

**Practical Implementations**
- `Student.class` - Student management example
- `Account.class`, `Address.class` - Composite objects
- `Calculator.class`, `Printer.class` - Utility class examples

---

### 4. **Stack Data Structure** (`/Stack`)

Extensive coverage of stack operations and applications:

#### Stack Implementations

**Array-Based**
- `ArrayImplementationOfStack.java` - Stack using arrays
  - Push, pop, peek operations
  - Size and capacity management

**Linked List-Based**
- `LLImplementationOfStack.java` - Stack using linked list
  - Dynamic size
  - Node-based implementation

#### Basic Stack Operations

- `basics.java` - Introduction to Stack class
- `DisplayStack.java` - Different methods to display stack contents
- `InsertionInStack.java` - Inserting elements in stack
- `ReverseStack.java` - Reversing stack using recursion
- `moveStackInSameOrder.java` - Transferring stack while maintaining order

#### Stack Applications

**Expression Evaluation**
- `Infix.java` - Infix expression evaluation
- `PostfixEvaluation.java` - Postfix expression evaluation
- `PrefixEvaluation.java` - Prefix expression evaluation

**Expression Conversion**
- `InfixToPostfix.java` - Convert infix to postfix notation
- `InfixToPrefix.java` - Convert infix to prefix notation
- `PostfixToInfix.java` - Convert postfix to infix notation
- `PostfixToPrefix.java` - Convert postfix to prefix notation
- `PrefixToInfix.java` - Convert prefix to infix notation
- `PrefixToPostfix.java` - Convert prefix to postfix notation

**Problem Solving**
- `BalancedParenthesis.java` - Check for balanced parentheses
- `NextGreaterElement.java` - Find next greater element in array
- `RemoveConsecutiveSubsequences.java` - Remove consecutive duplicate elements

#### Reference Materials
- `Stack L3.pdf` - Stack concepts lecture notes
- `Stacks 2 INTERVIEW.pdf` - Interview preparation material
- `Stacks L1.pdf` - Introductory stack concepts

---

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, VS Code) or text editor
- Basic understanding of programming concepts

### Running the Programs

1. **Clone the repository**
```bash
git clone https://github.com/Shraman008/JAVA.git
cd JAVA
```

2. **Compile a Java file**
```bash
javac Basic/Basics.java
```

3. **Run the compiled program**
```bash
java -cp Basic Basics
```

### Example: Running the TakeInput Program

```bash
# Navigate to Basic directory
cd Basic

# Compile
javac TakeInput.java

# Run
java TakeInput
```

---

## 📖 Directory Details

### Basic Directory
Contains foundational Java programs for beginners. Start here if you're new to Java.

**Learning Path**:
1. `Basics.java` - Understand output
2. `variables.java` - Learn variables
3. `TakeInput.java` - User input handling
4. `arithmetic.java` - Mathematical operations

### Linked List Directory
Implements various linked list operations with optimized algorithms.

**Highlights**:
- Doubly linked list with bidirectional traversal
- Efficient nth node from end using two-pointer technique
- Recursive operations

### OOP Directory
Comprehensive examples of all OOP principles with real-world scenarios.

**Key Features**:
- Banking system demonstrating abstraction
- Vehicle hierarchy showing inheritance
- Polymorphism examples (compile-time and runtime)

### Stack Directory
Complete stack implementation with practical applications.

**Notable Programs**:
- Multiple stack implementations (Array & Linked List)
- Expression conversions (6 different conversion types)
- Stack-based problem solving

---

## 📚 Resources

This repository includes PDF resources:
- `JavaOneShotPart1.pdf` - Comprehensive Java concepts (Part 1)
- `JavaOneShotPart2.pdf` - Advanced Java topics (Part 2)
- Stack tutorial PDFs in `/Stack` directory

---

## 🎓 Learning Outcomes

After working through this repository, you will:

✅ Understand Java syntax and fundamentals  
✅ Implement and manipulate linked lists  
✅ Apply OOP principles in real-world scenarios  
✅ Master stack data structure and its applications  
✅ Solve expression evaluation and conversion problems  
✅ Write clean, well-structured Java code  

---

## 💡 Best Practices Demonstrated

- Proper naming conventions (camelCase for methods/variables)
- Code organization in classes
- Use of static methods where appropriate
- Implementation of data structures from scratch
- Recursive and iterative approaches

---

## 🤝 Contributing

Contributions are welcome! Feel free to:
- Add new programs
- Improve existing code
- Fix bugs
- Enhance documentation

---

## 📧 Contact

**Repository Owner**: Shraman008  
**GitHub**: [https://github.com/Shraman008](https://github.com/Shraman008)

---

## 📝 Notes

- `.class` files are compiled bytecode (can be excluded from repository using `.gitignore`)
- `tempCodeRunnerFile.java` files are temporary and can be ignored
- All programs are standalone and can be run independently

---

## ⭐ Show Your Support

If you find this repository helpful, please consider giving it a star!

---

**Happy Coding! 🚀**
