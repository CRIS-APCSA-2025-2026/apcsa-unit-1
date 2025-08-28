# APCSA Topic 1.3 - Expressions and Output

## Essential Knowledge

**Learning Objective 1.3.A**  
Write *statements* to produce output. Analyze the code to determine the results that would be displayed.  

**Essential Knowledge 1.3.A.1**  
`System.out.print` and `System.out.println` send character data to *standard output*, which is in this course, displays information to the user in a terminal.  
`System.out.println` appends a *newline character*, which moves the cursor to a new line in the terminal. `System.out.print` does not append a newline.  

🕮 Read *Think Java 2*, Section 1.7 (page 9)

---

**Learning Objective 1.3.B**  
Write code using *string literals* and understand the results.  

**Essential Knowledge 1.3.B.1**  
A *literal* is a fixed value written directly in code. The value is not evaluated or simplified: **It is what it is**.  

**Essential Knowledge 1.3.B.2**  
A *string literal* is a sequence of characters contained in double quotes.  

🕮 Read *Think Java 2*, Section 1.5 (page 6)

**Essential Knowledge 1.3.B.3**  
*Escape sequences* start with a `\` followed by another character, which together, have a special meaning

Escape sequences used in this course:

* `\"` → double quote  
* `\\` → backslash  
* `\n` → new line

Excluded from the course, but helpful:

* `\t` → tab

Write a program to output the following:

```
Navigate to your home directory:

        cd C:\Users\Me
```

### Excercises

1. Write on paper or in a text editor the output produced:

```java
System.out.println("A");
System.out.print("B");
System.out.println("C");
System.out.print("D");
```

2. Write on paper or in a text editor the output produced:

```java
System.out.println("I say \"hi\"");
System.out.println("\tYou say \"hello\"");
System.out.println("Hi!\n\tHello!");
```

---

**Learning Objective 1.3.C**  
Write code with arithmetic expressions and explain the results.  

---

**Key Idea 1.3.C.2**  
Arithmetic operators are `+` (add), `-` (subtract), `*` (multiply), `/` (divide), and `%` (remainder).

* If both values are `int`, the result (or quotient) is an `int`.  
* If at least one value is `double`, the result is a `double`.  

☒ (Special double results like *infinity* or *NaN* are not part of this course.)

### Operators in Java

| Type       | Operator | Example         | Result                   |
|------------|----------|-----------------|--------------------------|
| Addition   | `+`      | `5 + 3`         | `8`                      |
| Addition   | `+`      | `1.2 + 3`         | `4.2` (double)                     |
| Subtraction | `-`      | `10 - 4`        | `6`                      |
| Multiplication | `*`      | `2 * 6`         | `12`                     |
| Division   | `/`      | `7 / 2`         | `3` (integer division)   |
| Division   | `/`      | `7.0 / 2`       | `3.5` (double division)  |
| Remainder  | `%`      | `7 % 2`         | `1` (remainder)          |
| String Concatentation     | `+`      | `"Hi " + "Joe"` | `"Hi Joe"`               |

---

**Key Idea 1.3.C.3**  
- Dividing two `int` values gives only the integer part of the quotient.  
- If one value is `double`, the result is the full quotient.  

---

**Key Idea 1.3.C.4**  
The `%` operator finds the remainder when `a` is divided by `b`.  
*(Cases where `a` is negative or `b` is zero are not part of this course.)*  

---

**Key Idea 1.3.C.5**  
Operators follow rules of precedence:

- `*`, `/`, and `%` are done before `+` and `-`.  
- Operators with the same precedence are done left to right.  
- Parentheses `()` can be used to change the order.  

---

**Key Idea 1.3.C.6**  
Dividing an integer by zero causes an `ArithmeticException`.  
*(Division by zero with doubles is not part of this course.)*  

---

🕮 Read *Think Java 2*, Section 2.4 - 2.9