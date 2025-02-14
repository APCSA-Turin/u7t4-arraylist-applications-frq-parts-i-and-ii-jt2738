package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {
    public static ArrayList<Student> sortStudents(ArrayList<Student> list) {
        ArrayList<Student> newList = new ArrayList<Student>();
        while (!list.isEmpty()) {
            Student newStudent = list.get(0); 
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).getLastName().compareTo(newStudent.getLastName()) < 0) {
                    newStudent = list.get(i);
                }
                else if (list.get(i).getLastName().compareTo(newStudent.getLastName()) == 0) {
                    if (list.get(i).getFirstName().compareTo(newStudent.getFirstName()) < 0) {
                        newStudent = list.get(i); 
                    }
                    else if (list.get(i).getFirstName().compareTo(newStudent.getFirstName()) == 0) {
                        if (list.get(i).getGpa() > newStudent.getGpa()) {
                            newStudent = list.get(i); 
                        }
                    }
                }
            }
            list.remove(newStudent);
            newList.add(newStudent);
        }
        
        return newList;
    }
}

