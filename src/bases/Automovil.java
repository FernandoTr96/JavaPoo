package bases;

import enums.AutomovilTransmisionEnum;

public class Automovil {

    // acceso privado para cosas que no quieres que se modifiquen desde afuera
    private int kilometraje;
    // acceso publico para cosas que se modifican constantemente
    public String fabricante;
    public String modelo;
    public String color;
    // acceso solo a clases que heredan
    protected AutomovilTransmisionEnum transmision;
    // constantes
    final int ruedas = 4;

    // constructor
    public Automovil() {}

    // sobrecarga: diferentes modelos para crear el objeto

    public Automovil(String fabricante){
        this.fabricante = fabricante;
    }

    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }


    // metodos
    public void verFichaTecnica(){
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.color);
        System.out.println("Kilometraje: " + this.kilometraje);
        System.out.println("Número de ruedas: " + this.ruedas);
    }

    // acceso a atributos privados
    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
}
