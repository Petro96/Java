
import java.util.*;


public class MapExercise {
    

    public static void hello(){
        System.out.println("Hello from Map");
    }

    //public static void insertObjectIntoMap(Map<Integer,ArrayExercise> map){}

    public static void getInput(Map<Integer,Integer> map){

        boolean isRun = true;
        Scanner scanner = new Scanner(System.in);
        int i=0;

        while (isRun){

            int number = scanner.nextInt();

            boolean jeTam = isThere(map,number);

            if((number>=0) &  (jeTam==false)){
                map.put(i,number);
                i++;
            }

            if((number<0 )){
                isRun = false;
            }



        }

        

    }

    public static boolean isThere(Map<Integer,Integer> map,int n){

        for(int i =0;i<map.size();i++){
            Integer number = map.get(i);
            if(number.equals(n)){
                return true;
            }
        }
        return false;


    }
}