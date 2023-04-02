package dsa;

import java.util.*;

public class MapLoop {
    public static void main(String[] args) {
        Map <Integer, String> students = new HashMap<>();
        students.put(1,"Caleb");
        students.put(2, "Tolu");
        students.put(5, "Omo");
        students.put(7, "Johnson");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey()+" -> "+student.getValue());
        }
    }
}

