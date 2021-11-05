
import java.util.Random;
import java.util.Arrays;



public class MainRandom {


    public static void main(String[] args){

        Random random = new Random();
        int[] array = new int[7];
        int l = array.length;

        //int x = random.nextInt(6)+1; // 0-5 // 1-6
        //double y = random.nextDouble();
        //boolean z = random.nextBoolean();

        for(int i=0;i<l;i++){
            array[i] = random.nextInt(50)+1;
        }

        //System.out.println(z);
        System.out.println("Random Array: "+Arrays.toString(array));



    }



    
}
