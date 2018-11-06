package pl.marcinkulwicki.second;

public class Monster {

    private String name;
    private String locationName;
    private int lvl;
    private String race;

    public Monster(String name, String locationName, int lvl, String race) {
        this.name = name;
        this.locationName = locationName;
        this.lvl = lvl;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public String getLocationName() {
        return locationName;
    }

    public int getLvl() {
        return lvl;
    }

    public String getRace() {
        return race;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return name+" "+locationName+" "+"LVL: "+lvl+" "+race;
    }
}
