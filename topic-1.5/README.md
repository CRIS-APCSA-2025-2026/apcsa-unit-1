# Topic 1.5 Casting and Range of Variables

## Learning Objective 1.5.A

Write code that casts values to a different primitive type and explain the result.  

### Key Idea 1.5.A.1

Use `(int)` or `(double)` to convert between `int` and `double`.  

### Key Idea 1.5.A.2

Casting a `double` to an `int` removes the decimal part (truncates).  

### Key Idea 1.5.A.3

Sometimes Java automatically converts an `int` to a `double`. This is called widening.  

### Key Idea 1.5.A.4

To round a `double` to the nearest whole number:  

* `(int)(x + 0.5)` for positive numbers  
* `(int)(x - 0.5)` for negative numbers  

---

## Learning Objective 1.5.B

Describe when an integer result is outside the allowed range.  

### Key Idea 1.5.B.1

`Integer.MAX_VALUE` is the largest `int`.  
`Integer.MIN_VALUE` is the smallest `int`.  

### Key Idea 1.5.B.2

An `int` uses 4 bytes of memory. Its value must be between `Integer.MIN_VALUE` and `Integer.MAX_VALUE`.  

### Key Idea 1.5.B.3

If an `int` goes outside this range, overflow happens.  
The program still gives an `int` result, but it will not be the expected value.  

---

## Learning Objective 1.5.C

Describe conditions that limit the accuracy of expressions.  

### Key Idea 1.5.C.1

A `double` can only store a certain number of decimal places.  
If the number is too precise, Java rounds it to the nearest representable value.  
To avoid rounding errors, use `int` when possible.  

☒ Note: Other decimal types that reduce rounding error are not included in AP CSA.

## Excercise 1.5

Complete `topic-1.5/TemperatureConverter.java`

* use proper comments
* `commit` and `push` your code.