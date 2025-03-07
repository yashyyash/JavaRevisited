Sure! Let's dive into **Method Overriding** vs **Method Overloading** in Java with examples and key differences.

---

### 🔥 Method Overriding vs Method Overloading in Java

| Feature                 | Method Overriding               | Method Overloading            |
|------------------------|--------------------------------|--------------------------------|
| Definition             | When a child class provides its own version of a method that is already defined in the parent class. | When multiple methods in the same class have the same name but different parameter lists (type, number, or both). |
| Purpose               | Achieve **Runtime Polymorphism** | Achieve **Compile-Time Polymorphism** |
| Class Involvement      | Happens between **Parent & Child classes** | Happens in the **Same Class** |
| Method Signature       | Method name and parameters must be **exactly the same** | Method name is the same, but parameters must be **different** |
| Access Modifiers       | Cannot have a more restrictive access modifier (like private → protected) | Can have any access modifier |
| Static Methods         | Static methods **cannot** be overridden | Static methods **can** be overloaded |
| Final Methods          | Final methods **cannot** be overridden | Final methods **can** be overloaded |
| Performance            | Slower (Runtime Decision) | Faster (Compile-Time Decision) |
| Return Type (from Java 5) | Can have **Covariant Return Type** (same or subclass return type) | Must have **same return type** or different methods |

---

### 1. What is Method Overloading?
**Method Overloading** allows a class to have multiple methods with the same name but different parameter lists.

✅ **Example:**
```java
class Calculator {
    // Method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded Method with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded Method with double type parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class Test {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));        // Calls int add(int, int)
        System.out.println(calc.add(10, 20, 30));    // Calls int add(int, int, int)
        System.out.println(calc.add(10.5, 20.5));    // Calls double add(double, double)
    }
}
```
---

### 2. What is Method Overriding?
**Method Overriding** allows the child class to provide a specific implementation of a method that is already defined in the parent class.

✅ **Example:**
```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {  // Overriding the parent method
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal obj = new Dog();  // Upcasting
        obj.sound();            // Dog barks (Overridden method)
    }
}
```
---

### 💪 Important Rules for Overriding:
- Method name and parameters must be **identical**.
- Access modifier **cannot be more restrictive**.
- Return type can be **Covariant** (subclass of parent method return type).
- Static methods and final methods **cannot** be overridden.
- Private methods **cannot** be overridden.

---

### 🔑 When to Use What?
| Scenario                  | Use |
|----------------------------|-----|
| Multiple behaviors with different inputs | **Method Overloading** |
| Same behavior with different implementation in child classes | **Method Overriding** |
| Polymorphism in Inheritance | **Method Overriding** |
| Improving code readability and flexibility | **Method Overloading** |

---

### 🔥 Quick Tip
Always use **@Override** annotation to avoid mistakes while overriding methods.

---

Would you like a **real-life example** of Overloading vs Overriding or a small **practice exercise**?