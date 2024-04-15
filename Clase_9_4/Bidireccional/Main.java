package Bidireccional;

import Bidireccional.Book;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Nazareno");
        Person p2 = new Person("Thomas");
        Person p3 = new Person("Rodrigo");
        Book b1 = new Book("El Principito");
        Book b2 = new Book("Manifiesto Comunista");
        Book b3 = new Book("El quijote");

        p2.addBook(b1);
        b3.addOwner(p1);
        b3.addOwner(p3);
        p3.addBook(b2);

        p2.showBooks();
        b3.showOwners();
        p1.showBooks();
        p3.showBooks();
    }
}