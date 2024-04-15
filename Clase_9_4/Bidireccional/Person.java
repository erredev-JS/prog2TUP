package Bidireccional;

import Bidireccional.Book;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Book> books = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            book.addOwner(this); // Agrega esta persona como poseedora del libro
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void showBooks() {
        System.out.println("Libros poseídos por " + name + ":");
        for (Book book : books) {
            System.out.println("- " + book.getTitle());
        }
    }
}
