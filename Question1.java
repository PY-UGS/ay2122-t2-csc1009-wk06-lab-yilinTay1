package wk06_Lab;
import java.util.*;  
import java.util.LinkedList;  
import java.util.Collections;

public class Question1 {
    public static void addAndSort(LinkedList<Integer> list, int value) {
        list.add(value);
        Collections.sort(list);
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        System.out.println("The list before: "+list);
        addAndSort(list,10);
        System.out.println("The list after: "+list);
    }
}
