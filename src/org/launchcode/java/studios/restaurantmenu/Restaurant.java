package org.launchcode.java.studios.restaurantmenu;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem menuItem1 = new MenuItem("Pizza", 15.00, "Deep dish with veggies.", "Main Course");
        MenuItem menuItem2 = new MenuItem("Poutine", 9.99, "Fries with gravy and cheese curds.", "Appetizer");
        MenuItem menuItem3 = new MenuItem("Tacos", 12.50, "Fish tacos.", "Main Course");
        MenuItem menuItem4 = new MenuItem("Ice Cream", 5.99, "Soy peanut butter ice cream.", "Desserts");

        Menu newMenu = new Menu();

        newMenu.addItem(menuItem1);
        newMenu.addItem(menuItem2);
        newMenu.addItem(menuItem3);
        newMenu.addItem(menuItem4);
        menuItem3.changeIsNew();

        System.out.println(newMenu);

    }

}
