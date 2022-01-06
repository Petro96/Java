public interface operations {
    
    public int sumOfArrayElements(int[] arr);
    public double sumOfArrayElementsDoubles(double[] arr);
    public int maxOfArrayElements(int[] arr);
    public double maxOfArrayElementsDoubles(double[] arr);
    public int[] CopyArray(int[] arr);
    public int[] frequencyOfElements(int[] arr);

    public static void rotateLeft(int[] arr,int n){

        for(int i=0;i<n;i++){
            int j,first;
            first = arr[0];
            for(j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j] = first;
        }
    }

    public static void rotateRight(int[] arr,int n){

        for(int i = 0;i<n;i++){
            int j,last;
            last = arr[arr.length-1];
            for(j=arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
    }

    public static void sortArrayElements(int[] arr){

        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }




}
