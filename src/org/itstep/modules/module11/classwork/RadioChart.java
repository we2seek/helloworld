package org.itstep.modules.module11.classwork;

import java.util.*;

public class RadioChart {
    public static void main(String[] args) {
        Song[] songs = {
                new Song("Duke Dumont", "Ocean Drive"),
                new Song("Alan Walker", "Faded"),
                new Song("DJ Smash & Ridley ", "Lovers 2 Lovers"),
                new Song("The Avener", "To Let Myself Go"),
                new Song("Markus Schulz & Nifra", "The Creation (Prague)"),
                new Song("Duke Dumont", "Lorem ipsum"),
                new Song("Calvin Harris & Disciples", "How Deep Is Your Love"),
                new Song("BEN DELAY & ALEXANDRA PRINCE", "THE BOY IS MINE"),
                new Song("ZHU", "IN THE MORNING"),
                new Song("Feder & Emmi", "Blind (Moguai RMX #2)"),
                new Song("Feder & Emmi", "Blind (Moguai RMX)#3"),
                new Song("Feder & Emmi", "Blind (Moguai RMX)#4"),
                new Song("Feder & Emmi", "Blind (Moguai RMX)#2.5"),
                new Song("Eric Prydz & Rob Swire", "Breathe")
        };

        List<Song> songsList = Arrays.asList(songs);
        Map<String, Integer> stat = new HashMap<>();

        Collections.sort(songsList);

        for (Song song : songsList) {
            Integer count = stat.get(song.getArtist());
            if (count == null) {
                stat.put(song.getArtist(), 1);
            } else {
                stat.put(song.getArtist(), count + 1);
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = stat.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();
        stat = MapUtils.sortByValue(stat, false);
        Set<Map.Entry<String, Integer>> entrySet2 = stat.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet2) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
