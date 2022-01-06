public interface printArray {
    
    public void printArrayElements(int[] arr);
    public void printFrequencyOfElements(int[] arr1,int[] arr2);

    public static void printDuplicate(int[] arr){
        int duplicates = 0;
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    duplicates+=1;
                    System.out.println("Duplicate: "+arr[i]);
                }
            }
        }
        System.out.println("Sum of dupliceted: "+duplicates);
    }



}
