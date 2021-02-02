package Film.control;

import Film.app.MockFilmDisplay;
import Film.model.Film;
import Film.view.FilmDisplay;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Luzma
 */
public class NewCommand implements Command{
    private List<Film> films;

    public NewCommand(List<Film> films) {
        this.films = films;
    }
    
    @Override
    public void execute() {
        films.sort( new Comparator <Film>() {
            @Override
            public int compare(Film t, Film t1) {
                return newer(t, t1);
            }

            private int newer(Film t, Film t1) {
                int age = t.getAge();
                int age1 = t1.getAge();
                if (age < age1) return -1;
                if (age > age1) return 1;
                else return 0;
            }
        
        });
    
        showAllFilm(films);
    } 

    private void showAllFilm(List<Film> films) {
        FilmDisplay filmDisplay = new MockFilmDisplay();
        for (Film film : films) {
            filmDisplay.show(film);
        }
    }
}    
