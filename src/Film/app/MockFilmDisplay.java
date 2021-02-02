package Film.app;

import Film.model.Film;
import Film.model.Valoracion;
import Film.view.FilmDisplay;

/**
 *
 * @author Luzma
 */
public class MockFilmDisplay implements FilmDisplay{
    @Override
    public void show(Film film) {
        System.out.println("Title: " + film.getTitle() + ", Género: " + film.getGender() + ", Año: " + film.getAge() + ", Calificación: " + film.getCalificacion());
    }
    
    @Override
    public void valorar(Film film, Valoracion valor) {
        film.setValoracion(valor);
    }
    
}
