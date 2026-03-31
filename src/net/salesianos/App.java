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

        // f. Crear guerrero Thorak
        Guerrero thorak = new Guerrero("Thorak", 5, "Hacha doble");

        // g. Ataque pesado
        thorak.ataquePesado();

        // h. Descansar 10 puntos
        thorak.descansar(10);

        // i. Mostrar informacion del guerrero
        thorak.mostrarInfo();

        // j. Mostrar total de personajes
        Personaje.mostrarTotalPersonajes();

        // k. Crear mago Lyra
        Mago lyra = new Mago("Lyra", 4, "Hielo");

        // l. Ataque elemental
        lyra.ataqueElemental();

        // m. Entrenar 2 niveles
        lyra.entrenar(2);

        // n. Mostrar informacion del mago
        lyra.mostrarInfo();

        // o. Mostrar total de personajes
        Personaje.mostrarTotalPersonajes();

    }
}
