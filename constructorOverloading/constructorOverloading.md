### Java Constructors Notes

#### What is a Constructor?
A **constructor** in Java is a special method that is automatically called when an object of the class is created. It is used to initialize objects.

##### Syntax:
```java
class ClassName {
    ClassName() {
        // constructor body
    }
}
```

### Types of Constructors
Java constructors are divided into three types:
1. **No-Arg Constructor**
2. **Parameterized Constructor**
3. **Default Constructor**

---

### 1. No-Arg Constructor
A constructor that does not accept any parameters.

##### Example:
```java
class Example {
    int x;

    // No-Arg Constructor
    Example() {
        x = 10;
        System.out.println("No-Arg Constructor Called");
    }

    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println("Value of x: " + obj.x);
    }
}
```
**Output:**
```
No-Arg Constructor Called
Value of x: 10
```

---

### 2. Parameterized Constructor
A constructor that accepts parameters to initialize the object with specific values.

##### Example:
```java
class Example {
    String name;

    // Parameterized Constructor
    Example(String n) {
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Example obj = new Example("John");
        obj.display();
    }
}
```
**Output:**
```
Name: John
```

---

### 3. Default Constructor
If no constructor is defined, the Java compiler automatically creates a **default constructor** during runtime.

##### Example:
```java
class Example {
    int a;
    boolean b;

    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}
```
**Output:**
```
a = 0
b = false
```

---

### Constructor Overloading
Java allows constructors to be overloaded by defining multiple constructors with different parameter lists.

##### Example:
```java
class Example {
    String language;

    // No-Arg Constructor
    Example() {
        language = "Java";
    }

    // Parameterized Constructor
    Example(String lang) {
        language = lang;
    }

    void display() {
        System.out.println("Programming Language: " + language);
    }

    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example("Python");

        obj1.display();
        obj2.display();
    }
}
```
**Output:**
```
Programming Language: Java
Programming Language: Python
```

---

### Important Notes
- Constructors **do not have a return type**.
- A constructor's name **must be the same** as the class name.
- Constructors are automatically called when an object is created.
- A class can have **multiple constructors** (Constructor Overloading).
- Constructors can be **public, private, or protected**.
- Private constructors are used in **Singleton Design Patterns**.

---

### Differences between Constructor and Method
| Constructor            | Method                |
|-----------------------|---------------------|
| Automatically called   | Called explicitly   |
| No return type        | Must have a return type |
| Used to initialize objects | Used to perform operations |
| Name must match class name | Name can be any valid identifier |

---

### Conclusion
Important Notes on Java Constructors
Constructors are invoked implicitly when you instantiate objects.
The two rules for creating a constructor are:
1. The name of the constructor should be the same as the class.
2. A Java constructor must not have a return type.
3. If a class doesn't have a constructor, the Java compiler automatically creates a default constructor during run-time. 
4. The default constructor initializes instance variables with default values. For example, the int variable will be initialized to 0

### Constructor types:
- No-Arg Constructor - a constructor that does not accept any arguments
- Parameterized constructor - a constructor that accepts arguments
- Default Constructor - a constructor that is automatically created by the Java compiler if it is not explicitly defined.
- A constructor cannot be abstract or static or final.
- A constructor can be overloaded but can not be overridden.
