package org.launchcode.java.studios.restaurantmenu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menu = new ArrayList<>();
    private LocalDate lastUpdated;

    public void addItem(MenuItem menuItem) {
        this.menu.add(menuItem);
        this.lastUpdated = LocalDate.now();
    }

    public void removeItem(MenuItem menuItem) {
        this.menu.remove(menuItem);
        this.lastUpdated = LocalDate.now();
    }
    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    @Override
    public String toString() {
        String printedMenu = "";
        for (MenuItem item : this.menu) {
            printedMenu += item.toString() + "\n";
        } return printedMenu + "\nLast Updated: " + this.lastUpdated;
    }

}
