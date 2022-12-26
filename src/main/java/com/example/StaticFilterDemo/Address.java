package com.example.StaticFilterDemo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

@Component
public class Address {

    String post;
    String District;
    String state;
    @JsonIgnore
    String pin;

    public Address(){}

    public Address(String post, String district, String state, String pin) {
        this.post = post;
        District = district;
        this.state = state;
        this.pin = pin;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
