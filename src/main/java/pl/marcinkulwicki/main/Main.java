package pl.marcinkulwicki.main;

import pl.marcinkulwicki.second.Monster;
import pl.marcinkulwicki.second.MonstersCreator;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        MonstersCreator monstersCreator = new MonstersCreator();
        List<Monster> monsters = monstersCreator.loadAllMonsters();

        Stream<Monster> stremM =  monsters.stream();
        stremM.filter(x -> x.getLvl() > 19)
                .filter(c -> c.getRace().equals("Orc"))
                .forEach(System.out::println);

//        System.out.println(stremM);
    }
}
