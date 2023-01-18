package com.badal;

import java.util.Objects;

public class Classroom {
    private int rollno;
    private String name;
    private String address;

    public Classroom(int rollNum, String nameOfStudent, String address){
        this.rollno = rollNum;
        this.name = nameOfStudent;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return rollno == classroom.rollno && name.equals(classroom.name) && address.equals(classroom.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno, name, address);
    }
}
