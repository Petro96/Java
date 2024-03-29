import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;



public class ArrayExercise implements operations,printArray{

    protected int[] createArray(int lengthOfArray){
        Random random = new Random();
        int[] array = new int[lengthOfArray];

        for(int i=0;i<lengthOfArray;i++){
            array[i]=random.nextInt(100);
        }

        return array;
    } 

    protected void sortArray(int[] array){
        Arrays.sort(array);
    }

    //operations

    @Override
    public int maxOfArrayElements(int[] arr){
        int maximum = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }

    @Override
    public double maxOfArrayElementsDoubles(double[] arr){
        double maximum = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }

    @Override
    public int sumOfArrayElements(int[] arr){
        int sumOf = 0;
        for(int i=0;i<arr.length;i++){
            sumOf += arr[i];
        }

        return sumOf;
    }
    
    @Override
    public double sumOfArrayElementsDoubles(double[] arr){
        double sumOf=0;
        for(int i=0;i<arr.length;i++){
            sumOf += arr[i];
        }

        return sumOf;
    }

    //print

    @Override
    public void printArrayElements(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element : "+(i+1)+" : "+arr[i]);
        }
    }

    // CopyArray

    @Override
    public int[] CopyArray(int[] arr){
        int len = arr.length;
        int[] copyArray = new int[len];
        for(int i=0;i<len;i++){
            copyArray[i]=arr[i];
        }

        return copyArray;
    }

    // Frequency of elements
    @Override
    public int[] frequencyOfElements(int[] arr){

        int[] newArr = new int[arr.length];
        int visited = -1;

        for(int i=0;i<arr.length;i++){
            int counter = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    counter+=1;
                    newArr[j] = visited;
                }
            }
            if(newArr[i] != visited){
                newArr[i] = counter;
            }
        }
        return newArr;

    }

    //printFreqArray(arr1,arr2) -> arr2[i] != -1: print
    public void printFrequencyOfElements(int[] arr1,int[] arr2){
        int visited = -1;

        for(int i=0;i<arr1.length;i++){
            if(arr2[i]!=visited){
                System.out.println(""+arr1[i]+" | "+arr2[i]);
            }
        }
    }



}