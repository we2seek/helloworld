package org.itstep.modules.module11.classwork;

public class Song implements Comparable<Song> {

    private String artist;
    private String title;

    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Song [artist: '" + artist + '\'' + ", title: '" + title + '\'' + ']';
    }

    @Override
    public int compareTo(Song that) {

        return this.getArtist().compareTo(that.getArtist());
    }
}
