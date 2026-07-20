package day_11;

import java.util.Scanner;

class Book {
    String bookId;
    String title;
    String author;
    boolean issued;

    void setData(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    void issueBook() {
        if (!issued) {
            issued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        if (issued) {
            issued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    void displayBook() {
        System.out.println("Book Status: " + (issued ? "Issued" : "Available"));
    }
}

public class LibraryBookStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book = new Book();

        System.out.print("Book ID: ");
        String id = sc.nextLine();

        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Author: ");
        String author = sc.nextLine();

        book.setData(id, title, author);

        book.issueBook();
        book.displayBook();

        book.returnBook();
        book.displayBook();

        sc.close();
    }
}