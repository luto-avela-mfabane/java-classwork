/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libarysystem;
import java.util.ArrayList;
/**
 *
 * @author LutoAvelaMfabane
 */
public class Libary 
{
    ArrayList<Book> books;

    public Libary() {
        this.books = new ArrayList<>();
    }

    //
    public void addBook(Book book) {
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().equals(book.getTitle()) && b.getAuthor().equals(book.getAuthor())) {
                b.setQuantity(b.getQuantity() + book.getQuantity());
                found = true;
                break;
            }
        }
        if (!found) {
            books.add(book);
        }
    }

    //
    public void searchBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Title: " + b.getTitle());
                System.out.println("Author: " + b.getAuthor());
                System.out.println("ISBN: " + b.getIsbn());
                System.out.println("Quantity: " + b.getQuantity());
                return;
            }
        }
        System.out.println("Book not found.");
    }

    //
    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book b : books) {
            System.out.println("Title: " + b.getTitle());
            System.out.println("Author: " + b.getAuthor());
            System.out.println("ISBN: " + b.getIsbn());
            System.out.println("Quantity: " + b.getQuantity());
            System.out.println("--------------------------");
        }
    }
}
