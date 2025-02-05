package com.synchrony.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String age;
    private String className;  // "class" is reserved in Java, so we use "className"
    private Long phoneNumber;

    public Student() {
    }

    public Student(String name, String age, String className, Long phoneNumber) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters omitted for brevity
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
