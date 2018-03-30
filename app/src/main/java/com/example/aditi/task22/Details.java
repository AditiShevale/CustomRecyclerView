package com.example.aditi.task22;

import java.util.List;

/**
 * Created by aditi on 30/3/18.
 */

public class Details {

    public Details(List<Details> details){

    }

    public Details(String name){
        this.name=name;
    }
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
