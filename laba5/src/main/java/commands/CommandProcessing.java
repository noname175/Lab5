package commands;

import java.util.Objects;
import java.util.Scanner;

public class CommandProcessing {
    String s;

    public void switchCommands() {
        System.out.print("enter command: ");
        while (!Objects.equals(s, "exit")) {
            Scanner scanner = new Scanner(System.in);
            s = scanner.nextLine();
            switch (s) {
                case "help":
                    new HelpCommand().help();
                    System.out.print("enter command: ");
                    break;
                case "info":
                    new InfoCommand().info();
                    System.out.print("enter command: ");
                    break;
                case "clear":
                    new ClearCommand().clear();
                    System.out.print("enter command: ");
                    break;
                case "show":
                    new ShowCommand().show();
                    System.out.print("enter command: ");
                    break;
                case "update":
                    new UpdateCommand().update();
                    System.out.print("enter command: ");
                    break;
                case "remove_first":
                    new RemoveFirstCommand().remove_first();
                    System.out.print("enter command: ");
                    break;
                case "remove_by_id":
                    new RemoveById().remove_by_id();
                    System.out.print("enter command: ");
                    break;
                case "remove_greater":
                    new RemoveGreaterCommand().removeGreater();
                    System.out.print("enter command: ");
                    break;
                case "remove_any_by_head":
                    new RemoveAnyByHead().remove_any_by_head();
                    System.out.print("enter command: ");
                    break;
                case "max_by_coordinates":
                    new MaxByCoordinates().max_by_coordinates();
                    System.out.print("enter command: ");
                    break;
                case "exit":
                    System.out.println("До свидания");
                    System.exit(0);
                default:
                    System.out.println("Такой команды нет, воспользуйтесь командой help, чтобы увидеть список команд");
                    System.out.print("enter command: ");
            }
        }
    }
}
