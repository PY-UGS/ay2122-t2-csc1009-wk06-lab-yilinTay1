package wk06_Lab;
import java.util.*;
import java.util.Random;

public class Question6 {
    public static int findValue (HashMap<Integer, Integer> hashMap, int searchVal) {
        Random rand = new Random(); //instance of random class
        int positionNumber=0;
        
        for (int i = 0; i < 500; i++) {
            int int_random = rand.nextInt(1000,9999);
            if (searchVal == int_random){
                positionNumber = i;
            }
            hashMap.put(i, int_random);
        }

        if(hashMap.containsValue(searchVal) == true){
            return positionNumber;
        }
        else{return -1;}
    }
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        System.out.print(findValue(hashMap,5357));
        System.out.println("The HashMap before: "+hashMap);
    }

}
