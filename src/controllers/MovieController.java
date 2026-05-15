package controllers;

import models.Movie;

public class MovieController {

    /**
     * Método que debe ser implementado
     * Debe ordenar el arreglo de películas por título en orden ascendente.
     * 
     * @param movies Arreglo de películas a ordenar
     */

     /// 

     //Insercion
    public void sortByTitle(Movie[] movies) {
        for(int i = 0; i < movies.length; i++ ){
            int pos = i;
            Movie aux = movies[i];
            while((pos > 0) && (movies[pos + 1].getTitle().compareTo(aux.getTitle())>0)){
                
            }
            
        }      
    }

}
