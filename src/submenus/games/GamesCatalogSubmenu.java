package submenus.games;

import games.GameDisplayer;
import interfaces.Menu;
import menus.GamesMenu;

import utils.GlobalFunctions;

public class GamesCatalogSubmenu implements Menu {

    String title = "GAMES MENU > Game catalog";
    String[] menuItems = { "Show all games", "Show games (genre)" };

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String[] getMenuItems() {
        return menuItems;
    }

    @Override
    public void processUserChoice(int choice) {
        switch (choice) {
            case 1 -> GameDisplayer.showAllGames(getTitle());
            case 2 -> GameDisplayer.chooseGenreAndShowGames(getTitle());
            case 3 -> System.out.println("You selected Option 3.");
            case 9 -> new GamesMenu().initiateMenu();
            case 0 -> GlobalFunctions.closeProgram();
            default -> System.out.println("Invalid choice. Please enter a valid option.");
        }
    }
}
