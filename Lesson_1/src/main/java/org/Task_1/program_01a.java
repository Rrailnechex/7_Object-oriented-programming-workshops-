package org.Task_1;

/*Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура */

public class program_01a {
    public static void main(String[] args) {
        System.out.println("HI");
        HotDrink_01a chai = new HotDrink_01a(75);
        System.out.println(chai.getTemperature());
    }
}
