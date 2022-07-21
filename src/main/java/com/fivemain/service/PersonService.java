package com.fivemain.service;

/**
 * @author lwpro
 */
public class PersonService {
    public String getService(int id){
        return "Found this person: id="+ id;
    }

    public static void main(String[] args) {
        System.out.println("simple demo for the class");
    }
}
