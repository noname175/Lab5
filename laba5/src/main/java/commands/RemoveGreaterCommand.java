package commands;

import Collection.CollectionDragons;
import data.Dragon;
import java.util.Scanner;
import java.util.Iterator;
import java.util.*;

public class RemoveGreaterCommand {

    public void removeGreater() {
        System.out.println("Введите значение weight");
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        List<Dragon> dragons = new ArrayList<>(CollectionDragons.getDragons());
        CollectionDragons.getDragons().sort();
//            if (dragons.get(i).getWeight() > weight) {
//                dragons.remove(dragons.get(i));
//            }
        }
    }
}
