# Java Syntax & Technical Reference Notes

---

## 1. Core Components

- **JDK** — full toolbox: compiler (`javac`), debugger (`jdb`), docs tool (`javadoc`). Contains JRE.
- **JRE** — runtime + libraries needed to run a program. Contains JVM.
- **JVM** — runs bytecode (`.class` file). Loads, verifies, executes code; provides runtime environment.

**Compile/run flow:** `Program.java` → `javac` → `Program.class` (bytecode) → JVM executes

---

## 2. Comments

```java
// single line

/*
   multi
   line
*/

/**
 * Javadoc comment — generates HTML docs
 */
```

---

## 3. File & Class Rules

- File name must end in `.java` and match the **public class** name.

```java
public class ClassName {
    // 1. Variables (fields)
    // 2. Constructors
    // 3. Methods
}
```

---

## 4. Access Modifiers

- **`public`** — accessible from class, package, subclass, and other packages.
- **`protected`** — accessible from class, package, and subclass. NOT accessible from unrelated other classes.
- **default (no modifier)** — accessible from class and package only. NOT accessible from subclass (in a different package) or other.
- **`private`** — accessible from within the class only.

---

## 5. Data Types

**Primitive:** `boolean, char, byte, short, int, float, double, long`
**Non-primitive (reference):** `String, Array, Object, Class, Interface`

Primitive vs Reference:
- Primitive is stored directly in memory / Reference stores a pointer to the object
- Primitive cannot be null / Reference can be null
- Primitive has fixed size / Reference's size depends on the object
- Primitive is faster / Reference is slightly slower

---

## 6. Variable Types

- **Local** — declared inside a method, no keyword, lives in the **Stack**
- **Instance** — declared inside a class, no keyword, lives in the **Heap**
- **Static** — declared inside a class with `static` keyword, lives in the **Method Area**

```java
public class Student {
    static String school = "PUP"; // shared across all instances
    String name;                  // instance — unique per object

    void sayHello() {
        int age = 20;              // local — exists only during method call
        System.out.println("Hi, I'm " + name);
    }
}
```

**Memory areas:**
- **Stack** → local variables, references, method calls (temporary, auto-cleared)
- **Heap** → objects, instance variables (garbage collected)
- **Method Area** → class structure, static variables, method definitions

---

## 7. Operators

### Unary
```
expr++   expr--            // postfix
++expr   --expr  +expr  -expr  ~expr  !expr   // prefix
```

- **Postfix (`a++`):** assign current value, then increment/decrement
- **Prefix (`++a`):** increment/decrement first, then assign

```java
int a = 5, b = 7;
System.out.println(a++ + ++b); // 13   (a=5 used, b becomes 8 first)
// after: a = 6, b = 8
```

### Arithmetic
```
+  -  *  /  %
```

### Ternary
```java
(condition) ? valueIfTrue : valueIfFalse;

int max = (a > b) ? a : b;
```

### Assignment
```
=  +=  -=  *=  /=  %=
```

### Relational (returns boolean)
```
>  >=  <  <=  ==  !=
```

### Logical (operates on booleans, short-circuits)
```
&&   Logical AND   — short-circuits
||   Logical OR    — short-circuits
!    Logical NOT   — unary
^    Logical XOR   — no short-circuit
```

**Short-circuit example:**
```java
System.out.println((x > y) && (y > x));
// if (x > y) is false, (y > x) is never evaluated
```

### Bitwise (operate on bits; no short-circuit even on booleans)
```
&    AND
|    OR
^    XOR
~    NOT (inverts all bits)
<<   Left shift (fills with 0)
>>   Right shift (preserves sign bit)
>>>  Unsigned right shift (fills with 0, ignores sign)
```
Example: `a=5 (0101)`, `b=3 (0011)` → `a & b = 1`, `a | b = 7`, `a ^ b = 6`, `~a = -6`

**Operator precedence (high → low, relevant subset):**
Unary → Arithmetic (`* / %` before `+ -`) → Relational → Equality → `&&` → `||` → Ternary → Assignment

---

## 8. Control Flow

### if / else
```java
if (condition) {
    // true branch
}

if (condition) {
    // true
} else {
    // false
}

if (condition1) {
    // ...
} else if (condition2) {
    // ...
} else {
    // ...
}

// nested
if (condition1) {
    if (condition1a) {
        // ...
    } else {
        // ...
    }
} else {
    // ...
}
```

### switch
```java
switch (expression) {
    case value1:
        statement1;
        break;
    case value2:
        statement2;
        break;
    default:
        defaultStatement;
}
```
- Each case value must match **exactly** (no comparisons).
- `break` is required or execution **falls through** to the next case.

### for loop
```java
for (initialization; condition; update) {
    // statement
}

// nested
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        // statement
    }
}
```

### while loop
```java
while (condition) {
    statement;
    updateExpression;
}
```

### do-while loop
```java
do {
    statement;
    updateExpression;
} while (condition);
```
- Runs **at least once** before checking condition (exit-controlled).

### break / continue
- `break` → exits the loop/switch entirely, no further iterations.
- `continue` → skips rest of current iteration, moves to next cycle.

---

## 9. Input Methods

### Scanner
```java
Scanner sc = new Scanner(System.in);
```
- `nextInt()` → int
- `nextDouble()` → double
- `nextFloat()` → float
- `nextLong()` → long
- `nextShort()` → short
- `next()` → single-word String
- `nextLine()` → full-line String

### BufferedReader
- Faster for large input, thread-safe.
- Does **not** auto-parse — manual conversion needed (e.g. `Integer.parseInt()`).

### Console
- Secure input; `readPassword()` returns `char[]` (not String) — can be wiped from memory, no on-screen echo.
- Doesn't work in most IDEs, needs actual terminal.

### Command-line arguments
```
javac Program.java        // compile
java Program arg1 arg2    // run with arguments
```
```java
public static void main(String[] args) { ... }
```
- Arguments arrive as **Strings** inside `args[]`.

---

## 10. Methods

```java
returnType methodName(parameterList) {
    // method body
}
```

- **Method signature** = name + parameter list
- **Access specifier**: `public / protected / default / private`
- **Return type**: primitive, object, collection, or `void` (nothing returned)
- **Static** → callable without creating an object (`Math.sqrt()`)
- **Non-static** → requires an object instance first (`input.nextInt()`)

---

## 11. Arrays

```java
int[] numbers = {10, 20, 30, 40};   // indexing starts at 0

numbers[0];              // access → 10
numbers[1] = 21;          // update

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### 2D Arrays
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};   // rows = 2, cols = 3

matrix[1][2];       // access → 6
matrix[1][0] = 7;    // update

for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

## 12. OOP — 4 Pillars

- **Abstraction** — hides complex implementation, shows only necessary features ("what" not "how"). Key mechanism: abstract classes.
- **Encapsulation** — bundles data + methods in a class; restricts direct access to internal state. Key mechanism: `private` fields + public getters/setters.
- **Inheritance** — new class acquires properties/behavior of an existing class (parent-child). Key mechanism: `extends`.
- **Polymorphism** — objects of different classes, same method name, different behavior. Key mechanism: method overriding.

```java
public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

---

## 13. Quick-Reference Cheat Sheet

- File name = public class name + `.java`
- Array indexing starts at **0**
- `switch` case values need exact match, no comparisons
- `do-while` guarantees at least **one** execution
- `break` stops loop/switch completely; `continue` skips only current iteration
- Postfix (`a++`) uses old value first; prefix (`++a`) updates first
- `&&` / `||` short-circuit; bitwise `&` / `|` do not
- Static = shared/global, no object needed; Non-static = per-instance, needs an object
- Stack = local vars/method calls; Heap = objects; Method Area = static vars/class structure