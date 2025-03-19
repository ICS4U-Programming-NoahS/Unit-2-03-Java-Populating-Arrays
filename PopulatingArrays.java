import java.util.Arrays;

/**
* The Populating Arrays program will create 5
* different arrays of 10 random numbers
* with 10 random numbers between 0 and 100 on a line separated by spaces.
* It uses the Arrays.sort function to sort each array.
* It displays the sorted arrays and for each sorted array, writes the average.
*
* @author Noah Smith
* @version 1.0
* @since 2025-03-17
*/

final class PopulatingArrays {

    /**
     * This is the array length.
     */
    public static final int ARRAY_LENGTH = 10;

    /**
     * This is the number of lines.
     */
    public static final int LINES = 5;

    /**
     * This is the minimum number.
     */
    public static final int MAX_NUM = 100;

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
    */
    private PopulatingArrays() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the populating arrays method.
     *
     * @return array of random numbers
     *
     */

    public static int[] populatingArrays() {

        // Create an array of numbers
        int[] arrayNum = new int[ARRAY_LENGTH];

        // Write a random number to the array of numbers
        // until 10 numbers have been added
        for (int counter = 0; counter < ARRAY_LENGTH; counter += 1) {

            // Add a random integer to the array, cast as an integer
            // The random integer is between 0 and 100
            arrayNum[counter] = (int) (Math.random() * (MAX_NUM + 1));
        }

        // return the array of numbers
        return arrayNum;
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */

    public static void main(final String[] args) throws Exception {

        // Keep adding an array
        // until 5 have been filled
        for (int line = 0; line < LINES; line += 1) {

            // call the populating arrays function
            int[] arrayNumber = populatingArrays();

            // Display the unsorted array:
            for (int num : arrayNumber) {
                // Display each number, separated by a space
                System.out.print(num + " ");
            }

            // Add a new line for spacing
            System.out.println("");

            // Sort the array of numbers
            Arrays.sort(arrayNumber);

            // initialize the sum inside the loop
            double sum = 0;

            // Calculate the sum
            for (int num : arrayNumber) {
                // Add each number to the sum
                sum += num;
            }

            // Calculate the average of the array of numbers
            double average = sum / ARRAY_LENGTH;

            // Display the sorted array of numbers
            for (int num: arrayNumber) {
                // Display each number, separated by a space
                System.out.print(num + " ");
            }
            // Display the average, rounded to 2 decimal places
            System.out.println(" Average: " + average);

            // Add a new line for spacing
            System.out.println("");
        }
    }
}
