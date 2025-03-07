### ✅ What is Upcasting?
Upcasting means:
👉 Assigning a **Child class object** to a **Parent class reference**.

---

### How it Works in this Code:

In the `main()` method, these lines perform **Upcasting**:
```java
performDrive(new Car());    // Upcasting Car to Vehicle
performDrive(new Bike());   // Upcasting Bike to Vehicle
performDrive(new Truck());  // Upcasting Truck to Vehicle
```
---

What happens here?

### Behind the Scenes:
When you write:
```java
performDrive(new Car());
```
It actually works like this:
```java
Vehicle v = new Car();  // Upcasting Car to Vehicle
performDrive(v);
```
---

### What Happens Step-by-Step?
1. **Upcasting:**
   - `new Car()` creates a `Car` object.
   - The parent class reference `Vehicle v` refers to the child object (`Car`).

2. **Polymorphism:**
   - Even though the reference is of type `Vehicle`, the **overridden methods** in the `Car` class will be executed.
   - The JVM will check at **runtime** which object's methods to call.

---

### Output Explanation
When you call:
```java
performDrive(new Car());
```
The output will be:
```
Car is starting
Car needs petrol
Car is stopping
```
---

### If You Do This:
```java
Vehicle maruti = new Vehicle();
performDrive(maruti);
```
Output:
```
Vehicle is starting
Vehicle is fueling
Vehicle is stopping
```
---

### 🔥 What’s the Difference?
| Code                              | Output                    | Reason                       |
|-----------------------------------|---------------------------|------------------------------|
| `Vehicle maruti = new Vehicle();` | Vehicle methods           | No overriding, Parent object |
| `Vehicle v = new Car();`          | Car methods               | Upcasting + Polymorphism     |

---

### 🎯 Conclusion:
- When you use `new Vehicle()`, you are creating a **Parent object**.
- When you use `new Car()`, **Upcasting** happens, and the **child class methods** are executed due to **runtime polymorphism**.

---

Would you like me to show **Downcasting** with this example next? 🔥