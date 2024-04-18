/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libarysystem;

/**
 *
 * @author LutoAvelaMfabane
 */
public class Libarysystem 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         Libary library = new Libary();

        // Adding some books
        library.addBook(new Book("Java Programming", "John Doe", "123456789", 5));
        library.addBook(new Book("Python Basics", "Jane Smith", "987654321", 3));
        library.addBook(new Book("Algorithms and Data Structures", "Alice Johnson", "456789123", 2));

      

        // Displaying all available books
        library.displayAvailableBooks();
    }
    
}
    
    

