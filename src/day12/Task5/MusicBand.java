package day12.Task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

        public List<MusicArtist> getMembers() {
        return members;
    }

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }
    public static void merger2 (MusicBand one, MusicBand two) {
        for (MusicArtist x : one.getMembers())
            two.getMembers().add(x);

        one.getMembers().clear();
    }

    public void printBands() {
        System.out.println(members);
    }
}