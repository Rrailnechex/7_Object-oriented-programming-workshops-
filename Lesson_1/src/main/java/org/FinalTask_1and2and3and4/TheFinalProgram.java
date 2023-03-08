package org.FinalTask_1and2and3and4;

/* Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
*/

public class TheFinalProgram {
    public static void main(String[] args) {
        //System.out.println("HI Program_02a_test");
        //HotDrink_02a coffe = new HotDrink_02a("The Coffe !!!!!!!!", 5, 7500);
        //System.out.println(coffe.toString());

        HotDrinksTradeAutomat_02a automat_with_tea = new HotDrinksTradeAutomat_02a("automat with tea");
        automat_with_tea.addPriduct("brittish tea", 5, 75);
        automat_with_tea.addPriduct("russian tea", 5, 23);
        automat_with_tea.addPriduct("tea de egreen", 6, 10);
        automat_with_tea.addPriduct("airish tea", 10, 11);
        automat_with_tea.printInventoryToConsole();

        HotDrinksTradeAutomat_02a automat_with_coffe = new HotDrinksTradeAutomat_02a("automat with coffe");
        automat_with_coffe.addPriduct("airish coffe", 10, 60);
        automat_with_coffe.addPriduct("latte", 8, 60);
        automat_with_coffe.addPriduct("boristo", 5, 20);
        automat_with_coffe.addPriduct("italiano", 5, 10);
        automat_with_coffe.addPriduct("el kava de los gatitos", 15, 60);
        automat_with_coffe.printInventoryToConsole();

    }
}
