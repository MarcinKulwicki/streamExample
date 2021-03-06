package pl.marcinkulwicki.second;

import java.util.ArrayList;
import java.util.List;

public class MonstersCreator {

    public List<Monster> loadAllMonstersList(){

        List<Monster> monsters = new ArrayList<Monster>();

        monsters.add(new Monster("Bryczek zjadacz", "Mordor", 25, "Orc"));
        monsters.add(new Monster("Niebiański obgryzacz", "Mordor", 20, "Orc"));
        monsters.add(new Monster("Arystokratyczny jeż", "Mordor", 10, "Troll"));
        monsters.add(new Monster("Podradny nóż", "Velen", 5, "Troll"));

        return monsters;
    }

    public Monster[] loadAllMonstersTab(){

        Monster [] monsters = {
                new Monster("Bryczek zjadacz", "Mordor", 25, "Orc"),
                new Monster("Niebiański obgryzacz", "Mordor", 20, "Orc"),
                new Monster("Arystokratyczny jeż", "Mordor", 10, "Troll"),
                new Monster("Podradny nóż", "Velen", 5, "Troll")
        };
        return monsters;
    }


    /*
    Talizman:

    Podstawa:
        X Magia i miecz

    Dodatki duze:
        X Podziemia
        Gory
        Smoki
        Miasto
        Las
        ?Kataklizm

    Male dodatki:
        X Zniwiaz
        Krolowa Lodu
        X Pani Jeziora
        X Wilkolak
        Puszka Pandory
        Kraina Ognia
        Zwiastun
        Krainy Otmetow
     */
}
