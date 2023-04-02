package chapterNine.book;

import java.time.Year;

public class PrintBook extends Book {
    private String publisher;
    private String ISBN;

    public PrintBook(String title, Year publicationYear, String author, String publisher, String ISBN) {
        super(title, publicationYear, author);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    @Override
    public String toString(){
        return String.format("%nPrint %s%nPublisher -> %s%nISBN -> %s",
                super.toString(),publisher,ISBN);
    }
}
