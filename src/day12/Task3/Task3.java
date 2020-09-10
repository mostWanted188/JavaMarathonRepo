package day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Scooter", 1993);
        MusicBand band2 = new MusicBand("Ramnstein", 1994);
        MusicBand band3 = new MusicBand("Blink-182", 1992);
        MusicBand band4 = new MusicBand("Bomfunk MC's", 1998);
        MusicBand band5 = new MusicBand("Coldplay", 1996);
        MusicBand band6 = new MusicBand("Группа00", 2000);
        MusicBand band7 = new MusicBand("Группа02", 2002);
        MusicBand band8 = new MusicBand("Группа04", 2004);
        MusicBand band9 = new MusicBand("Группа06", 2006);
        MusicBand band10 = new MusicBand("Группа08", 2008);
        MusicBand band11 = new MusicBand("Группа10", 2010);

        List<MusicBand> bandsList = new ArrayList<>();
        bandsList.add(band1);
        bandsList.add(band2);
        bandsList.add(band3);
        bandsList.add(band4);
        bandsList.add(band5);
        bandsList.add(band6);
        bandsList.add(band7);
        bandsList.add(band8);
        bandsList.add(band9);
        bandsList.add(band10);
        bandsList.add(band11);

        System.out.println(bandsList);
       //List<MusicBand> copyOfBandsList = (List<MusicBand>) bandsList.clone();
        Collections.shuffle(bandsList);
        System.out.println(bandsList);

        System.out.println("это список групп, основанных после 2000го: ");
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for(MusicBand x : bandsList){
            if(x.getYear() > 2000){
                bandsAfter2000.add(x);
            }
        }
        System.out.println(bandsAfter2000);
    }
}
