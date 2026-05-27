package Lab1;

public class Song {
    public String name;
    private String album;
    private String artist;

    public Song (String name, String album, String artist) {
        this.name = name;
        this.album = album;
        this.artist = artist;

    }

    public String toString() {
        return name + ", a part of " + album + ", by " + artist;
    }
}
