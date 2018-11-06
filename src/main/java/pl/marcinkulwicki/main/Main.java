package pl.marcinkulwicki.main;

import pl.marcinkulwicki.second.Monster;
import pl.marcinkulwicki.second.MonstersCreator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        MonstersCreator monstersCreator = new MonstersCreator();
        List<Monster> monsters = monstersCreator.loadAllMonstersList();

        Stream<Monster> stremM =  monsters.stream();

        System.out.println("List");
        stremM.filter(x -> x.getLvl() > 19)
                .filter(c -> c.getRace().equals("Orc"))
                .forEach(System.out::println);


        //Tab
        System.out.println();
        System.out.println("TAB");
        Arrays.stream(monstersCreator.loadAllMonstersTab())
                .filter(x -> x.getLvl()<21)
                .map(x -> x.getName().toUpperCase())
                .forEach(System.out::println);


        Pattern.compile("").splitAsStream("Andrzej ma cos w sobie ze jego Andrzej jesr domkiem i domodstwem w dobrym mniemaniu jest dobroduszny")
                .limit(40)
                .map(x -> x.replace('c', 'D'))
                .forEach(System.out::print);
    }
}
