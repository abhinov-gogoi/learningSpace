package com.revise.comparableVcomparator;

public class Student implements Comparable<Student>{
    String name;
    int rollNo;
    int standard;

    public Student(String name, int rollNo, int standard) {
        this.name = name;
        this.rollNo = rollNo;
        this.standard = standard;
    }

    @Override
    public int compareTo(Student that) {
        if(this.rollNo>that.rollNo){
            return 100;
        } else if (this.rollNo< that.rollNo) {
            return -200;
        } else {
            return 0;
        }
    }

}
