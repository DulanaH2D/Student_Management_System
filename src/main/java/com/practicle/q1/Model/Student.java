package com.practicle.q1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String s_id;
    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }
    private String name;

    private float ca_marks;
    private float pa_marks;
    private float th_marks;

    public int getmNumber() {
        return mNumber;
    }

    public void setmNumber(int mNumber) {
        this.mNumber = mNumber;
    }

    private int mNumber;

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student() {
       
    }

    public float getCa_marks() {
        return ca_marks;
    }

    public void setCa_marks(float ca_marks) {
        this.ca_marks = ca_marks;
    }

    public float getPa_marks() {
        return pa_marks;
    }

    public void setPa_marks(float pa_marks) {
        this.pa_marks = pa_marks;
    }

    public float getTh_marks() {
        return th_marks;
    }

    public void setTh_marks(float th_marks) {
        this.th_marks = th_marks;
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
 

}
