
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Parque parque = new Parque(10);

        Visitante Franco = new Visitante("Franco", "Menichetti");
        Visitante Edu = new Visitante("Eduardo", "Lopez");
        Visitante Meli = new Visitante("Meli", "Hempel");
        Visitante Iker = new Visitante("Iker", "Menichetti");
        Visitante Cobi = new Visitante("Cobija", "NN");
        Visitante Lio = new Visitante("Lio", "Lopez");
        Visitante Magui = new Visitante("Magui", "Lopez");
        Visitante v1 = new Visitante("Magui", "Lopez");
        Visitante v2 = new Visitante("Magui", "Lopez");
        Visitante v3 = new Visitante("Magui", "Lopez");
        Visitante v4 = new Visitante("Magui", "Lopez");

        parque.agregarVisitante(Franco);
        parque.agregarVisitante(Edu);
        parque.agregarVisitante(Meli);
        parque.agregarVisitante(Iker);
        parque.agregarVisitante(Cobi);
        parque.agregarVisitante(Lio);
        parque.agregarVisitante(Magui);
        parque.agregarVisitante(v1);
        parque.agregarVisitante(v2);
        parque.agregarVisitante(v3);
        parque.agregarVisitante(v4);
        
        parque.getContadorVisitantes();
        
        parque.quitarVisitante(v3);
        parque.agregarVisitante(v4);
        
       parque.getContadorVisitantes();
       
       parque.atraccionZamba(Cobi);
       parque.atraccionZamba(Iker);
       parque.atraccionZamba(Magui);
       parque.atraccionZamba(Lio);
       
       parque.getContadorVisitantes();
       parque.consultaHijo(117);

    }

}
