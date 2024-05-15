
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
public class Parque {

    private Queue<Visitante> visitantes; //Total del parque
    private Queue<Visitante> salidaVisitantes; //Total del parque
    private Queue<Visitante> zambaRock;
    private Queue<Visitante> botes;
    private Queue<Visitante> montaniaRusa;
    private int capacidadParque; //Capacidad del parque 
    private int contadorVisitantes; //Contador visitantes 
    private int capacidadZamba = 3; //Capacidad del zamba
    private int capacidadBotes = 3; //Capacidad del botes 
    private int capacidadMontania = 3; //Capacidad del montania 

    public Parque(int capacidadParque) {
        this.capacidadParque = capacidadParque; //Control de capacidadParque
        visitantes = new LinkedList<>();
        salidaVisitantes = new LinkedList<>();
        zambaRock = new LinkedList<>();
        botes = new LinkedList<>();
        montaniaRusa = new LinkedList<>();
        contadorVisitantes = 0;
    }

    public void getContadorVisitantes() {
        contadorVisitantes = visitantes.size() + zambaRock.size() + montaniaRusa.size() + botes.size();
        System.out.println("------------------------------");
        System.out.println("Cantidad en el parque " + visitantes.size());
        System.out.println("Cantidad en el zamba " + zambaRock.size());
        System.out.println("Cantidad en el montania rusa " + montaniaRusa.size());
        System.out.println("Cantidad en el botes " + botes.size());
        System.out.println("La cantidad actual en el parque es de: " + contadorVisitantes);
        System.out.println("------------------------------");
    }

    public void setContadorVisitantes(int contadorVisitantes) {
        this.contadorVisitantes = contadorVisitantes;
    }

    public Queue<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(Queue<Visitante> visitantes) {
        this.visitantes = visitantes;
    }

    public Queue<Visitante> getZambaRock() {
        return zambaRock;
    }

    public void setZambaRock(Queue<Visitante> zambaRock) {
        this.zambaRock = zambaRock;
    }

    public Queue<Visitante> getBotes() {
        return botes;
    }

    public void setBotes(Queue<Visitante> botes) {
        this.botes = botes;
    }

    public Queue<Visitante> getMontaniaRusa() {
        return montaniaRusa;
    }

    public void setMontaniaRusa(Queue<Visitante> montaniaRusa) {
        this.montaniaRusa = montaniaRusa;
    }

    public int getCapacidad() {
        return capacidadParque;
    }

    public void setCapacidad(int capacidadParque) {
        this.capacidadParque = capacidadParque;
    }

    public void agregarVisitante(Visitante visitante) {

        if (visitantes.size() < capacidadParque) {
            if (visitantes.add(visitante)) {
                System.out.println("---------------------------");
                System.out.println("Se agrego visitante con Exito");
                System.out.println("Ticket nro: " + visitante.id);
                System.out.println("---------------------------");
            } else {
                System.out.println("---------------------------");
                System.out.println("Ya existe ese ticket, intente nuevamente");
                System.out.println("---------------------------");
            }
        } else {
            System.out.println("---------------------------");
            System.out.println("Parque lleno, lo esperamos en otro momento");
            System.out.println("---------------------------");
        }
    }

    public void quitarVisitante(Visitante salida) {
        Visitante aux = null;
        if (!visitantes.isEmpty()) {
            for (Visitante visitante : visitantes) {
                if (visitante.getId() == salida.getId()) {
                    aux = visitante;
                }
            }
            visitantes.remove(aux); //se remueve de parque
            salidaVisitantes.add(aux); //se agrega a lista de salida
            System.out.println("---------------------------");
            System.out.println("Salida correcta, Gracias por visitarnos");
            System.out.println("Vuelvas prontos");
            System.out.println("---------------------------");
        } else {
            System.out.println("---------------------------");
            System.out.println("No hay nadie en el parque aun");
            System.out.println("---------------------------");
        }
    }

    public void verificarCapacidad() {
        System.out.println("---------------------------");
        System.out.println("Capacidad total: " + capacidadParque + " ocupacion actual: " + visitantes.size());
        System.out.println("---------------------------");
    }

    public void atraccionZamba(Visitante cola) {
        Visitante aux = null;
        for (Visitante visitante : visitantes) {
            if (visitante.getId() == cola.getId()) {
                aux = visitante;
            }
        }
        if (zambaRock.size() < capacidadZamba) { //si hay lugar lo agrego
            zambaRock.add(aux);
            visitantes.remove(aux);
            System.out.println("---------------------");
            System.out.println("Se agrego a la cola de zamba");
            System.out.println("---------------------");
        } else {
            System.out.println("---------------------");
            System.out.println("La fila esta llena, vuelva en unos minutos");
            System.out.println("---------------------");
        }
    }

    public void atraccionBotes(Visitante cola) {
        Visitante aux = null;
        for (Visitante visitante : visitantes) {
            if (visitante.getId() == cola.getId()) {
                aux = visitante;
            }
        }
        if (botes.size() < capacidadBotes) { //si hay lugar lo agrego
            botes.add(aux);
            visitantes.remove(aux);
            System.out.println("---------------------");
            System.out.println("Se agrego a la cola de zamba");
            System.out.println("---------------------");
        } else {
            System.out.println("---------------------");
            System.out.println("La fila esta llena, vuelva en unos minutos");
            System.out.println("---------------------");
        }
    }

    public void atraccionMontania(Visitante cola) {
        Visitante aux = null;
        for (Visitante visitante : visitantes) {
            if (visitante.getId() == cola.getId()) {
                aux = visitante;
            }
        }
        if (montaniaRusa.size() < capacidadMontania) { //si hay lugar lo agrego
            montaniaRusa.add(aux);
            visitantes.remove(aux);
            System.out.println("---------------------");
            System.out.println("Se agrego a la cola de zamba");
            System.out.println("---------------------");
        } else {
            System.out.println("---------------------");
            System.out.println("La fila esta llena, vuelva en unos minutos");
            System.out.println("---------------------");
        }
    }

    public void consultaHijo(int id) { //recibe numero de Id
        Visitante aux = null;
        boolean flag = false;
        for (Visitante visitante : visitantes) {
            if (visitante.getId() == id) {
                flag = true;
                System.out.println("La persona que busca esta en el parque");
            }
        }
        for (Visitante visitante : montaniaRusa) {
            if (visitante.getId() == id) {
                flag = true;
                System.out.println("La persona que busca esta en la montania rusa");
            }
        }
        for (Visitante visitante : botes) {
            if (visitante.getId() == id) {
                flag = true;
                System.out.println("La persona que busca esta en los botes");
            }

        }
        for (Visitante visitante : zambaRock) {
            if (visitante.getId() == id) {
                flag = true;
                System.out.println("La persona que busca esta en el zamba");
            }
        }
        if (!flag) {
            System.out.println("Lo lamentamos, aqui no esta esa persona");
        }

    }
}
