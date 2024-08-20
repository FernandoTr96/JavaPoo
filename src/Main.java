import bases.Automovil;

public class Main {
    public static void main(String[] args) {
        Automovil ibiza = new Automovil("Kia");
        ibiza.fabricante = "Seat";
        ibiza.modelo = "Seat Ibiza 2009";
        ibiza.color = "Gris";
        ibiza.setKilometraje(10000);
        ibiza.verFichaTecnica();
        System.out.println("================================");
        Automovil Kia = new Automovil();
        ibiza.fabricante = "Kia";
        ibiza.modelo = "Kia 2019";
        ibiza.color = "Azul";
        ibiza.setKilometraje(78000);
        ibiza.verFichaTecnica();
    }
}