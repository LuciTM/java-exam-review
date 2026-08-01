# Java Hands-On Exam — 4-Day Review Guide (Project-Based)

## How to Use This Guide

Each day now has two parts:
1. **Simple Syntax Practice** — one tiny standalone program per concept, so each piece of syntax gets isolated reps before you combine them. Each one is its own file.
2. **Main Project** — a real-life mini-project that forces you to combine everything from that day.

Build everything yourself, no AI, no copy-pasting, no notes. Days are heavier now, so budget more time per day than a 7-day plan would.

**Daily routine:**
1. Skim the topic list.
2. Write the small syntax programs first — one file at a time, running and checking each.
3. Then build the day's main project from scratch, combining those concepts.
4. Before running any piece, guess the output first, then check.
5. Log recurring mistakes in the **Mistake Log** at the bottom.

**Golden rules for the whole review:**
- Type code yourself, ideally in a plain editor — matches exam conditions.
- No AI, no Stack Overflow, no notes during builds.
- Predict output before running — exposes gaps faster than reading code.
- Time yourself at least twice.
- Keep the mistake log — your personal cheat sheet of things you keep messing up.
- Explain a concept out loud in one sentence. If you can't, you don't know it yet.

---

## Day 1 — Core Syntax, Control Flow & Data Structures

**Concepts to hit:** variables/types, casting, operators, if/else, switch, loops, break/continue, arrays (1D + 2D)

### Simple Syntax Practice
- `Variables.java` — declare one of each primitive type (`int, double, char, boolean, long, float`) and print them.
- `Casting.java` — widen `int → double`, narrow `double → int`; predict the output first.
- `Operators.java` — use `+ - * / %` on `int` vs `double`; combine `&&`, `||`, `!` in one condition.
- `IfElse.java` — (1) simple if/else, (2) if/else-if chain with 4+ branches, (3) nested if.
- `SwitchDemo.java` — a normal switch with `break` on each case; then remove `break` on purpose and observe fall-through.
- `ForLoop.java` — print numbers 1–10, then modify to print only even numbers.
- `WhileLoop.java` — sum numbers until a sentinel value (e.g. -1) is entered.
- `DoWhileLoop.java` — a menu-driven program that runs at least once before checking the exit condition.
- `ForEachLoop.java` — iterate over an array and print each element with a manually tracked index.
- `BreakContinue.java` — one loop using `continue` to skip a value, one using `break` to exit early.
- `Arrays1D.java` — a 1D array declared 3 ways (literal, `new int[]`, loop-filled).
- `Arrays2D.java` — a 2D array printed as a grid, with row and column sums.

### Main Project: `GroceryReceiptCalculator.java`
- Store item names and prices in **arrays** (name array + price array).
- Simulate quantities per item using a second array or a 2D array (item, quantity).
- Use a `for` loop to calculate subtotal per item and a running grand total.
- Apply a discount using **if/else-if**: no discount under ₱500, 5% off ₱500–999, 10% off ₱1000+.
- Use a **switch** to print a payment method label from a numeric code (1 = Cash, 2 = Card, 3 = GCash).
- Print a formatted "receipt": item, quantity, price, subtotal, total.
- Bonus: `continue` to skip items with quantity 0; `break` to stop early if a "STOP" code is entered.

## MAIN MAIN Project: `ScannerCalc.java`
- Use `Scanner` to simulate a grocery store checkout system.
- Read the item name, quantity, and price per unit from the user.
- Use a **switch** to apply discounts based on item categories (e.g., "Fruits", "Vegetables", "Dairy").
- Validate input using **if/else**: reject negative quantities or prices.
- Use a **while loop** to allow the user to add multiple items until they enter "done".
- Use a **do-while loop** to ensure the program runs at least once.
- Store the receipt details in a **1D array** (e.g., "Apples x 2 @ $3.00 each = $6.00").
- Print the receipt using a **for-each loop**.
- Bonus: Use a **2D array** to store item name, quantity, price per unit, and total cost for each item, and print it as a table.
- Bonus: Use **break** to exit the loop early if the user enters "STOP".
- Bonus: Use **continue** to skip invalid inputs without terminating the program.

---

## Day 2 — OOP Fundamentals

**Concepts to hit:** classes/constructors, `this`, encapsulation, inheritance, overriding, overloading, polymorphism, abstract classes/interfaces

### Simple Syntax Practice
- `ConstructorDemo.java` — a class with a no-arg constructor and a parameterized one; instantiate both.
- `ConstructorOverloading.java` — 2–3 constructors with different parameter lists in the same class.
- `ThisKeyword.java` — a constructor where a parameter name shadows a field, fixed using `this`.
- `Encapsulation.java` — private fields + getters/setters, with basic validation in a setter (e.g. reject a negative value).
- `Inheritance.java` — a base class and a subclass with `extends`, calling `super()` explicitly in the subclass constructor.
- `MethodOverriding.java` — override a parent method with `@Override`; call `super.method()` inside it.
- `OverloadVsOverride.java` — both written side-by-side in one program so the difference is obvious.
- `Polymorphism.java` — an array/list of the parent type filled with subclass objects; loop and call an overridden method.
- `AbstractClassDemo.java` — one abstract method + one concrete method; extend it and implement the abstract method.
- `InterfaceDemo.java` — a small interface with 1–2 methods, implemented in a class.

### Main Project: `Employee.java`, `FullTimeEmployee.java`, `PartTimeEmployee.java`, `Payable.java`, `PayrollMain.java`
- Create an **abstract class** `Employee` (fields: `name`, `id`, `baseSalary`, all `private` with getters/setters = **encapsulation**) with an abstract `calculatePay()`.
- Create `FullTimeEmployee` (fixed monthly salary) and `PartTimeEmployee` (hourly rate × hours) as subclasses, each **overriding** `calculatePay()` differently.
- Give `Employee` an **overloaded constructor** (one with just name/id, one that also takes salary).
- Use `this` inside a constructor where a parameter shadows a field name.
- Store mixed employees in an `ArrayList<Employee>` and loop through calling `calculatePay()` on each — **polymorphism** in action.
- Bonus: add an interface `Payable` with `printPayslip()`, implemented in both subclasses.


## Folder Structure

```
java-exam-review/
├── day1-core-syntax/
│   ├── syntax-practice/
│   │   ├── Variables.java
│   │   ├── Casting.java
│   │   ├── Operators.java
│   │   ├── IfElse.java
│   │   ├── SwitchDemo.java
│   │   ├── ForLoop.java
│   │   ├── WhileLoop.java
│   │   ├── DoWhileLoop.java
│   │   ├── ForEachLoop.java
│   │   ├── BreakContinue.java
│   │   ├── Arrays1D.java
│   │   └── Arrays2D.java
│   └── GroceryReceiptCalculator.java
│
├── day2-oop/
│   ├── syntax-practice/
│   │   ├── ConstructorDemo.java
│   │   ├── ConstructorOverloading.java
│   │   ├── ThisKeyword.java
│   │   ├── Encapsulation.java
│   │   ├── Inheritance.java
│   │   ├── MethodOverriding.java
│   │   ├── OverloadVsOverride.java
│   │   ├── Polymorphism.java
│   │   ├── AbstractClassDemo.java
│   │   └── InterfaceDemo.java
│   ├── Employee.java              (abstract class)
│   ├── FullTimeEmployee.java
│   ├── PartTimeEmployee.java
│   ├── Payable.java               (interface, bonus)
│   └── PayrollMain.java           (main/test class)
│
└── notes/
    ├── java-syntax-notes.md
    └── java-exam-review-workflow.md
```

**Why it's laid out this way:**
- One class per file, matching Java's rule that a public class name = file name.
- Each day has its own `syntax-practice/` folder holding the small isolated files, kept separate from the main project so you can re-run them quickly without touching the bigger build.
- Each day's project is self-contained in its own folder so you can compile/run independently.
- Day 4 has two subfolders for the main build: the warm-up (Contact Book) and the timed mock (Library System).
- A `notes/` folder keeps your syntax cheat sheet and workflow doc next to the code.

---

