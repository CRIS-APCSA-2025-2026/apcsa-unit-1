# 1.7.A.1 Application Program Interface (API) and Libraries

## Definitions

Libraries: collections of classes.

* Application Programming Interface (API): detailed documents (called *specifications*) for software development

  Find the official Oracle™ Java API Specifications for your Java Development Kit (JDK) version. Run `javac -version` to see the JDK you have installed.

  We are using [JDK version 24](https://docs.oracle.com/en/java/javase/24/docs/api/index.html).

* Class: Definition for a reference type

* Package: Collection of classes and libraries

* Objects: an instance of a class or library.

* Difference between a class and object is
  * Class is the definition
  * Object is an instance of a class at runtime

## 1.7.A.2

* Class have members: attributes and methods.

* Attributes: data members of a class.

* Methods: Function inside a class that operate on attributes.

* Behaviour is how object (instances) can be used.

See the comments illustrating terms we have defined:

```java
// import Scanner class from java.util package
import java.util.Scanner;

public class ClassObject {
    public static void main(String[] args) {
    // create an object (runtime instance) of the Scanner class
    // input is an object of type Scanner
    Scanner input = new Scanner(System.in);

    // call the `nextInt()` method on the `input` object
    // this demonstrates a behavior of Scanner instances
    int myInt = input.nextInt();

    input.close();
    }
}
```

We have not learned about class members yet, but this illustrates *behavior*

```java
/*
 * Class for a point on an x/y coordinate graph
 */
public class Point {
    // attributes
    public int x = 0;
    public int y = 0;

    // method
    public void move(newX, newY) {
        // give the points a new value
        x = newX;
        y = newY;
    }

    public static void main(String[] args) {
        // create a new object (aka instance)
        Point p1 = new Point();

        p1.move(3, 2);
        // p1.x == 3, p1.y == 2
        // this demonstrates behavior of a Point instance
    }
}
```
