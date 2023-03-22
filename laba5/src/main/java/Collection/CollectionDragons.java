package Collection;

import data.Coordinates;
import data.Dragon;
import data.DragonCharacter;
import data.DragonHead;
import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionDragons {
    public static Deque<Dragon> getDragons() {
        return dragons;
    }

    private static Deque<Dragon> dragons = new ArrayDeque<>();
    Dragon dragon1 = new Dragon(Dragon.generate_id(), "Dracror", new Coordinates(1.7D, 120), LocalDateTime.now(), 120,
            13, 100, DragonCharacter.GOOD, new DragonHead((long) 123, 12.4, 145f));
    Dragon dragon2 = new Dragon(Dragon.generate_id(), "Draco", new Coordinates(13D, 71), LocalDateTime.now(), 1123,
            13, 167, DragonCharacter.GOOD, new DragonHead((long) 123, 12.4, 145f));
    Dragon dragon3 = new Dragon(Dragon.generate_id(), "Drac", new Coordinates(1D, 70), LocalDateTime.now(), 14,
            13, 267, DragonCharacter.GOOD, new DragonHead((long) 123, 12.4, 145f));
    Dragon dragon4 = new Dragon(Dragon.generate_id(), "D", new Coordinates(137D, 13), LocalDateTime.now(), 15,
            13, 367, DragonCharacter.GOOD, new DragonHead((long) 123, 12.4, 145f));
    Dragon dragon5 = new Dragon(Dragon.generate_id(), "lox", new Coordinates(7D, 9), LocalDateTime.now(), 1,
            13, 467, DragonCharacter.GOOD, new DragonHead((long) 123, 12.4, 145f));

    public void addElements() {
        dragons.add(dragon1);
        dragons.add(dragon2);
        dragons.add(dragon3);
        dragons.add(dragon4);
        dragons.add(dragon5);
    }

    public static String info() {
        int size = CollectionDragons.getDragons().size();
        String result = "Размер коллекции: " + size + '\n' + "Тип коллекции: ArrayDeque" + '\n' + "Дата инициализации: " + LocalDateTime.now();
        return result;
    }
}
