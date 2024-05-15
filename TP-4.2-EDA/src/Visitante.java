
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class Visitante {

    private static int contadorId = 100;
    public int id;
    public String nombre;
    public String Apellido;

    public Visitante(String nombre, String Apellido) {
        id = generarIdConsecutivo();
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "Visitante{" + "id=" + id + ", nombre=" + nombre + ", Apellido=" + Apellido + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Visitante other = (Visitante) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    // Método para generar un ID consecutivo
    private int generarIdConsecutivo() {
        return contadorId++;
    }

}
