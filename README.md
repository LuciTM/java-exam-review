# ☕ Java Exam Review

A 4-day, project-based review plan for a hands-on Java exam. Instead of just reading notes, each day pairs small syntax drills with a real mini-project so every concept gets applied, not just memorized.

## 📖 What's Inside

- **`workflow.md`** — the full 4-day study guide: daily topic lists, isolated syntax practice files, and a main project per day.
- **`notes/`** — condensed syntax and technical reference notes for quick review.
- **`day1-core-syntax/`** through **`day4-fileio-algorithms-mock/`** — the actual Java source files for each day's syntax drills and projects.

## 🗓️ The 4 Days

| Day | Focus | Main Project |
|---|---|---|
| 1 | Core syntax, control flow, arrays | Grocery Receipt Calculator |
| 2 | OOP fundamentals | Employee Payroll System |
| 3 | Collections, exceptions, strings | Student Records & Grade Management System |
| 4 | File I/O, algorithms, timed mock | Contact Book + Mini Library Management System |

## 🚀 How to Use This

1. Pick a day, read its topic list in `workflow.md`.
2. Write the small syntax practice files first — one concept at a time.
3. Build the day's main project from scratch, combining what you just practiced.
4. Log recurring mistakes as you go — helps catch the same bug next time.

**Rules while reviewing:** no AI, no copy-pasting, no notes during builds — the goal is to simulate real exam conditions.

## 🛠️ Running the Code

Each day's folder is self-contained. From inside a day's folder:

```bash
javac *.java
java MainClassName
```

(No packages are used, so compiling from within each folder avoids classpath issues.)

## 📂 Folder Structure

```
java-exam-review/
├── day1-core-syntax/
├── day2-oop/
├── day3-collections-exceptions/
├── day4-fileio-algorithms-mock/
└── notes/
```

See `workflow.md` for the full file-by-file breakdown of each day.

---

*Personal exam prep repo — built to practice, not to be perfect.*
