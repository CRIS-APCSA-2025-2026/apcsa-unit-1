# Topic 1.6 Compound Assignment Operators

## Learning Objective 1.6.A

Write code that uses compound assignment operators and explain the result stored in the variable.  

### Key Idea 1.6.A.1

Compound assignment operators combine arithmetic with assignment:  

* `+=`
* `-=`
* `*=`
* `/=`
* `%=`  

Example:  
```java
x += 5;   // same as x = x + 5
```

These operators do the calculation, then assign the result back to the same variable.

### Key Idea 1.6.A.2

The *postfix* increment and decrement operators add or subtract 1 from a variable:

* `++` increases the value by 1
* `--` decreases the value by 1

Example:

```java
count++;   // same as count = count + 1
count--;   // same as count = count - 1
```

🕮 Read *Think Java 2*, Section 6.2 for a practical examples of
compound assignment operators and postfix increment and decrement operators.

Compile and run `topic-1.6/CompoundAssignments.java` for more examples.

Excercise 1.6

Complete `topic-1.6/StudentRoster.java`.

☒ Note: Using ++ or -- in prefix form (++x) or inside other expressions (like arr[x++]) is not included in APCSA.

```
Enter a student name: Suzy
Current students (1): Suzy
Enter a student name: Billy
Current students (2): Suzy, Billy
Enter a student name: Johnny
Current students (3): Suzy, Billy, Johnny
```

* the number of students is an integer that is incremented
* the student list is a `String` containing a comma seperated list of strings we concatenate to.
