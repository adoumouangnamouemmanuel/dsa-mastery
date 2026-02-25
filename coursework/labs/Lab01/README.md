# Lab 01 — Array-Based Dynamic List (Library Book Records)

**Course:** Data Structures & Algorithms
**Type:** Individual In-Class Lab Assignment
**Points:** 50

---

## Problem Statement

Implement a dynamic array-based **List** data structure in Java to manage a library's book records.

Each book record contains:

| Field          | Description                                             |
| -------------- | ------------------------------------------------------- |
| `BookID`       | Unique identifier for the book                          |
| `Title`        | Title of the book                                       |
| `Author`       | Author of the book                                      |
| `Availability` | Availability status (e.g., `Available` / `Checked-Out`) |

---

## Supported Operations

| Command  | Syntax                                          | Description                                      |
| -------- | ----------------------------------------------- | ------------------------------------------------ |
| `ADD`    | `ADD BookID Title Author Availability`          | Append a record to the end of the list           |
| `INSERT` | `INSERT index BookID Title Author Availability` | Insert a record at the given index               |
| `REMOVE` | `REMOVE index`                                  | Remove the record at the given index             |
| `GET`    | `GET index`                                     | Retrieve and print the record at the given index |
| `SIZE`   | `SIZE`                                          | Print the current number of records              |
| `PRINT`  | `PRINT`                                         | Display all records in order                     |

---

## Input / Output Format

### Input

```
ADD B001 CleanCode RobertMartin Available
INSERT 0 B002 TheAlgorithms CLRS Available
REMOVE 1
GET 0
SIZE
PRINT
```

### Output

```
GET 0
B002 TheAlgorithms CLRS Available

PRINT
B002 TheAlgorithms CLRS Available
```

---

## Implementation Requirements

1. **Custom List class** — Do **not** use `java.util.ArrayList` or any other library list class.
2. **Dynamic resizing** — The underlying array must **double its capacity** whenever it is full.
3. **Resize counter** — Track and print the number of times the array is resized.

---

## Project Structure

```
Lab01/
├── README.md
├── BookRecord.java       # Data class for a single book record
├── DynamicList.java      # Custom array-based list implementation
└── LibrarySystem.java    # Main class — reads commands and drives the system
```

---

## Marking Criteria

| Component                                              | Points |
| ------------------------------------------------------ | ------ |
| Initial handwritten design notes (uploaded before lab) | 10     |
| Solution program correctness                           | 15     |
| Comments on important program statements               | 5      |
| Correct execution + screenshots (≥ 2 test cases)       | 20     |
| **Total**                                              | **50** |

---

## Submission Checklist

- [ ] Handwritten design notes photo uploaded to Canvas **before** the lab session
- [ ] `.java` source files included in the zip
- [ ] At least **two** test cases with input and expected output demonstrated via screenshots
- [ ] Array resize count is printed in the output
- [ ] No use of `java.util.ArrayList` or other library list classes

---

## Notes

- You are **not** permitted to use online resources during the lab session.
- A Java cheat sheet will be provided if needed.
- Design notes should be **high-level** (not detailed method implementations).
