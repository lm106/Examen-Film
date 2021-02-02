package Film.app;

import Film.model.Caratula;
import Film.model.Film;
import Film.view.FilmLoader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luzma
 */
public class MockFilmLoader implements FilmLoader{

    @Override
    public List<Film> load() {
        List <Film> list = new ArrayList<>();
        String []actors = { "Maria", "Pepe", "Pablo"};
        list.add(new Film("Don Quijote", "Pepe Sanchéz","Drama, Thriller", 1998, 0, 1.45, actors, new Caratula()));
        list.add(new Film("Star Wars", "George Lucas","Ciencia Ficción", 2001, 7, 1.75, actors, new Caratula()));
        list.add(new Film("Sal y Mar", "Maria Falcón", "Comedia", 2015, 12, 2.05, actors, new Caratula()));
        return list;
    }
    
}
