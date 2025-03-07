### ✅ **Constructor Overloading in Java**
**Constructor Overloading** in Java is a technique where a class can have **multiple constructors** with the **same name** but with **different parameter lists**.

It allows objects to be initialized in **different ways**.

---

### 🔑 Key Points:
1. Constructors must have the **same name** as the class name.
2. They differ by:
   - Number of parameters
   - Data type of parameters
   - Order of parameters
3. **Return type is not allowed** in constructors.
4. It is an example of **Compile-Time Polymorphism**.

---

### 🎯 Example of Constructor Overloading
```java
class Person {
    String name;
    int age;

    // Constructor with no parameter
    Person() {
        System.out.println("Default Constructor Called");
    }

    // Constructor with one parameter
    Person(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    // Constructor with two parameters
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();              // Default Constructor
        Person p2 = new Person("Yash");        // One Parameter Constructor
        Person p3 = new Person("Yash", 25);    // Two Parameter Constructor
    }
}
```

---

### ✅ Output:
```
Default Constructor Called
Name: Yash
Name: Yash, Age: 25
```

---

### 🔥 How it Works:
| Constructor | Parameters      | Call                  |
|-------------|---------------|---------------------|
| Person()    | No parameters  | `new Person()`      |
| Person(String) | One String    | `new Person("Yash")` |
| Person(String, int) | String, int | `new Person("Yash", 25)` |

---

### 🎓 Why Constructor Overloading?
- Increases code reusability.
- Allows object creation in **different ways**.
- Makes the code more readable.

---

### 🚨 Important Notes:
- Java **does not allow constructor overloading** by changing the **return type**.
- Constructors are called automatically at the time of **object creation**.

---

Would you like to see **constructor chaining** or **practice questions** on constructor overloading? 📌