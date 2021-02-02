package Film.app;

import Film.control.Command;
import Film.control.GenderCommand;
import Film.control.NewCommand;
import Film.control.ValoracionCommand;
import Film.control.VisitorsCommand;
import Film.model.Film;
import Film.view.FilmDisplay;
import Film.view.FilmLoader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Luzma
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Map<String, Command> command = initCommands(new MockFilmLoader());
        while(true){
            new Main().execute(scanner.next(), command);
        }
        
    }
    private FilmDisplay filmDisplay;
    private static List<Film> list;
    
    private static Map<String, Command> initCommands(FilmLoader filmLoader) {
        List<Film> films = filmLoader.load();
        Main.list = films;
        Map<String, Command> actions = new HashMap<>();
        actions.put("Gender",new GenderCommand(films));
        actions.put("Visitor",new VisitorsCommand(films));
        actions.put("Valoracioon",new ValoracionCommand(films));
        actions.put("New",new NewCommand(films));
        return actions;
    }

    private void execute(String orden, Map <String, Command> command) {
        command.getOrDefault(orden, new ValoracionCommand(this.list));
    }
    
}
