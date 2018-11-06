package pl.marcinkulwicki.second;

import java.util.ArrayList;
import java.util.List;

public class MonstersCreator {

    public List<Monster> loadAllMonsters(){

        List<Monster> monsters = new ArrayList<Monster>();

        monsters.add(new Monster("Bryczek zjadacz", "Mordor", 25, "Orc"));
        monsters.add(new Monster("Niebiański obgryzacz", "Mordor", 20, "Orc"));
        monsters.add(new Monster("Arystokratyczny jeż", "Mordor", 10, "Troll"));
        monsters.add(new Monster("Podradny nóż", "Velen", 5, "Troll"));

        return monsters;
    }


}
