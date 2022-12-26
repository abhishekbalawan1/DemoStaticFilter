package com.example.StaticFilterDemo;

@org.springframework.stereotype.Service
public class Service {

    public Person getPerson(){
        return new Person("abc", "male", 32);
    }

    public Address getAddress(){
        return new Address("post", "district", "state", "12345");
    }
}
