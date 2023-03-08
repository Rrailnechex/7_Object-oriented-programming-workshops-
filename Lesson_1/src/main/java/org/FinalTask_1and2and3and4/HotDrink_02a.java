package org.FinalTask_1and2and3and4;

public class HotDrink_02a {
    /**
     * Температура напитка
     */
    public String name;
    public int volume;
    public int temperature;

    /**
     * Сщздать напиток2
     */
    public HotDrink_02a(String nname, int nvolume, int ntemperature) {
        name = nname;
        volume=nvolume;
        temperature=ntemperature;
    }

    @Override
    public String toString(){
        //return String.format("name: %d; volume: %d; temperature: %d", name, volume, temperature);
        return ("name: " + name + "; volume: " + volume + "; temperature: " + temperature);
    }
}