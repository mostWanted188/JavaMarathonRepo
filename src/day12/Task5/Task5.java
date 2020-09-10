package day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Oleg", 45));
        members1.add(new MusicArtist("Fedor", 35));
        members1.add(new MusicArtist("Artur", 25));

        MusicBand group1 = new MusicBand("ЧеЗаТипы", 2000, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Mike", 54));
        members2.add(new MusicArtist("John", 53));
        members2.add(new MusicArtist("Chris", 52));

        MusicBand group2 = new MusicBand("ЧеЗаТипы", 2000, members2);

        MusicBand.merger2(group1, group2);

        group1.printBands();
        group2.printBands();

    }

}
