# ☕ Java Exam Review

A 2-day, project-based review plan for a hands-on Java exam. Instead of just reading notes, each day pairs isolated syntax drills with a real mini-project so every concept gets applied, not just memorized.

## 📖 What's Inside

- **`workflow.md`** — the full 2-day study guide: daily topic lists, isolated syntax practice files (one file per concept), and a main project per day.
- **`oop-exercise-sets.md`** — extra OOP-focused practice: 3 themed sets (Vehicle Rental, School Grading, Restaurant Order), each split into Easy / Medium / Hard tiers with exact expected outputs and suggested time limits.
- **`notes/`** — condensed syntax and technical reference notes for quick review, no tables, code-block friendly.
- **`git-commit-guide.md`** — daily commit workflow reminders and a suggested commit message pattern for tracking progress.
- **`day1-core-syntax/`** and **`day2-oop/`** — the actual Java source files: each day's `syntax-practice/` subfolder plus the main project files.

## 🗓️ The 2 Days

| Day | Focus | Main Project |
|---|---|---|
| 1 | Core syntax, control flow, arrays | Grocery Receipt Calculator *(+ bonus: Scanner-based Checkout System)* |
| 2 | OOP fundamentals | Employee Payroll System |

## 🎯 Extra OOP Practice

Day 2 has its own drill-down file — `oop-exercise-sets.md` — for when you want more reps specifically on classes, inheritance, and polymorphism:

| Set | Theme | Easy | Medium | Hard |
|---|---|---|---|---|
| 1 | Vehicle Rental | Input only | Method calling + `super` | Computed rental cost |
| 2 | School Grading | Input only | Method calling + `super` | Computed final fee |
| 3 | Restaurant Order | Input only | Polymorphic list + loop | Computed order total |

Each tier has a strict time limit (10 / 20 / 30 min) and a fixed expected output, so you know exactly what you're aiming for before you start.

## 🚀 How to Use This

1. Pick a day, read its topic list in `workflow.md`.
2. Write the small syntax practice files first — one concept, one file, at a time.
3. Build the day's main project from scratch, combining what you just practiced.
4. Once Day 2 is done, run through `oop-exercise-sets.md` for deeper OOP reps.
5. Log recurring mistakes as you go — helps catch the same bug next time.

**Rules while reviewing:** no AI, no copy-pasting, no notes during builds — the goal is to simulate real exam conditions. Predict output before running, not after.

## 🛠️ Running the Code

Each folder is self-contained. From inside a specific folder:

```bash
javac *.java
java MainClassName
```

(No packages are used, so compiling from within each folder avoids classpath issues.)

## 📂 Folder Structure

```
java-exam-review/
├── day1-core-syntax/
│   ├── syntax-practice/
│   └── GroceryReceiptCalculator.java
│
├── day2-oop/
│   ├── syntax-practice/
│   └── Employee.java, FullTimeEmployee.java, PartTimeEmployee.java, Payable.java, PayrollMain.java
│
├── day3-set-exercise/
│   ├── set1-vehicle-rental/     (easy / medium / hard)
│   ├── set2-school-grading/     (easy / medium / hard)
│   └── set3-restaurant-order/   (easy / medium / hard)
│
└── notes/
    ├── java-syntax-notes.md
    ├── workflow.md
    ├── oop-exercise-sets.md
    └── git-commit-guide.md
```

See `workflow.md` and `oop-exercise-sets.md` for the full file-by-file breakdown.

## 📝 Committing Progress

See `git-commit-guide.md` for the daily commit routine and suggested message format — one commit per meaningful chunk of work (syntax practice, then project, then mistake log updates).

---

*Personal exam prep repo — built to practice, not to be perfect.*