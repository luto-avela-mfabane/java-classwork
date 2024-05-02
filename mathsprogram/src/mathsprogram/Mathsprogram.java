/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathsprogram;
import java.util.Arrays;
/**
 *
 * @author LutoAvelaMfabane
 */
public class Mathsprogram 
{

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) 
        {
              int[] numbers = {64, 92, 84, 26};
        
        try {
            findAndPrintCommonFactor(numbers);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void findAndPrintCommonFactor(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Array must contain at least 2 numbers");
        }

        int num1 = numbers[0];
        int num2 = numbers[1];

        int commonFactor = findCommonFactor(num1, num2);

        if (commonFactor == 1) {
            System.out.println("No common factor found.");
        } else {
            System.out.println("Common factor found: " + commonFactor);
        }

        // Reduce the array by removing numbers divisible by the common factor
        int[] reducedArray = Arrays.stream(numbers)
                                   .filter(n -> n % commonFactor != 0)
                                   .toArray();

        System.out.println("Reduced array: " + Arrays.toString(reducedArray));
    }

    public static int findCommonFactor(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
        }
        
   
    
}
    

