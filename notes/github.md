# Daily Commit Reminders — java-exam-review

## After Each Day's Work

```bash
# check what changed
git status

# stage everything
git add .

# or stage just one day's folder
git add day1-core-syntax/

# commit with a clear message
git commit -m "Day 1: core syntax practice + Grocery Receipt Calculator"

# push to GitHub
git push
```

---

## Suggested Commit Message Pattern

```
Day 1: add syntax practice files (variables, casting, control flow)
Day 1: complete Grocery Receipt Calculator project
Day 2: add OOP syntax practice files
Day 2: complete Employee Payroll System
Day 3: add collections + exceptions syntax practice
Day 3: complete Student Records & Grade Management System
Day 4: add file I/O + algorithms syntax practice
Day 4: complete Contact Book warm-up
Day 4: complete Mini Library Management System (timed mock)
Update mistake log
```

One commit per meaningful chunk of work — don't wait until the whole day is done if you want checkpoints along the way.

---

## Quick Checklist Before Each Commit

- [ ] Code compiles without errors (`javac *.java`)
- [ ] Ran and tested the program at least once
- [ ] Commit message clearly states which day/project it covers
- [ ] Mistake log updated if you hit a bug worth remembering