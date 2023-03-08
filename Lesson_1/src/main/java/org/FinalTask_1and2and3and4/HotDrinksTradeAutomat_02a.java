package org.FinalTask_1and2and3and4;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksTradeAutomat_02a {
    public List<Object> listOfDrinks = new ArrayList<>();
    public String HotDrinksTradeAutomatName;

    public HotDrinksTradeAutomat_02a(String nHotDrinksTradeAutomatName) {
        HotDrinksTradeAutomatName = nHotDrinksTradeAutomatName;
    }

    public void addPriduct(String nname, int nvolume, int ntemperature){
        listOfDrinks.add(new HotDrink_02a(nname,nvolume,ntemperature));
    }

    public void printInventoryToConsole(){
        System.out.println("----------------------");
        System.out.println(HotDrinksTradeAutomatName.toUpperCase() + " CONTEINS:");
        for (int i = 0; i < listOfDrinks.size(); i++) {
            System.out.println(i+1 + " " + listOfDrinks.get(i).toString());
        }
        System.out.println("----------------------");
    }
}
