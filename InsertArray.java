import java.sql.SQLOutput;
import java.util.Scanner;

public class Insert {

    private static Scanner scanner = new Scanner(System.in);

    static int[] arr  = {12,46,2,99,45,66,45};

    public static void main(String[] args) {
        System.out.println("HLOEFD");

        printNums(arr);

        int[] newArr = getNums();

        System.out.println("____________________");
        printNums(newArr);
    }


    // print all numbers method
    static void printNums(int[] nums) {
        for ( int i = 0; i<nums.length; i++ ) {
            System.out.println(nums[i]);
        }
    }


    public static int[] getNums () {
        System.out.println("Enter the length of new array: ");
        int arrLength;
        arrLength = scanner.nextInt();
        int[] newArr = new int[arrLength];
        for ( int g = 0; g<arrLength; g++ ) {
            System.out.println("Please enter the next number " + ( arrLength-g ) + " entries left ");
            int inputValue = scanner.nextInt();
            newArr[g] = inputValue;
        }
        return newArr;

    }
}
