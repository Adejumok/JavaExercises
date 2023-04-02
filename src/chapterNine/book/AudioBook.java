package chapterNine.book;

import java.time.LocalTime;
import java.time.Year;

public class AudioBook extends Book {
    private int bookSize;
    private LocalTime playLength;
    private String playBackArtistName;

    public AudioBook(String title, Year publicationYear, String author,
                     int bookSize, LocalTime playLength, String playBackArtistName) {
        super(title, publicationYear, author);
        this.bookSize = bookSize;
        this.playLength = playLength;
        this.playBackArtistName = playBackArtistName;
    }

    @Override
    public String toString(){
        return String.format(
                "%nAudio %s%nBook Size -> %dMB%nPlay Length -> %s" +
                        "%nPlayback Artist Name -> %s",
                super.toString(),bookSize,playLength,playBackArtistName);
    }
}
