# Topic 1.4 Assignment Statements and Input

## Learning Objective 1.4.A

Write code that uses assignment statements and explain what value is stored in a variable.  

### Essential Knowledge 1.4.A.1

* A variable must have a value before it can be used.  
* The value must match the variable’s data type.  
* The first time a variable gets a value, it is *initialized*.  

🕮 Read *Think Java 2*, Section 2.2 - 2.3

* Reference variables can store an object or `null` (meaning no object).  

🕮 Read *Think Java 2*, Section 9.2

### Essential Knowledge 1.4.A.2

The assignment operator `=` puts the value of the expression on the right side into the variable on the left side.  
☒ *Note: Using assignment inside other expressions (like `a = b = 4;` or `a[i += 5]`) is not part of this course.*

🕮 Read *Think Java 2*, Section 2.3

### Essential Knowledge 1.4.A.3

When a program runs, each expression produces one value. The type of that value depends on the expression.  

---

## Learning Objective 1.4.B

Write code that reads input.  

### Essential Knowledge 1.4.B.1

Programs can get input in many ways. In Java, the `Scanner` class can read text input from the keyboard.  
☒ *Note: Other specific forms of input are not part of this course.*  

#### Scanner Methods Used in Examples

* `.nextLine()` - reads text (String)
* `.nextInt()` - reads whole numbers (int)
* `.nextDouble()` - reads decimal numbers (double)
* Always remember `input.close()` at the end
