package Film.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luzma
 * @version 02-02-2021 - 1
 */
public class Film {
    private final String title, director, gender;
    private final int age, calificacion;
    private int visitor = 0;
    private final double time;
    private final String [] actors;
    private final Caratula caratula;
    private final List<Valoracion> valorar = new ArrayList<>();
    
    public Film(String title, String director, String gender, int age, int calificacion, double time, String[] actors, Caratula caratula) {
        this.title = title;
        this.director = director;
        this.gender = gender;
        this.age = age;
        this.calificacion = calificacion;
        this.time = time;
        this.actors = actors;
        this.caratula = caratula;
    }
    public void setValoracion(Valoracion valor){
        valorar.add(valor);
    }
    public int getValoracion(){
        return valorar.size();
    }
    public void setvisitor(){
        visitor++;
    }
    public int getVisitor(){
        return this.visitor;
    }
    public String getDirector() {
        return director;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public double getTime() {
        return time;
    }

    public Caratula getCaratula() {
        return caratula;
    }
    public String getTitle() {
        return title;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    
}
