In **Java**, access modifiers are keywords that set the accessibility (visibility) of classes, methods, constructors, and variables. They help to enforce encapsulation by controlling how the members of a class can be accessed.

### Types of Access Modifiers in Java:
| Modifier        | Class | Package | Subclass | World |
|----------------|-------|---------|----------|-------|
| **public**    | ✅    | ✅      | ✅       | ✅     |
| **protected** | ✅    | ✅      | ✅       | ❌     |
| **default** (No Modifier) | ✅    | ✅      | ❌       | ❌     |
| **private**   | ✅    | ❌      | ❌       | ❌     |

---

### 1. **public**
- Accessible from **anywhere**.
- Used when the method, variable, or class needs to be accessible from **any part of the program**.
  
**Example:**
```java
public class MyClass {
    public int x = 10;

    public void display() {
        System.out.println("Hello");
    }
}
```
---

### 2. **protected**
- Accessible within the **same package** and by **subclasses** (even if they are in different packages).
- Often used in **inheritance**.

**Example:**
```java
class Parent {
    protected void show() {
        System.out.println("Protected method");
    }
}

class Child extends Parent {
    public static void main(String args[]) {
        Child obj = new Child();
        obj.show(); // Accessible because it's a subclass
    }
}
```
---

### 3. **default** (No Modifier)
- Accessible **only within the same package**.
- If no access modifier is specified, Java automatically assigns **default** access.

**Example:**
```java
class MyClass {
    void display() { // No modifier means default access
        System.out.println("Default Access");
    }
}
```
---

### 4. **private**
- Accessible **only within the same class**.
- It is the **most restrictive** access modifier.
- Used for data hiding.

**Example:**
```java
class MyClass {
    private int data = 100;

    private void display() {
        System.out.println("Private method");
    }

    public void accessPrivate() {
        display(); // Accessible within the same class
    }
}
```
---

### Access Modifier Priority (From Most to Least Restrictive):
**private > default > protected > public**

---

### 🔑 Key Points:
- Use **private** for encapsulation and data hiding.
- Use **protected** when creating **inheritance hierarchies**.
- Use **default** when you want access limited to the **same package**.
- Use **public** when you want **global access**.

Would you like examples of how these work with **inheritance** or **interfaces**?