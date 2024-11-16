package coreProgramsColletion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookStore {
    private int id;
    private String name;
    private String author;
    private String publication;

    public BookStore(int id, String name, String author, String publication) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publication = publication;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Author: " + author + ", Publication: " + publication;
    }
}

public class BookStoreArrayListApp {
    public static void main(String[] args) {
        ArrayList<BookStore> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        do {
            // Display options
            System.out.println("**********************");
            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by Name or Author");
            System.out.println("4. Count Books by Author");
            System.out.println("5. Count Total Number of Books");
            System.out.println("6. Display Books Grouped by Author");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            sc.nextLine();  // consume the newline character left by nextInt()

            switch (choice) {
                case 1:
                    // Add New Book
                    System.out.println("Enter data (id, name, author, publication):");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume the newline character
                    String name = sc.nextLine();
                    String author = sc.nextLine();
                    String publication = sc.nextLine();
                    BookStore book = new BookStore(id, name, author, publication);
                    list.add(book);
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    // View All Books
                    if (list.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("Books in the library:");
                        for (BookStore b : list) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 3:
                    // Search Book by Name or Author
                    System.out.println("Enter name or author for searching book:");
                    String searchTerm = sc.nextLine().trim(); // Trim any extra spaces
                    boolean found = false;
                    for (BookStore b : list) {
                        if (b.getName().equalsIgnoreCase(searchTerm) || b.getAuthor().equalsIgnoreCase(searchTerm)) {
                            System.out.println(b);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No book found with the given name or author.");
                    }
                    break;

                case 4:
                    // Count Books by Author
                    System.out.println("Enter author name to count books:");
                    String authorName = sc.nextLine().trim();
                    int count = 0;
                    for (BookStore b : list) {
                        if (b.getAuthor().equalsIgnoreCase(authorName)) {
                            count++;
                        }
                    }
                    System.out.println("Author " + authorName + " has " + count + " book(s).");
                    break;

                case 5:
                    // Count Total Number of Books
                    System.out.println("Total number of books: " + list.size());
                    break;

                case 6:
                    // Display Books Grouped by Author
                	System.out.println("Books grouped by author:");
                    ArrayList<String> authors = new ArrayList<>();
                    // Find all unique authors
                    for (BookStore b : list) {
                        if (!authors.contains(b.getAuthor())) {
                            authors.add(b.getAuthor());
                        }
                    }

                    // Display books by each author
                    for (String authorKey : authors) {
                        System.out.println("Author: " + authorKey);
                        for (BookStore b : list) {
                            if (b.getAuthor().equalsIgnoreCase(authorKey)) {
                                System.out.println("\t" + b);
                            }
                        }
                    }
                    break;

                case 7:
                    // Exit the application
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
    }
}
