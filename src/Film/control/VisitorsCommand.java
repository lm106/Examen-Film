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
public class VisitorsCommand implements Command{
    private List<Film> films;
    
    public VisitorsCommand(List<Film> films) {
        this.films = films;
    }

    @Override
    public void execute() {
        films.sort( new Comparator <Film>() {
            @Override
            public int compare(Film t, Film t1) {
                return visitor(t, t1);
            }

            private int visitor(Film t, Film t1) {
                int visitor = t.getVisitor();
                int visitor1 = t1.getVisitor();
                if (visitor < visitor1) return -1;
                if (visitor > visitor1) return 1;
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
