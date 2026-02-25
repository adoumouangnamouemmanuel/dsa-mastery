/*
 * BookRecord.java
 * 
 * Author: Emmanuel Adoum
 * Date: 25/02/2026
 * 
 * Description: This class represents a book record in the library system.
 * It contains the book ID, title, author, and availability status.
 * 
 * Fields:
 * - bookID: The unique identifier of the book.
 * - title: The title of the book.
 * - author: The author of the book.
 * - availability: The availability status of the book.
 */
class BookRecord {
    private String bookID;
    private String title;
    private String author;
    private String availability;

    // Constructor
    public BookRecord(String bookID, String title, String author, String availability) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.availability = availability;
    }

    // Getters and Setters
    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    // toString method
    @Override
    public String toString() {
        return "BookRecord [bookID=" + bookID + ", title=" + title + ", author=" + author + ", availability="
                + availability + "]";
    }

}