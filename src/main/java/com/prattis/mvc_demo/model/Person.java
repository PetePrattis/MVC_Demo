package com.prattis.mvc_demo.model;

import com.thedeanda.lorem.LoremIpsum;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private int age;
    private String name;

    public Person() {
       age = (int)(Math.random() * 70) + 18;
       name = LoremIpsum.getInstance().getName();
    }
}
