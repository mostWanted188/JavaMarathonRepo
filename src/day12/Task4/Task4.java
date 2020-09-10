package day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
    List<String> membersA = new ArrayList<>();
    membersA.add("Олег");
    membersA.add("Андрей");
    membersA.add("Кирилл");

    MusicBand bandA = new MusicBand("Иванушки", 1994, membersA);

        List<String> membersB = new ArrayList<>();
        membersB.add("Mike");
        membersB.add("Chester");

    MusicBand bandB = new MusicBand("Linkin Park", 1999, membersB);

    bandA.printBands();
    bandB.printBands();

    MusicBand.merger(bandA, bandB);

        bandA.printBands();
        bandB.printBands();
    }
}
