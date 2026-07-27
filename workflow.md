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

---

## Day 3 — Collections, Exceptions & Strings

**Concepts to hit:** ArrayList, HashMap, HashSet, Iterator, Comparable, Comparator, generics, try/catch/finally, throw/throws, custom exceptions, String methods, StringBuilder

### Simple Syntax Practice
- `ArrayListDemo.java` — add/remove elements, access by index, `.size()`, `.contains()`; iterate with a regular `for` loop, then rewrite with `for-each`.
- `HashMapDemo.java` — a word-frequency counter using `.put()`, `.get()`, `.containsKey()`, `.getOrDefault()`.
- `HashSetDemo.java` — dedupe a list of numbers with duplicates.
- `IteratorDemo.java` — loop with `.hasNext()`/`.next()`; remove an item mid-loop with `iterator.remove()`.
- `ComparableDemo.java` — a class implementing `Comparable<T>`, overriding `compareTo()` to sort by one field.
- `ComparatorDemo.java` — sort the same objects by a different field using a separate `Comparator`.
- `GenericsDemo.java` — a simple generic class (`Box<T>`) and a generic method.
- `TryCatchFinally.java` — trigger `ArithmeticException` on purpose (divide by zero); confirm `finally` always runs.
- `MultiCatch.java` — catch two different exception types in one try.
- `ThrowThrows.java` — manually throw `IllegalArgumentException`; declare a method with `throws Exception`.
- `CustomExceptionDemo.java` — create your own exception class extending `Exception`; throw and catch it.
- `StringMethods.java` — one program exercising `.substring()`, `.split()`, `.trim()`, `.indexOf()`, `.replace()`, `.charAt()`.
- `EqualsVsDoubleEquals.java` — compare a literal String and a `new String(...)`, explain the difference out loud.
- `StringBuilderDemo.java` — build a string in a loop with `.append()`; try `.reverse()`, `.insert()`, `.deleteCharAt()`.

### Main Project: `Student.java`, `InvalidScoreException.java`, `StudentRecordsMain.java`
- Store students (`name`, `score`) in an `ArrayList<Student>`; use a `HashSet<String>` to block duplicate names from being added.
- Track extra info (e.g. number of absences) in a `HashMap<String, Integer>`.
- Make `Student` implement `Comparable<Student>` to rank by score; write a separate `Comparator` to sort alphabetically by name instead — run and print both.
- Use an `Iterator` to remove any student below a passing score (avoids `ConcurrentModificationException`).
- Create a custom checked exception `InvalidScoreException`, thrown when a score is entered outside 0–100, caught with try/catch, and confirm a `finally` block always logs "record processed."
- Use **String methods** to clean/format input names (`.trim()`, `.toUpperCase()`), and `StringBuilder` to build a formatted summary report line by line.
- Bonus: a small generic method `<T> void printList(List<T> list)` reused for printing both students and the absence map's keys.

---

## Day 4 — File I/O, Algorithms & Timed Mock Build

**Concepts to hit:** Scanner, file I/O (if covered), sorting (bubble/selection), searching (linear/binary), recursion, plus everything from Days 1–3 combined

### Simple Syntax Practice
- `ScannerDemo.java` — read an `int`, a `double`, and a `String` in one program (watch the `.nextLine()` buffer bug after `.nextInt()`).
- `FileWriteRead.java` *(if covered)* — write a few lines to a `.txt` file with `FileWriter`/`BufferedWriter`, then read them back with `FileReader`/`BufferedReader`, wrapped in try/catch for `IOException`.
- `BubbleSort.java` — implement it on an `int[]` from scratch, no `Collections.sort()`.
- `SelectionSort.java` — same idea, different algorithm — write it separately to compare.
- `LinearSearch.java` — implement it on an unsorted array.
- `BinarySearch.java` — implement it on a sorted array — careful with `low/mid/high` boundaries.
- `RecursionDemo.java` — write `factorial(n)`, `fibonacci(n)`, and a recursive array sum.

### Morning — Warm-up project: `ContactBookMain.java`
- Use `Scanner` to simulate adding a few contacts (name + number).
- If file I/O is in scope: write contacts to `contacts.txt`, read them back, wrap in try/catch for `IOException`.
- Implement **bubble or selection sort** yourself (no `Collections.sort()`) to alphabetize contacts.
- Implement **binary search** to find a contact by name in the sorted list; compare it to a **linear search** fallback.
- Add a recursive method `countVowels(String name)` to practice recursion outside of math examples.

### Afternoon — Timed mock (combined project): `Book.java`, `Library.java`, `BookNotFoundException.java`, `LibraryMain.java`
Set a timer matching your real exam length, then build:
- A `Book` class (title, author, year, availability) — private fields, encapsulation.
- A `Library` class holding an `ArrayList<Book>` (composition).
- Methods to **add**, **search** by title (linear/binary search), and **sort** by year (`Comparable`) or title (`Comparator`).
- A custom `BookNotFoundException`, thrown on a failed search, caught gracefully.
- `borrowBook()` / `returnBook()` using if/else to check availability before changing state.
- A text-menu loop (`while` + `switch`): 1 = Add, 2 = Search, 3 = List All, 4 = Exit.

This single build touches nearly everything from the whole review — OOP, collections, exceptions, algorithms, and control flow.

**End of day:**
- Compile and fix errors yourself before checking anything.
- Log every bug and *why* it happened in the mistake log.
- Quick recap out loud: `==` vs `.equals()`, integer vs double division, array bounds, static vs instance, if/else vs switch, checked vs unchecked exceptions, overloading vs overriding.
- Sleep well — that matters more than more code right now.

---

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
├── day3-collections-exceptions/
│   ├── syntax-practice/
│   │   ├── ArrayListDemo.java
│   │   ├── HashMapDemo.java
│   │   ├── HashSetDemo.java
│   │   ├── IteratorDemo.java
│   │   ├── ComparableDemo.java
│   │   ├── ComparatorDemo.java
│   │   ├── GenericsDemo.java
│   │   ├── TryCatchFinally.java
│   │   ├── MultiCatch.java
│   │   ├── ThrowThrows.java
│   │   ├── CustomExceptionDemo.java
│   │   ├── StringMethods.java
│   │   ├── EqualsVsDoubleEquals.java
│   │   └── StringBuilderDemo.java
│   ├── Student.java
│   ├── InvalidScoreException.java
│   └── StudentRecordsMain.java
│
├── day4-fileio-algorithms-mock/
│   ├── syntax-practice/
│   │   ├── ScannerDemo.java
│   │   ├── FileWriteRead.java
│   │   ├── BubbleSort.java
│   │   ├── SelectionSort.java
│   │   ├── LinearSearch.java
│   │   ├── BinarySearch.java
│   │   └── RecursionDemo.java
│   ├── contact-book/
│   │   ├── ContactBookMain.java
│   │   └── contacts.txt           (generated if you do file I/O)
│   │
│   └── library-system/
│       ├── Book.java
│       ├── Library.java
│       ├── BookNotFoundException.java
│       └── LibraryMain.java
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

## Mistake Log

Fill this in daily — it's your personal list of things to double-check on exam day.

| Day | Mistake | Fix / Rule to remember |
|---|---|---|
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |