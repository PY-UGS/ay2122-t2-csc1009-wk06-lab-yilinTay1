package wk06_Lab;
import java.util.*;  
import java.util.LinkedList;  

public class Question2 {
    public static void swapValues (LinkedList<Integer> list, int indexOne, int indexTwo) {
        int tempHolder = list.get(indexTwo);
        list.set(indexTwo, list.get(indexOne));
        list.set(indexOne, tempHolder);
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        System.out.println("The list before: "+list);
        swapValues(list, 1,5);
        System.out.println("The list after: "+list);
    }
}
