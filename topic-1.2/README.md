# APCSA Topic 1.2 - Variables and Data Types

## Essential Knowledge

### 1.2.A.1 Data Types

A data type is a category of values and the operations that can be
done with them. Data types are either **primitive** or **reference**.

### 1.2.A.2 Primitives

Primitive data types in this course represent numbers and

*Boolean* (`true` or `false`) values.

### 1.2.A.3 References

Reference types are used for objects that are not primitives.

### 1.2.B.1 Primitive types

This course uses these primitive types:

  - `int`: whole numbers (integers)
  - `double`: numbers with decimals (real numbers)
  - `boolean`: values `true` or `false`
  - `char`: values as a single character

  > Note: Other primitive types (`long`, `short`, `byte`, `float`)
    are **not included** in APCSA.

### 1.2.B.2 Variables

A variable is a named storage location for a value in memory.

Values can change at *run-time*. A variable’s type determines what kind of
value it can hold.

#### APCSA Data Types

| Type     | Category   | Description                     | Example Literal   | Notes                                  |
|----------|------------|---------------------------------|-------------------|----------------------------------------|
| int      | Primitive  | Integer values (whole numbers)  | `42`, `-7`, `0`   | Range approx. ±2 billion               |
| double   | Primitive  | Decimal (floating-point) values | `3.14`, `-0.001`  | Used for real numbers; may lose precision |
| boolean  | Primitive  | Boolean (Logical) values        | `true`, `false`   | Only two possible values                |
| char     | Primitive  | Single Unicode character        | `'A'`, `'9'`, `'?'` | Always single quotes `' '`            |
| String   | Reference  | Sequence of characters (text)   | `"Hello"`, `""`   | Not primitive; an object in Java        |

## Reading

🕮 Read *Think Java 2*, Sections 2.1 & 2.2.

## Excercises

### 1.2.A Data Type Excercise

Choose the correct data type (primitive or reference) based on a program’s needs.  

Replace `<type>` with the most appropriate data type for each description:

1. The number of planets in the solar system: <int>

2. It is currently raining outside: <type>

3. The name of your favorite pet: <type>

4. An approximation of the number Pi: <type>

5. The first letter of the English alpabet:

6. 5 is equal to 6: <type>

7. Average score rounded to the nearest whole point: <type>

8. The "at" symbol used in an email address: <type>

### 1.2.B Variables, Numbers & Booleans Excercise

Write code that declares variables for numbers (`int`, `double`) and logical values (`boolean`).

Edit the file `VariableDeclarations.java`

Add declarations and intializations (assign a value) for each of the variables that are printed.
