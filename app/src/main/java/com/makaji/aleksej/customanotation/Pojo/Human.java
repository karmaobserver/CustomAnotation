package com.makaji.aleksej.customanotation.Pojo;

import com.example.StaticStringUtil;
import com.makaji.aleksej.customanotation.Pojo.Animal;
import com.makaji.aleksej.customanotation.Pojo.StringUtil;

/**
 * Created by Aleksej on 9/12/2017.
 */

/**
 * This is simple pojo class which is annotated with @StaticStringUtil annotation.
 * This annotation will generate code in {@link StringUtil} class.
 * Code which will be generated is createString method which is simulation of toString method.
 */
@StaticStringUtil
public class Human {

    public String firstName;

    public String lastName;

    public Animal animal;

    public Human(String firstName, String lastName, Animal animal) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.animal = animal;

    }

    @Override
    public String toString() {
        return StringUtil.createString(this);
    }

}