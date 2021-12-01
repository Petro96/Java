import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;


public class main{
    public static void main(String[] args){

        ArrayExercise a = new ArrayExercise();
        int[] arr = new int[5];

        arr = a.createArray(5);

        System.out.println("Array: "+Arrays.toString(arr));

        a.sortArray(arr);

        System.out.println("Sorted Array: "+Arrays.toString(arr));

        System.out.println("Maximum of array elements: "+a.maxOfArrayElements(arr));

        System.out.println("Sum of array elements: "+a.sumOfArrayElements(arr));

        a.printArrayElements(arr);

        System.out.println("Copied Array: "+Arrays.toString(a.CopyArray(arr)));
        
        
        //Arrays.sort(array)
        //Arrays.equals(arr1,arr2);
        //Arrays.deepEquals()
        //Arrays.fill(array,value) --> all array set to value;
        //Arrays.asList(); --> convert to arrayList (List<int> listArray = Arrays.asList(array))

        
    }
}