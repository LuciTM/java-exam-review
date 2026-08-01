# OOP Exercise Sets — Java Practice (3 Sets, 3 Tiers Each)

## How This Works

Each set uses **one theme**, but you build it in three tiers:

- **Easy** — just take input from the user and store/print it. No method calls beyond getters/setters, no math. Focus: class structure, constructors, encapsulation, reading input correctly.
- **Medium** — introduces **method calling**. You must call methods *on objects*, including calling one method from inside another, and calling overridden methods through inheritance/polymorphism. Focus: syntax of calling methods, `this`, `super`, overriding.
- **Hard** — introduces **computation**. Methods must calculate something (totals, averages, conditions based on computed values) and the result must be correct, not just printed. Focus: logic — getting the actual computed output right, not just the syntax.

Each tier tells you exactly what output is expected, so you know what you're building toward before you start. Do NOT use AI, no copy-pasting, no notes. Type it yourself, predict output before running, and compare against the expected format given.

---

# SET 1 — Vehicle Rental System

**Classes involved:** `Vehicle` (base), `Car` and `Motorcycle` (subclasses)

## 🟢 Easy — Input Only

**Task:**
- Create a class `Vehicle` with private fields: `plateNumber` (String), `brand` (String), `dailyRate` (double).
- Constructor takes all 3 fields.
- Getters and setters for all fields (encapsulation).
- In `main`, use `Scanner` to ask the user for plate number, brand, and daily rate.
- Create one `Vehicle` object using that input.
- Print the object's details using the getters.

**Expected Output (example input: ABC-123, Toyota, 1500.0):**
```
Enter plate number: ABC-123
Enter brand: Toyota
Enter daily rate: 1500.0

--- Vehicle Info ---
Plate Number: ABC-123
Brand: Toyota
Daily Rate: ₱1500.0
```

**No method calling required beyond getters/setters. No computation.**

---

## 🟡 Medium — Method Calling

**Task:**
- Create `Car extends Vehicle` and `Motorcycle extends Vehicle`.
- `Vehicle` should have a method `displayInfo()` that prints plate, brand, and rate.
- `Car` adds a field `seatCount` (int) and **overrides** `displayInfo()` to call `super.displayInfo()` first, then print the seat count.
- `Motorcycle` adds a field `hasSidecar` (boolean) and overrides `displayInfo()` the same way — call `super.displayInfo()`, then print sidecar status.
- In `main`:
  - Ask the user to choose "1" for Car or "2" for Motorcycle.
  - Ask for the shared fields (plate, brand, rate) AND the extra field for whichever type was chosen.
  - Create the correct object (`Car` or `Motorcycle`) based on the user's choice.
  - Call `displayInfo()` on it — this call must trigger the overridden version, which internally calls the parent version.

**Expected Output (example: user picks 1/Car, plate DEF-456, brand Honda, rate 2000, seats 5):**
```
Choose vehicle type (1 = Car, 2 = Motorcycle): 1
Enter plate number: DEF-456
Enter brand: Honda
Enter daily rate: 2000.0
Enter seat count: 5

--- Vehicle Info ---
Plate Number: DEF-456
Brand: Honda
Daily Rate: ₱2000.0
Seats: 5
```

**Key syntax being tested:** calling `super.method()` from inside an overridden method, and calling a method on an object where the actual method that runs depends on the object's real type (polymorphism).

---

## 🔴 Hard — Computation

**Task:**
- Add a method `calculateTotalCost(int days)` to `Vehicle` that returns `dailyRate * days`.
- In `Car`, override `calculateTotalCost(int days)` to add a flat ₱500 "car service fee" on top of the base calculation (call `super.calculateTotalCost(days)` inside it, then add 500).
- In `Motorcycle`, override `calculateTotalCost(int days)` so that if `hasSidecar` is true, add a ₱300 surcharge on top of the base calculation; otherwise just return the base calculation.
- In `main`, after creating the object (same as Medium tier), ask the user for the number of rental days.
- Call `calculateTotalCost(days)` and print the final total.

**Expected Output (example: Car, rate 2000, seats 5, 3 days):**
```
Enter number of rental days: 3

--- Rental Summary ---
Base Cost: ₱6000.0
Total Cost (with fees): ₱6500.0
```

**Expected Output (example: Motorcycle, rate 800, hasSidecar = true, 4 days):**
```
Enter number of rental days: 4

--- Rental Summary ---
Base Cost: ₱3200.0
Total Cost (with fees): ₱3500.0
```

**Key logic being tested:** overriding a method that returns a computed value (not just prints), correctly combining `super`'s result with additional logic, and conditional computation based on an object's own field.

---

# SET 2 — School Grading System

**Classes involved:** `Student` (base), `RegularStudent` and `ScholarStudent` (subclasses)

## 🟢 Easy — Input Only

**Task:**
- Create a class `Student` with private fields: `name` (String), `studentId` (String), `year Level` (int).
- Constructor takes all 3 fields.
- Getters and setters for all fields.
- In `main`, ask the user for name, student ID, and year level.
- Create one `Student` object from that input.
- Print the object's details.

**Expected Output (example: Juan Dela Cruz, 2023-00123, 2):**
```
Enter name: Juan Dela Cruz
Enter student ID: 2023-00123
Enter year level: 2

--- Student Info ---
Name: Juan Dela Cruz
ID: 2023-00123
Year Level: 2
```

---

## 🟡 Medium — Method Calling

**Task:**
- Create `RegularStudent extends Student` and `ScholarStudent extends Student`.
- `Student` has a method `printRecord()` that prints name, ID, and year level.
- `RegularStudent` adds a field `tuitionFee` (double) and overrides `printRecord()` — call `super.printRecord()`, then print the tuition fee.
- `ScholarStudent` adds a field `scholarshipType` (String, e.g. "Academic", "Athletic") and overrides `printRecord()` — call `super.printRecord()`, then print the scholarship type.
- In `main`, ask the user to pick student type (1 = Regular, 2 = Scholar), take the shared + type-specific input, create the right object, and call `printRecord()` on it.

**Expected Output (example: user picks 2/Scholar, Maria Santos, 2023-00456, year 3, type Academic):**
```
Choose student type (1 = Regular, 2 = Scholar): 2
Enter name: Maria Santos
Enter student ID: 2023-00456
Enter year level: 3
Enter scholarship type: Academic

--- Student Record ---
Name: Maria Santos
ID: 2023-00456
Year Level: 3
Scholarship Type: Academic
```

---

## 🔴 Hard — Computation

**Task:**
- Add a method `calculateFinalFee()` to `Student` that returns `0.0` by default (base students don't pay directly in this system).
- In `RegularStudent`, override `calculateFinalFee()` to return the full `tuitionFee`.
- In `ScholarStudent`, override `calculateFinalFee()`:
  - If `scholarshipType` equals `"Academic"`, return `0.0` (fully free).
  - If `scholarshipType` equals `"Athletic"`, return `tuitionFee * 0.5` (50% discount) — this means `ScholarStudent` also needs a `tuitionFee` field even though it's a scholar, since athletic scholars still pay half.
  - For any other scholarship type, return the full `tuitionFee`.
- In `main`, after gathering input (adjust prompts so `ScholarStudent` also asks for `tuitionFee`), call `calculateFinalFee()` and print the result.

**Expected Output (example: Athletic scholar, tuition 30000):**
```
Enter tuition fee: 30000.0

--- Fee Summary ---
Final Fee to Pay: ₱15000.0
```

**Expected Output (example: Academic scholar, tuition 30000):**
```
Enter tuition fee: 30000.0

--- Fee Summary ---
Final Fee to Pay: ₱0.0
```

**Key logic being tested:** overriding a method with conditional branches that produce different computed values, and recognizing when a subclass needs an extra field even if it seems to contradict the "type" (an athletic scholar still has a tuition figure to compute from).

---

# SET 3 — Restaurant Order System

**Classes involved:** `MenuItem` (base), `FoodItem` and `DrinkItem` (subclasses), plus a simple `Order` class that HOLDS a list of items (composition, not inheritance — this set stretches you a bit further)

## 🟢 Easy — Input Only

**Task:**
- Create a class `MenuItem` with private fields: `itemName` (String), `price` (double).
- Constructor takes both fields.
- Getters and setters.
- In `main`, ask the user for an item name and price.
- Create one `MenuItem` object.
- Print its details.

**Expected Output (example: Burger, 150.0):**
```
Enter item name: Burger
Enter price: 150.0

--- Menu Item ---
Name: Burger
Price: ₱150.0
```

---

## 🟡 Medium — Method Calling

**Task:**
- Create `FoodItem extends MenuItem` and `DrinkItem extends MenuItem`.
- `MenuItem` has a method `printDetails()` printing name and price.
- `FoodItem` adds a field `isSpicy` (boolean) and overrides `printDetails()` — call `super.printDetails()`, then print whether it's spicy ("Yes"/"No").
- `DrinkItem` adds a field `sizeInMl` (int) and overrides `printDetails()` — call `super.printDetails()`, then print the size.
- Create a separate class `Order` with a field `ArrayList<MenuItem> items` and a method `addItem(MenuItem item)` that adds to the list, and a method `printOrder()` that loops through the list calling `printDetails()` on each item (this is polymorphism — the loop doesn't know or care whether each item is Food or Drink, it just calls `printDetails()` and the correct version runs).
- In `main`, let the user add 2 items (ask type, then relevant fields for each), add both to an `Order`, then call `printOrder()`.

**Expected Output (example: item 1 = Food "Fries", not spicy, 80.0; item 2 = Drink "Iced Tea", 500ml, 60.0):**
```
--- Item 1 ---
Choose type (1 = Food, 2 = Drink): 1
Enter item name: Fries
Enter price: 80.0
Is it spicy? (true/false): false

--- Item 2 ---
Choose type (1 = Food, 2 = Drink): 2
Enter item name: Iced Tea
Enter price: 60.0
Enter size in ml: 500

=== Full Order ===
Name: Fries
Price: ₱80.0
Spicy: No
Name: Iced Tea
Price: ₱60.0
Size: 500ml
```

**Key syntax being tested:** storing a parent-type list filled with mixed subclass objects, and looping through it calling an overridden method — this is the clearest possible demonstration of polymorphism in action.

---

## 🔴 Hard — Computation

**Task:**
- Add a method `calculatePrice()` to `MenuItem` that returns `price` by default.
- In `FoodItem`, override `calculatePrice()`: if `isSpicy` is true, add a ₱10 "spicy surcharge" on top of the base price (use `super.calculatePrice()` inside it).
- In `DrinkItem`, override `calculatePrice()`: if `sizeInMl` is greater than 400, add a ₱15 "large size surcharge"; otherwise return the base price.
- In `Order`, add a method `calculateTotal()` that loops through all items, calls `calculatePrice()` on each, and sums the results — return the total.
- In `main`, after building the order (same as Medium tier), call `calculateTotal()` and print it, along with a per-item breakdown showing each item's computed price (not just its base price).

**Expected Output (using the same example items — Fries not spicy 80.0, Iced Tea 500ml 60.0):**
```
=== Order Breakdown ===
Fries — ₱80.0
Iced Tea — ₱75.0

Total: ₱155.0
```

*(Iced Tea is 500ml, which is > 400ml, so it gets the ₱15 surcharge: 60 + 15 = 75. Fries isn't spicy, so no surcharge: stays 80.)*

**Key logic being tested:** looping through a mixed-type collection while calling a computed (not printed) overridden method on each, accumulating a running total correctly, and making sure your surcharge conditions are evaluated per-object using that object's own fields.

---

## Self-Check After Each Set

Before moving to the next set, answer out loud:
- Where exactly did I call `super.method()`, and why was it necessary there?
- In the Hard tier, which method returned a value instead of just printing? Why does that distinction matter for `calculateTotal()`-style summing?
- If I added a third subclass right now, what's the minimum I'd need to override to make it work correctly with the existing `Order`/loop logic? (This tests whether you actually understand polymorphism or just copied the pattern.)

---

## Folder Structure

```
oop-exercise-sets/
├── set1-vehicle-rental/
│   ├── easy/
│   │   └── Vehicle.java
│   │
│   ├── medium/
│   │   ├── Vehicle.java
│   │   ├── Car.java
│   │   └── Motorcycle.java
│   │
│   └── hard/
│       ├── Vehicle.java
│       ├── Car.java
│       └── Motorcycle.java
│
├── set2-school-grading/
│   ├── easy/
│   │   └── Student.java
│   │
│   ├── medium/
│   │   ├── Student.java
│   │   ├── RegularStudent.java
│   │   └── ScholarStudent.java
│   │
│   └── hard/
│       ├── Student.java
│       ├── RegularStudent.java
│       └── ScholarStudent.java
│
├── set3-restaurant-order/
│   ├── easy/
│   │   └── MenuItem.java
│   │
│   ├── medium/
│   │   ├── MenuItem.java
│   │   ├── FoodItem.java
│   │   ├── DrinkItem.java
│   │   └── Order.java
│   │
│   └── hard/
│       ├── MenuItem.java
│       ├── FoodItem.java
│       ├── DrinkItem.java
│       └── Order.java
│
└── notes/
    └── oop-exercise-sets.md
```

**Why it's laid out this way:**
- Each set gets its own top-level folder, and each tier (`easy/`, `medium/`, `hard/`) gets its own subfolder — since the classes evolve between tiers (new fields, overridden methods), keeping them separate avoids overwriting your Easy-tier version when you build the Medium one.
- Every `main` method should live in whichever class file makes sense to run directly (e.g. `Vehicle.java` in `easy/`, since that's the only class there) — for `medium/` and `hard/`, you can put `main` in the subclass file you're testing, or create a small dedicated `XxxMain.java` if you'd rather keep `main` separate from the class logic. Either is fine — Java doesn't require a separate main file, but many people prefer it once multiple classes are involved.
- Copying the base classes (`Vehicle.java`, `Student.java`, `MenuItem.java`) into each tier folder — rather than sharing one copy across tiers — is intentional: it lets you see exactly how the class grew from tier to tier, and keeps each folder runnable on its own without cross-folder imports.