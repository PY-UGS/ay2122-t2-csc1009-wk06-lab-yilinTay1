package wk06_Lab;
import java.util.*;
import java.util.Random;

public class Question3 {
    public static int findValue (LinkedList<Integer> list, int searchVal) {
        Random rand = new Random(); //instance of random class
        for (int i = 0; i < 500; i++) {
            int int_random = rand.nextInt(1000,9999);
            list.add(int_random);
        }
        return list.indexOf(searchVal);
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println(findValue(list,1500));
        System.out.println("The list of 500 random integer range from 1000 to 9999: "+list);
    }

}
