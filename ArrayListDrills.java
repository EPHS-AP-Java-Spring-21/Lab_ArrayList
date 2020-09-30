import java.util.ArrayList;

/**
 *  Do not use any of these methods to solve other methods.
 *  Do not create any other methods to solve these methods.
 *  Do not change the method headers (return type, name, parameters) of these methods.
 *  Do not delete the comments from the starter code
 *
 *  Remember: Comments describe the method that comes after them.
 */
public class ArrayListDrills
{
  /** The starting point of this program.
   *
   *  Write code here to test the methods you write.
   *  This method is not graded.
   *
   *  @param String[] args Commandline arguments.
   */
  public static void main(String[] args)
  {
    // Test your code here
    ArrayList<Integer> test1 = createListOfNumbers();
    System.out.println(test1);
  }

  /** This method will create an ArrayList of Integer objects, then add
   *  the values 8, 6, 7, and 5 to the list (in that order), then return the list.
   * 
   *  @return ArrayList<Integer> the list that was created and populated
   */
  public static ArrayList<Integer> createListOfNumbers()
  {
    return null;
  }
  
  /** This method will create an ArrayList of String objects, then add
   *  the values "cam", "newton", and "mvp" to the list (in that order),
   *  and return the list.
   *  
   *  @return ArrayList<String> the list that was created and populated
   */
  public static ArrayList<String> createListOfStrings()
  {
    return null;
  }
  
  /** This method will create an ArrayList of Grocery objects, then add
   *  three Grocery objects to it, then it will return that list.
   * 
   *  Grocery objects can be created using the Grocery class that is included in
   *  this lab's starter code. Take a look at the code in Grocery.java to see
   *  what methods and constructors it has.
   * 
   *  You will create three Grocery objects and add them to the list you created (in this order)
   *  Name: "Peanut Butter"  Price: 3.25
   *  Name: "Jelly"          Price: 2.75
   *  Name: "Bread"          Price: 1.99
   * 
   *  Create instances of Grocery objects with the values specified above, and add those objects
   *  to a ArrayList of Grocery objects (in the order they are descried about)
   * 
   *  @return ArrayList<Grocery> The list that was created and populated
   */
  public static ArrayList<Grocery> createListOfGroceries()
  {
    return null;
  }
  
  /** This method will return the number of elements in the list parameter.
   * 
   *  Hint: This is a very simple method to write. Is there an ArrayList method
   *        that calculates this value for you?
   * 
   *  @param ArrayList<Integer> list an ArrayList of numbers
   *  @return int the number of elements in the list
   */
  public static int countElements(ArrayList<Integer> list)
  {
    return -1;
  }
  
  /** This method will add the specified value to the end of the specified list
   *  This method does not return anything.
   *  
   *  Example:
   *   list   -> [5, 2, 6, 9, 4]
   *   value  -> 12
   *   result -> [5, 2, 6, 9, 4, 12]
   * 
   *  @param ArrayList<Integer> list an ArrayList of numbers
   *  @param int value the value to add to the end of list
   */
  public static void addToEnd(ArrayList<Integer> list, int value)
  {
  }
  
  /** This method will insert the specified value into index 2 of the specified list
   *  
   *  Example:
   *   nums   -> [5, 2, 7, 5]
   *   value  -> 42
   *   result -> [5, 2, 42, 7, 5]
   * 
   *  This method always inserts the value into index 2
   *  
   *  @param ArrayList<Integer> nums an ArrayList of numbers
   *  @param int value the value to insert into the list
   * 
   *  Precondition: nums.size() >= 2
   */
  public static void insertValue(ArrayList<Integer> nums, int value)
  {
  }
  
  /** This method will add the specified value to the beginning of the list
   * 
   * Example:
   *  stuff  -> [3, 7, 9, 4]
   *  value  -> 99
   *  result -> [99, 3, 7, 9, 4]
   *  
   *  @param ArrayList<Integer> stuff an ArrayList of numbers
   *  @param int value the value to add to the list
   */
  public static void addToBeginning(ArrayList<Integer> stuff, int value)
  {
  }
  
  /** This method will change the value at index 2 to the specified value and
   *  it returns the value that was replaced.
   *  
   *  Example:
   *   values   -> [6, 2, 9, 4, 6]
   *   newValue -> 76
   *   result   -> [6, 2, 76, 4, 6]
   *   returns  -> 9
   * 
   *  Note: you can accomplish this method with 1 line of code!
   * 
   *  @param ArrayList<Integer> values an ArrayList of numbers
   *  @param int newValue the value that should replace the value at index 2
   *  @return int the value that was originally at index 2
   * 
   *  Precondition: values.size() >= 2
   */
  public static int changeElement(ArrayList<Integer> values, int newValue)
  {
    return -1;
  }
  
  /** This method will remove the value at index 2 from the specified list
   *  and it will return the value that was removed. 
   * 
   *  Example:
   *   elements -> [7, 0, 5, 6, 0, 4]
   *   result   -> [7, 0, 6, 0, 4]
   *   returns  -> 5
   * 
   *  Note: you can accomplish this method with 1 line of code!
   *  
   *  @param ArrayList<Integer> elements an ArrayList to remove the value from
   *  @return int the value that was located at index 2 before being removed
   * 
   *  Precondition: elements.size() >= 2
   */
  public static int removeElement(ArrayList<Integer> elements)
  {
    return -1;
  }
  
  /** This method will sum (add together) the values of the elements in the specified list.
   *  
   *  Hint: you will need a foreach loop to do this!
   * 
   *  Example:
   *   points  -> [3, 3, 7, 3]
   *   returns -> 16
   * 
   *   points  -> [2, 2, 3, 2, 1, 1]
   *   returns -> 10
   * 
   *  @param ArrayList<Integer> points the array list that contains the values to be summed
   *  @return int the sum of the values in the arraylist
   */
  public static int sumElements(ArrayList<Integer> points)
  {
    return -1;
  }
  
  /** This method will count how many times needle occurs in haystack
   * 
   *  Hint: this method will need a foreach loop and an if-statement
   * 
   *  Example:
   *   haystack -> [4, 2, 6, 4, 1, 4]
   *   needle   -> 4
   *   returns  -> 3
   * 
   *   haystack -> [1, 2, 3, 4]
   *   needle   -> 4
   *   returns  -> 1
   * 
   *   haystack -> [2, 4, 6, 8]
   *   needle   -> 3
   *   returns  -> 0
   *   
   *  @param ArrayList<Integer> haystack the list to look for needles in
   *  @param int needle the needle to look for in the haystack
   *  @return int the number of times needle occurs in haystack
   */
  public static int countMatchingElements(ArrayList<Integer> haystack, int needle)
  {
    return -1;
  }
  
  /** This method will calculate the average of the values in the list
   *  You can calculate the average of a list of numbers with the following formula:
   *       sum / count
   * 
   *  Where sum is the sum of all the values in the list and count is the number of
   *  elements in the list.
   * 
   *  Example:
   *   stats -> [1, 2, 3]
   *   returns -> 2.0
   * 
   *   stats -> [5, 4]
   *   returns -> 4.5
   * 
   *  Note: pay attention to the data types of your variables!
   * 
   *  @param ArrayList<Integer> stats an array list of numbers
   *  @return double the average of the values in the list
   * 
   *  Precondition: stats.size() > 0
   */
  public static double calculateAverage(ArrayList<Integer> stats)
  {
    return -1.0;
  }
  
  /** This method will return the sum of the length of all the strings in the list
   *  
   *  Example:
   *   words   -> ["one", "two", "three"]
   *   returns -> 11
   * 
   *  @param ArrayList<String> words a list of String objects
   *  @return int total length of all Strings in the list
   */
  public static int sumStringLength(ArrayList<String> words)
  {
    return -1;
  }
  
  /** This method will return the sum of the prices of all the Grocery objects in the list
   * 
   *  Hint: Look at Grocery.java to see what methods you have available to invoke
   *  
   *  @param ArrayList<Grocery> groceries an ArrayList of Grocery objects
   *  @return double the sum of the prices of all Grocery objects in the list
   */
  public static double sumGroceryPrices(ArrayList<Grocery> groceries)
  {
    return -1.0;
  }
  
  /** This method will count how many Grocery objects in the list are more expensive than the limit
   *  
   *  Example: (only price value from Grocery objects are shown)
   *   groceries -> [1.00, 2.50, 0.75, 1.99, 10.05]
   *   limit     -> 1.00
   *   returns   -> 3
   * 
   *  @param ArrayList<Grocery> groceries an ArrayList of Grocery objects
   *  @param double limit Any price that is greater than the limit is considered expensive
   *  @return int the number of expensive Grocery objects (price greter than limit)
   */
  public static int countExpensiveGroceries(ArrayList<Grocery> groceries, double limit)
  {
    return -1;
  }
  
  /** This method identifies if all the String values in the array are the same value.
   *  If they are, it returns true; otherwise it returns false.
   *  
   *  Example:
   *   words   -> ["cat", "kitten", "tiger"]
   *   returns -> false
   * 
   *   words   -> ["taco", "taco", "taco", "taco", "taco"]
   *   returns -> true
   *  
   *  @param ArrayList<String> words An ArrayList of String objects
   *  @return boolean true if all the Strings in the ArrayList are the same; otherwise false
   */
  public static boolean allTheSame(ArrayList<String> words)
  {
    return false;
  }
}