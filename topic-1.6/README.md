# Topic 1.6 Compound Assignment Operators

## Learning Objective 1.6.A

Write code that uses compound assignment operators and explain the result stored in the variable.  

### Key Idea 1.6.A.1

Compound assignment operators combine arithmetic with assignment:  
- `+=`, `-=`, `*=`, `/=`, `%=`  

Example:  
```java
x += 5;   // same as x = x + 5
```

See `topic-1.6/CompoundAssignments.java` for more examples.

Excercise 1.6

Complete `topic-1.6/StudentRoster.java`.

Using postfix increments `++` operators and `+=` String concatenation operators,
generate a Java program the implements the following prompts and output for three students:

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
