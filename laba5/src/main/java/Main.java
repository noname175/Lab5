import Collection.CollectionDragons;
import commands.CommandProcessing;

public class Main {
    public static void main(String[] args) {
        CollectionDragons collectionDragons = new CollectionDragons();
        collectionDragons.addElements();
        new CommandProcessing().switchCommands();

    }
}
