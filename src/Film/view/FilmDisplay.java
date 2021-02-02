package Film.view;

import Film.model.Film;
import Film.model.Valoracion;

/**
 *
 * @author Luzma
 */
public interface FilmDisplay {
    public void show(Film film);
    public void valorar(Film film, Valoracion valor);
    
}
