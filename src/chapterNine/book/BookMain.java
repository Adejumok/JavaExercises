package chapterNine.book;

import java.time.LocalTime;
import java.time.Year;

public class BookMain {
    public static void main(String[] args) {
        Book juno = new Book("Break", Year.now(), "Charity");
        System.out.println(juno);

        PrintBook printBook = new PrintBook("Break", Year.now(), "Charity",
                "Seun Kelani","1234");
        System.out.println(printBook);
        AudioBook audioBook = new AudioBook("Break", Year.now(), "Charity",
                15, LocalTime.now(),"Bose Mafimisere");
        System.out.println(audioBook);
    }
}
