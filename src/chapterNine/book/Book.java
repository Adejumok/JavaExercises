package chapterNine.book;

import java.time.Year;

public class Book {
    private String title;
    private Year publicationYear;
    private String author;

    public Book(String title, Year publicationYear, String author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Year getPublicationYear() {
        return publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String toString(){
        return String.format("Book Attributes include: " +
                        "%nTitle -> %s%nYear Of Publication -> %s%nAuthor -> %s",
                getTitle(),getPublicationYear(),getAuthor());
    }
}
