# Lab 2.6 ArrayList Drills

## Instructions

Complete each of the methods in ArrayListDrills.java so that they do what their comments say they should do.

Write code in the main method to test your methods as you complete them. It is recommended that you write one method, test it, fix it, then move on to another method.

You will be using loops, if-statements, and ArrayLists to solve these problems.

```
// Instantiating an ArrayList
ArrayList<Type> list = new ArrayList<Type>();

// ArrayList Methods
list.add(obj);
list.add(index, obj);
list.remove(index);
list.set(index, obj);
list.size();
```

Your code must meet the following restrictions:

*  Do not use any of these methods to solve other methods.
*  Do not create any other methods to solve these methods.
*  Do not change the method headers (return type, name, parameters) of these methods.
*  Do not delete the comments from the starter code

Remember that comments describe the method that comes after them.

If you get stuck, there are hints for each method at the end of this document.

## Testing

You need to test your work! Follow this example of how to test a method:

This statement invokes the createListOfNumbers method and stores its response in the test1 variable. Then it prints that result to the console.

```
ArrayList<Integer> test1 = createListOfNumbers();
System.out.println(test1);
```

You should write code in the main method to test each method as you write it. Follow this pattern:

* Call the method you want to test and store its return value in a variable
* Use System.out.println to output that variable

Note: Make sure you declare the variable correctly. Its type should match the return type of the method.

If you are getting compile errors for your test code in this method then check these things:

* Did you write the method name correctly? Try copying and pasting the method name from the method header.
* Are the arguments you are passing to the method correct? Look at how many parameters the method has and the types of those variables.
* Is the type of your answer variable correct? Look at the return type of the method, this should match the type of your answer variable.

## Grading

You must *correctly complete at least 8* of these methods to pass this lab. If you correctly complete *all* of these methods, then you will earn 1 Above & Beyond point.

These methods will be tested by checking their output against several test cases. If you method fails any of those test cases it will be deemed *incorrect*.

## Turning it in

When you have finished this lab, upload it to [turnerinner.com/@mrmaycs](https://turnerinner.com/@mrmaycs)

## Hints

Try to solve these methods on your own before looking at the hints.

### ArrayList\<Integer> createListOfNumbers()
Remember, when returning data from a method, you only return the variable name.

These are examples of good return statements
```
return x;
return answer;
return list;
```

These are examples of BAD return statements
```
return int x;
return boolean answer;
return ArrayList<Integer> list;
```
Also, when working with ArrayList's the \<Type> syntax is part of the *type* not the *name* so another example of a BAD return statement is
```
return list<Integer>
```

### ArrayList\<String> createListOfStrings()
See above

### ArrayList\<Grocery> createListOfGroceries()
See above

### int countElements(ArrayList\<Integer> list)
You could use a loop to solve this problem... or is there an ArrayList method that will just give you the answer?

### void addToEnd(ArrayList\<Integer> list, int value)
Just practicing calling ArrayList methods. This method does not return anything. It is just modifying the state of the parameter.

To test this method, create a list in the main method, pass it as an argument, then print that list.

```
ArrayList<Integer> testList = new ArrayList<Integer>();
testList.add(1);
testList.add(2);
testList.add(3);
addToEnd(testList, 999);
System.out.println(testList);
```
The example code above should print
```
[1, 2, 3, 999]
```

### void insertValue(ArrayList\<Integer> nums, int value)
There isn't an insert method... but which ArrayList method lets you insert data into the list?

This method does not return anything. It just modifies the state of the parameter.

### void addToBeginning(ArrayList\<Integer> stuff, int value)
What is the index of the first element in an ArrayList?

This method does not return anything. It just modifies the state of the parameter.

### int changeElement(ArrayList\<Integer> values, int newValue)
Which ArrayList method changes the value of an existing element?

### int removeElement(ArrayList\<Integer> elements)
Which ArrayList method removes an element from an ArrayList?

### int sumElements(ArrayList\<Integer> points)
You will need a loop to solve this problem. And a variable to keep track of the sum. Declare the variable before the loop (so that it is declared in the scope of the method)

### int countMatchingElements(ArrayList\<Integer> haystack, int needle)
You'll need a loop and an if-statement to solve this one. That's pretty much how you'll solve 90% of programming problems.

You will also neeed a variable to keep track of how many matching elements you have found.

### double calculateAverage(ArrayList\<Integer> stats)
This is the same as sumElements, except you have to do a division at the end.

Pay close attention to your data types! What happens when you divide an int by an int? Is that what you want to happen?

### int sumStringLength(ArrayList\<String> words)
This is a twist on the sumElements method. You have to call a method on each element to get the length of the string. Other than that, it's the same.

### double sumGroceryPrices(ArrayList\<Grocery> groceries)
This is similar to the sumStringLength method, except Grocery objects have different methods than String objects. Look at the Grocery.java file to identify which method you should use.

### int countExpensiveGroceries(ArrayList\<Grocery> groceries, double limit)
Another loop & if-statement problem!

### boolean allTheSame(ArrayList\<String> words)
This is a "false until proven true" problem. Use a loop & if-statement to solve it.