package classes;

import java.io.IOException;

public class Child1 extends Parent {
    private String name;

    public Child1() {
    }

    private Child1(String a, int b, int c) {

    }

    public Child1(String a, char b) {

    }

    public Child1(String a) {
        this.name = a;
    }

    @Override
    public void display() throws IOException {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
