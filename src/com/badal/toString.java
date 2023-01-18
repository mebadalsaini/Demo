package com.badal;

public class toString {
    public static void main(String[] args) {
        Student s1 = new Student(11, "Badal");
        System.out.println(s1.toString());

    }
}
    class Student
    {
        int rollno;
        String sname;

        public Student(int rollno, String sname){
            this.rollno = rollno;
            this.sname = sname;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollno=" + rollno +
                    ", sname='" + sname +
                    '}';
        }
    }

