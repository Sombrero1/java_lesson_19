package ru.mirea.students;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA {

    static Comparator<Student> comparator=new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {

            return o1.getGPA()<o2.getGPA()? 1: -1;
        }

        };


    public static void sortChoara(Student[] t){
        Arrays.sort(t,comparator);
    }


    public static Student[] mergeStudents(Student[] students1, Student[] students2){
        SortingStudentsByGPA.sortChoara(students1);
        SortingStudentsByGPA.sortChoara(students2);


        return mergeArrays(students1,students2);
    }

    private static Student[] mergeArrays(Student[] a1, Student[] a2) {
        Student[] b = new Student[a1.length + a2.length];
        int positionA1 = 0;
        int positionA2 = 0;

        for(int i = 0; i < b.length; i++) {
            if(positionA1 == a1.length){
                b[i] = a2[positionA2];
                positionA2++;
            } else if(positionA2 == a2.length){
                b[i] = a1[positionA1];
                positionA1++;
            } else if(intToBoolean(comparator.compare(a1[positionA1] , a2[positionA2]))){
                b[i] = a1[positionA1];
                positionA1++;
            } else {
                b[i] = a2[positionA2];
                positionA2++;
            }
        }
        return b;
    }

    private static boolean intToBoolean(int i){
        if(i==1) return false;
        return true;
    }


}
