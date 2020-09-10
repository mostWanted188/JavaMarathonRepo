package day12.Task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

/*        public List<String> getMembers() {
        return members;
    }*/

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void merger(MusicBand one, MusicBand two) {
        for (String x : one.members)
            two.members.add(x);

        one.members.clear();
    }

    public void printBands() {
        System.out.println(members);
    }
}