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
public class GenderCommand implements Command{
    private List<Film> films;
    
    public GenderCommand(List<Film> films) {
        this.films = films;
    }
    
    @Override
    public void execute() {
        films.sort( new Comparator <Film>() {
            @Override
            public int compare(Film t, Film t1) {
                return gender(t, t1);
            }

            private int gender(Film t, Film t1) {
                String gender = t.getGender();
                String gender1 = t1.getGender();
                if (gender.compareTo(gender1) < 0) return -1;
                if (gender.compareTo(gender1) > 0 ) return 1;
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
