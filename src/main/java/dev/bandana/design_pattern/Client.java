package dev.bandana.design_pattern;

public class Client {
    public static void main(String[] args) {

        Student.getBuilder().setName("Bandana ").setAge(14).setBatch("Morning").setGrandyear(2005).build();

stat        System.out.println("DEBUG");
    }
}
