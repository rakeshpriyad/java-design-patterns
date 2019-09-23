package com.design.patterns.behavioral.command;

public class Receiver {

    public void save() {
        System.out.println("Receiver: save");
    }

    public void delete() {
        System.out.println("Receiver: delete");
    }

    public void update() {
        System.out.println("Receiver: update");
    }
}
