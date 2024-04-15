package Bidireccional;

import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<Person> owners = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addOwner(Person person) {
        if (!owners.contains(person)) {
            owners.add(person);
            person.addBook(this); // Agrega este libro a la lista de libros poseídos por la persona
        }
    }


    public ArrayList<Person> getOwners() {
        return owners;
    }

    public void showOwners() {
        System.out.println("Personas que poseen el libro '" + title + "':");
        for (Person person : owners) {
            System.out.println("- " + person.getName());
        }
    }
}