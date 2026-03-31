package net.salesianos;

public class App {
    public static void main(String[] args) {

        // a. Crear personaje viajero
        Personaje viajero = new Personaje("Eldrin", 3);

        // b. Entrenar 4 niveles
        viajero.entrenar(4);

        // c. Gastar 30 de energia
        viajero.gastarEnergia(30);

        // d. Mostrar informacion del personaje
        viajero.mostrarInfo();

        // e. Mostrar total de personajes
        Personaje.mostrarTotalPersonajes();

    }
}
