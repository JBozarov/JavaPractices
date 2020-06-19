import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myInt = 20;
        int anotherVal = myInt;

        System.out.println(myInt);
        System.out.println(anotherVal);

        myInt ++;

        System.out.println(myInt);
        System.out.println(anotherVal);

        ObjectCreator myObj = new ObjectCreator("John", 35, true);

        System.out.println(myObj.name);



        // Working with arrays
        int[] arr = {1,2,3,4,5};
        int[] arr2 = arr;

        System.out.println(arr[0]); // 1
        System.out.println(arr2[0]); // 1

        arr[0] = 1535;

        System.out.println(arr[0]); // 1535
        System.out.println(arr2[0]); // 1535

        System.out.println(Arrays.toString(arr));





    }
}
