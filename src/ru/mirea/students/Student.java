package ru.mirea.students;

import java.text.Normalizer;

public class Student implements Test {
    private static int value=0;
    private int iDNumber;
    private double GPA;
    String name;
    String [] date;


    public Student(String name, double gpa, String... b){
        date=b;
        this.name=name;
        value++;
        this.iDNumber=value;
        this.GPA=gpa;

    }

    enum Format {
        shortDate, averageDate, longDate
    };
    public String getBirthday(String name){
        switch (Format.valueOf(name)){
            case shortDate:
                String [] buffer = date[0].split(".");
            case averageDate:
                return date[0];

            case longDate:
                return date[0]+date[1];

        }

    }

    public double getGPA() {
        return GPA;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return iDNumber == student.iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", GPA=" + GPA +
                '}';
    }
}
