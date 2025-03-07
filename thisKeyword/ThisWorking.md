# Java this Keyword

In Java, **this** keyword is used to refer to the **current object** inside a method or a constructor.

### Example:
```java
class Main {
    int instVar;

    Main(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("object reference = " + obj);
    }
}
```
**Output:**
```
this reference = Main@23fc625e
object reference = Main@23fc625e
```

In the above example, `this` refers to the **current object** `obj`.

## Use of this Keyword

### 1. **Using this for Ambiguity in Variable Names**
If instance variables and parameters have the same name, `this` is used to distinguish between them.

#### Without `this`:
```java
class Main {
    int age;
    Main(int age){
        age = age;  // Ambiguity
    }
}
```
**Output:**
```
obj.age = 0
```

#### With `this`:
```java
class Main {
    int age;
    Main(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("obj.age = " + obj.age);
    }
}
```
**Output:**
```
obj.age = 8
```

### 2. **this with Getters and Setters**

```java
class Main {
   String name;

   void setName(String name) {
       this.name = name;
   }

   String getName(){
       return this.name;
   }

   public static void main(String[] args) {
       Main obj = new Main();
       obj.setName("Toshiba");
       System.out.println("obj.name: " + obj.getName());
   }
}
```
**Output:**
```
obj.name: Toshiba
```

### 3. **Using this in Constructor Overloading**

```java
class Complex {
    private int a, b;

    Complex(int i, int j) {
        this.a = i;
        this.b = j;
    }

    Complex(int i) {
        this(i, i);
    }

    Complex() {
        this(0);
    }

    public String toString() {
        return this.a + " + " + this.b + "i";
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(3);
        Complex c3 = new Complex();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
```
**Output:**
```
2 + 3i
3 + 3i
0 + 0i
```

### 4. **Passing this as an Argument**

```java
class ThisExample {
    int x, y;

    ThisExample(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println("Before passing this:");
        System.out.println("x = " + this.x + ", y = " + this.y);

        add(this);

        System.out.println("After passing this:");
        System.out.println("x = " + this.x + ", y = " + this.y);
    }

    void add(ThisExample obj) {
        obj.x += 2;
        obj.y += 2;
    }

    public static void main(String[] args) {
        ThisExample obj = new ThisExample(1, -2);
    }
}
```
**Output:**
```
Before passing this:
x = 1, y = -2
After passing this:
x = 3, y = 0
```

### Summary
- **this** keyword refers to the **current object**.
- It is used to differentiate between **instance variables** and **parameters**.
- It helps in **constructor chaining**.
- It can be used to **pass the current object as an argument**.
- Using `this()` reduces **duplicate code**.

