package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;


@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "student_sequence"
    )

    private long id;
    private String name;
    private String email;
    @Transient
    private int age;
    private LocalDate DoB;

    public Student() {

    }

    public Student(long id,String name,String email,LocalDate DoB) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.DoB = DoB;
    }

    public Student(String name,String email,LocalDate DoB) {
        this.name = name;
        this.email = email;
        this.DoB = DoB;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return Period.between(this.DoB, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDoB() {
        return DoB;
    }

    public void setDoB(LocalDate doB) {
        DoB = doB;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }





}
