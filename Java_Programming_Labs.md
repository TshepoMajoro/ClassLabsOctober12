# Java Programming Labs

## Variables, If Statements, Arrays, Classes, and Objects

**Level:** Beginner to Intermediate\
**Language:** Java SE 8\
**Purpose:** Practise core Java programming skills through hands-on
exercises.

------------------------------------------------------------------------

## Instructions for Students

1.  Read each task carefully before writing code.
2.  Create a separate Java class for each exercise unless instructed
    otherwise.
3.  Use meaningful variable and method names.
4.  Compile and run your programs, then test them with different inputs.
5.  Check boundary cases, such as zero, negative numbers, empty arrays,
    and invalid values.
6.  Be prepared to explain how your solution works.

## Lab 1: Variables and Data Types

### Exercise 1.1: Student details

Create `StudentDetails`. Declare variables for a student's name
(`String`), age (`int`), average mark (`double`), and registration
status (`boolean`). Assign values and print a labelled summary.

**Expected output example:**

``` text
Student Name: Naledi
Age: 20
Average Mark: 76.5
Registered: true
```

### Exercise 1.2: Shopping total

Create `ShoppingTotal`. Store a product name, unit price, and quantity.
Calculate and display the total cost.

**Challenge:** Apply a discount percentage and display the final amount.

### Exercise 1.3: Temperature conversion

Create `TemperatureConverter`. Convert Celsius to Fahrenheit using:

`fahrenheit = (celsius * 9 / 5) + 32`

Display both values. **Challenge:** Convert Fahrenheit back to Celsius.

### Review questions

1.  What is the difference between declaring and initialising a
    variable?
2.  When would you use `double` instead of `int`?
3.  What is the difference between `=` and `==`?

------------------------------------------------------------------------

## Lab 2: If Statements and Decision-Making

### Exercise 2.1: Pass or fail

Create `PassOrFail`. If a mark is 50 or higher, display `Pass`;
otherwise, display `Fail`.

**Challenge:** Reject marks below 0 or above 100.

### Exercise 2.2: Grade calculator

Create `GradeCalculator` and classify marks:

  Mark             Grade
  ---------------- --------------
  80--100          Distinction
  70--79           Merit
  50--69           Pass
  0--49            Fail
  Outside 0--100   Invalid mark

Order conditions correctly so each mark receives one result.

### Exercise 2.3: Number analysis

Create `NumberAnalysis`. Determine whether an integer is positive,
negative, or zero, and whether it is even or odd. Remember that zero is
even.

### Exercise 2.4: Login check

Create `LoginCheck`. Compare a username and password stored in `String`
variables with expected values. Display `Login successful` or
`Invalid credentials`.

**Important:** Use `.equals()` to compare String contents rather than
`==`.

### Review questions

1.  What happens when an `if` condition is false and there is no `else`
    block?
2.  How does `else if` differ from a separate `if` statement?
3.  What do `&&` and `||` mean?

------------------------------------------------------------------------

## Lab 3: Arrays

### Exercise 3.1: Store student marks

Create `StudentMarks` with an integer array of five marks. Print each
mark using a loop, then calculate and display the total and average.

### Exercise 3.2: Highest and lowest values

Create `ArrayStatistics`. Use an array of at least six integers to find
the largest value, smallest value, and number of elements.

**Challenge:** Count how many values are greater than or equal to 50.

### Exercise 3.3: Search an array

Create `ArraySearch`. Search an integer array for a target value.
Display its index if found, or `Value not found` otherwise.

**Challenge:** Report every matching index if the target appears more
than once.

### Exercise 3.4: Separate even and odd numbers

Create `EvenOddArray`. Count the even and odd values in an integer
array.

**Challenge:** Store the even and odd values in separate arrays or
lists.

### Exercise 3.5: Reverse an array

Create `ReverseArray`. Display the array in reverse order without
changing the original array.

**Challenge:** Reverse the array in place by swapping elements.

### Review questions

1.  Why does the first array element use index `0`?
2.  What does `array.length` return?
3.  What exception may occur when an invalid index is used?
4.  How can you avoid dividing by zero when calculating an average?

------------------------------------------------------------------------

## Lab 4: Classes and Objects

### Exercise 4.1: Student class

Create a `Student` class with `name` (`String`), `studentNumber`
(`String`), and `mark` (`double`). Add a constructor,
`displayDetails()`, and `hasPassed()` which returns `true` when the mark
is at least 50.

In `StudentApp`, create at least two `Student` objects and call their
methods.

### Exercise 4.2: Bank account

Create a `BankAccount` class with private fields for account holder,
account number, and balance. Add a constructor and methods: -
`deposit(double amount)` - `withdraw(double amount)` - `getBalance()`

A deposit or withdrawal must be greater than zero. A withdrawal cannot
exceed the balance. Invalid operations must not change the balance. Test
valid and invalid transactions.

### Exercise 4.3: Product inventory

Create a `Product` class with product ID, name, price, and stock
quantity. Add methods to display details, add stock, reduce stock after
a sale, and calculate stock value (`price * quantity`). Do not allow
sales that exceed available stock.

### Exercise 4.4: Rectangle

Create a `Rectangle` class with width and height. Add methods for area
(`width * height`) and perimeter (`2 * (width + height)`). Create two
objects with different dimensions and display the results.

### Review questions

1.  What is the difference between a class and an object?
2.  What is the purpose of a constructor?
3.  Why might fields be declared `private`?
4.  What is the difference between a parameter and a return value?

------------------------------------------------------------------------

## Lab 5: Combining the Concepts

### Exercise 5.1: Student results system

Create a `Student` class with student number, name, and an array of
three marks. Add methods to calculate the average, determine whether the
student passed (average at least 50), and display a summary.

In a separate main class, create at least three student objects, display
their averages and results, count how many passed, and identify the
student with the highest average.

**Validation:** Marks must be between 0 and 100.

### Exercise 5.2: Mini point-of-sale system

Create a `Product` class with name, price, and quantity. In the main
class, create an array of at least four products, calculate line totals
and the subtotal, apply a 10% discount if the subtotal exceeds 1,000,
and display a receipt with line totals, subtotal, discount, and final
total.

**Challenge:** Reject negative prices and quantities.

### Exercise 5.3: Employee salary review

Create an `Employee` class with employee number, name, and monthly
salary. Create an array of at least five employee objects. Display each
employee's details, employees earning more than a threshold, the highest
salary, and the average salary.

Use `if` statements to classify salaries as below 10,000, from 10,000 up
to but not including 20,000, or 20,000 and above.

------------------------------------------------------------------------

## Lab 6: Debugging and Code Quality

### Exercise 6.1: Incorrect String comparison

Explain why the following code may print `Different text`, then correct
it to compare String contents.

``` java
String first = new String("Java");
String second = new String("Java");

if (first == second) {
    System.out.println("Same text");
} else {
    System.out.println("Different text");
}
```

### Exercise 6.2: Array index

Explain the error and correct the loop condition.

``` java
int[] numbers = {10, 20, 30};

for (int i = 0; i <= numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### Exercise 6.3: Incorrect grade conditions

Rewrite the conditions so a mark of 85 displays `Distinction`.

``` java
int mark = 85;

if (mark >= 50) {
    System.out.println("Pass");
} else if (mark >= 80) {
    System.out.println("Distinction");
}
```

### Exercise 6.4: Unsafe withdrawal

Test your `BankAccount` class by withdrawing a valid amount, zero, a
negative amount, more than the balance, and exactly the full balance.
Confirm the balance remains correct after every operation.

------------------------------------------------------------------------

## Final Practical Assessment: Campus Store

Build a Java program for a small campus store. It must include:

1.  A `Product` class with private fields, a constructor, and
    appropriate methods.
2.  An array of at least five product objects.
3.  Variables for quantities, prices, subtotal, discount, and total.
4.  `if` statements to validate quantities and apply a discount.
5.  A loop to display products and calculate the subtotal.
6.  A search feature to find a product by ID or name.
7.  A sale operation that updates stock and rejects sales when stock is
    insufficient.
8.  A receipt showing purchased items and the final total.
9.  Meaningful variable names and clear output.
10. Tests for valid input, invalid input, empty stock, and selling the
    exact remaining quantity.

### Suggested marking rubric

  Assessment area                                   Weight
  --------------------------------------------- ----------
  Variables and data types                             10%
  If statements and validation                         15%
  Arrays and loops                                     20%
  Classes, objects, constructors, and methods          25%
  Calculations and stock handling                      20%
  Readability and testing                              10%
  **Total**                                       **100%**

## Submission Checklist

-   [ ] All Java source files compile successfully.
-   [ ] Each exercise has been tested.
-   [ ] Class names and filenames match where required.
-   [ ] Variables and methods use meaningful names.
-   [ ] Invalid input is handled sensibly.
-   [ ] Arrays are accessed using valid indexes.
-   [ ] String content is compared using `.equals()`.
-   [ ] The final practical assessment includes a working demonstration.
