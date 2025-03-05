### ✅ Method Overloading in Java
**Method Overloading** is a feature in Java that allows a class to have **multiple methods with the same name** but with **different parameter lists (type, number, or order of parameters)**.

It increases the **readability** of the code and provides a way to perform the same kind of action in different ways.

---

### 🔑 Key Points:
1. Method name must be **the same**.
2. The method must differ by:
   - Number of parameters
   - Type of parameters
   - Order of parameters
3. Return type **does not play a role** in method overloading.
4. It is an example of **Compile-Time Polymorphism** (Static Binding).

---

### 📌 Example of Method Overloading
```java
class Calculator {
    // Method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with 2 double parameters
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println(calc.add(10, 20));       // Calls method with 2 int parameters
        System.out.println(calc.add(10, 20, 30));   // Calls method with 3 int parameters
        System.out.println(calc.add(10.5, 20.5));   // Calls method with 2 double parameters
    }
}
```
---

### 🎯 Output:
```
30
60
31.0
```

---

### 🔥 Important Rules
| Case                        | Allowed or Not |
|-----------------------------|----------------|
| Different Number of Parameters | ✅ Allowed       |
| Different Data Types         | ✅ Allowed       |
| Different Return Type        | ❌ Not Allowed   |
| Different Parameter Order     | ✅ Allowed       |

---

### ✅ Example of Overloading by Order
```java
class Demo {
    void show(int a, String b) {
        System.out.println("Int: " + a + ", String: " + b);
    }

    void show(String b, int a) {
        System.out.println("String: " + b + ", Int: " + a);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show(100, "Java");
        obj.show("Python", 200);
    }
}
```
### Output:
```
Int: 100, String: Java
String: Python, Int: 200
```

---

### 🔑 Why Method Overloading?
- Code Reusability
- Increases Readability
- Improves Code Performance

---

### 🎓 Conclusion:
Method Overloading allows the programmer to define multiple methods with the same name to perform similar tasks but with different types or numbers of parameters. It is a key feature of **Polymorphism** in Java.

---

Would you like me to generate **practice questions** or explain **Method Overriding** next? 🚀