### 💡 What is Downcasting?
When an **Upcasted** object (Parent class reference pointing to a Child class object) needs to access child-specific methods, we perform **Downcasting**.


### ✅ Syntax:
```java
ChildClass obj = (ChildClass) parentReference;
```

---

### Example:
```java
Animal a = new Dog();  // Upcasting
Dog d = (Dog) a;       // Downcasting
d.guardHouse();        // Child class method
```

---

### 🔑 Important Points to Remember:
1. **Upcasting happens first** — Without Upcasting, Downcasting is not possible.
2. Always **use instanceof** before Downcasting to avoid **ClassCastException**.
3. Downcasting helps access **Child class-specific methods**.

---

### Example with `instanceof`:
```java
Animal a = new Dog(); // Upcasting
if (a instanceof Dog) {
    Dog d = (Dog) a;  // Downcasting
    d.guardHouse();   // Child class method
}
```
---

### 🔥 Output:
```
Dog Guards the House
```

---

### ❌ What Happens Without instanceof?
If you downcast without checking:
```java
Animal a = new Cat(); 
Dog d = (Dog) a;  // Throws ClassCastException
```
---

### 🎯 How to Memorize:
| Concept       | Keyword     | Example        |
|--------------|-------------|---------------|
| Upcasting    | Parent ← Child | `Animal a = new Dog();` |
| Downcasting  | Child ← Parent | `Dog d = (Dog) a;` |
| instanceof   | Safety Check | `if(a instanceof Dog)` |

---

Would you like me to generate **Fill in the Blanks Questions** or **MCQs** for Downcasting? 🧠