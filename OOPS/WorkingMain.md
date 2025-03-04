Welcome to **Java Day One**! Since you already know **C**, it will be much easier to pick up Java. I'll break down the code for you by connecting it to what you already know.

---

### Code Explanation
#### 1. **Class Definition**
```java
class Lamp {
```
In Java, everything is **object-oriented**, which means you need **classes** to define objects. Here, `Lamp` is a **class** that acts like a blueprint for creating lamp objects.

---

#### 2. **Instance Variable**
```java
boolean isOn;
```
This is a **member variable** (or **instance variable**). It's like a global variable inside the class (just like C structure members). It stores the state of the lamp — whether it's on or off (`true` or `false`).

---

#### 3. **Methods**
These are like **functions** in C but are associated with an **object**.

##### `turnOn()`
```java
void turnOn() {
  isOn = true;
  System.out.println("Light on? " + isOn);
}
```
- `void` means this method doesn't return anything.
- It sets `isOn = true` (turns the lamp on).
- `System.out.println()` is the Java equivalent of `printf()` in C.

---

##### `turnOff()`
```java
void turnOff() {
  isOn = false;
  System.out.println("Light on? " + isOn);
}
```
Same concept — but this time it sets `isOn = false`.

---

#### 4. **Main Class**
```java
public class Main {
```
In Java, the **entry point** is always the `main()` method inside a class.

---

#### 5. **Object Creation**
```java
Lamp led = new Lamp();
Lamp halogen = new Lamp();
```
This line creates two **objects** of the `Lamp` class — just like declaring two structures in C:
```c
struct Lamp led, halogen;
```
In Java:
- `new` dynamically allocates memory.
- `Lamp()` is a **constructor** (default one in this case).

---

#### 6. **Method Calls**
```java
led.turnOn();      // Calls the turnOn() method
halogen.turnOff(); // Calls the turnOff() method
```
This is how Java objects call their methods — like **led->turnOn()** in C++.

---

### Output
```
Light on? true
Light on? false
```

---

### Quick Summary 🧠
| Concept        | C               | Java             |
|---------------|----------------|----------------|
| Structure     | `struct`       | `class`        |
| Functions     | Global         | Methods inside classes |
| Object Creation | Manual        | `new` keyword    |
| Printing      | `printf()`     | `System.out.println()` |

---

Would you like to see how **constructors** or **getters/setters** work in Java next? 🚀