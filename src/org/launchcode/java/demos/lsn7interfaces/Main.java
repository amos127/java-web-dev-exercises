package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();
        Comparator coneComparator = new ConeComparator();

        flavors.sort(comparator);

        cones.sort(coneComparator);

        System.out.println(flavors);
        System.out.println(cones);
    }
}
