Great question! The line:

```java
MethodsCreation obj = new MethodsCreation();
```
is used to **create an object** of the class `MethodsCreation`.

---

### 🔑 Why Do We Write This?
In Java, **non-static methods** and **variables** belong to the object of the class, not the class itself. To access these members, we need to create an **instance (object)** of the class.

However, in your code, the method:
```java
public static int add(int a, int b)
```
is **static**.

### How Static Works:
- **Static methods** belong to the **class** rather than an **object**.
- They can be directly accessed without creating an object.

So, the correct way to call the static method would be:
```java
int result = MethodsCreation.add(9, 10);
```
---

### ❓ Why Your Code Still Works?
Even though you're creating an object, you're still calling the method like this:
```java
obj.add(9, 10);
```
It works, but it's **not necessary** for static methods. Java will allow you to call static methods through an object, but it's considered **bad practice**.

---

### 🔥 What Should You Write?
Instead of:
```java
MethodsCreation obj = new MethodsCreation();
int result = obj.add(9, 10);
```
Simply write:
```java
int result = MethodsCreation.add(9, 10);
```
---

### 📝 Quick Rule:
| Method Type  | How to Call |
|-------------|------------|
| Static      | `ClassName.methodName()` ✅ |
| Non-Static  | `ObjectName.methodName()` ✅ |

---

Would you like an example showing **non-static methods** to understand the difference?