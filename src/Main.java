public class Main {
    public static void main(String[] args) {
        Sun sol = new Sun("Sol", 1.989e30, 695700, 25.38, 5778);

        Planet mercury = new Planet("Mercury", 3.285e23, 2439.7, 58.646, 87.969, 57909050);
        Planet venus = new Planet("Venus", 4.867e24, 6051.8, 243.018, 224.701, 108208000);
        Planet earth = new Planet("Earth", 5.972e24, 6371.0, 0.99726968, 365.256363004, 149598261);
        Planet mars = new Planet("Mars", 6.39e23, 3389.5, 1.025957, 686.971, 227943820);
        Planet jupiter = new Planet("Jupiter", 1.898e27, 69911, 0.41354, 4332.59, 778340821);
        Planet saturn = new Planet("Saturn", 5.683e26, 58232, 0.44401, 10759.22, 1426666422);
        Planet uranus = new Planet("Uranus", 8.681e25, 25362, 0.71833, 30688.5, 2870658186L);
        Planet neptune = new Planet("Neptune", 1.024e26, 24622, 0.67125, 60182, 4498396441L);

        Moon luna = new Moon("Luna", 7.34767309e22, 1737.1, 27.321661, 384399, 27.321661);
        Moon phobos = new Moon("Phobos", 1.0659e16, 11.2667, 0.31891023, 9376, 0.31891023);
        Moon deimos = new Moon("Deimos", 1.4762e15, 6.2, 1.263, 23463.2, 1.263);
        Moon io = new Moon("Io", 8.931938e22, 1821.6, 1.769137786, 421700, 1.769137786);
        Moon europa = new Moon("Europa", 4.799844e22, 1560.8, 3.551181, 671034, 3.551181);
        Moon ganymede = new Moon("Ganymede", 1.4819e23, 2634.1, 7.154553, 1070412, 7.154553);
        Moon callisto = new Moon("Callisto", 1.075938e23, 2410.3, 16.6890184, 1882709, 16.6890184);
        Moon titan = new Moon("Titan", 1.3452e23, 2574.73, 15.945421, 1221870, 15.945421);

        earth.addMoon(luna);
        mars.addMoon(phobos);
        mars.addMoon(deimos);
        jupiter.addMoon(io);
        jupiter.addMoon(europa);
        jupiter.addMoon(ganymede);
        jupiter.addMoon(callisto);
        saturn.addMoon(titan);

        sol.addPlanet(mercury);
        sol.addPlanet(venus);
        sol.addPlanet(earth);
        sol.addPlanet(mars);
        sol.addPlanet(jupiter);
        sol.addPlanet(saturn);
        sol.addPlanet(uranus);
        sol.addPlanet(neptune);

//        sol.print();
//
//        mercury.print();
//        venus.print();
//        earth.print();
//        mars.print();
//        jupiter.print();
//        saturn.print();
//        uranus.print();
//        neptune.print();
//
//        luna.print();
//        phobos.print();
//        deimos.print();
//        io.print();
//        europa.print();
//        ganymede.print();
//        callisto.print();
//        titan.print();

        SolarSystem solSystem = new SolarSystem(sol);
        solSystem.addPlanet(mercury);
        solSystem.addPlanet(venus);
        solSystem.addPlanet(earth);
        solSystem.addPlanet(mars);
        solSystem.addPlanet(jupiter);
        solSystem.addPlanet(saturn);
        solSystem.addPlanet(uranus);
        solSystem.addPlanet(neptune);

        solSystem.addMoon(luna);
        solSystem.addMoon(phobos);
        solSystem.addMoon(deimos);
        solSystem.addMoon(io);
        solSystem.addMoon(europa);
        solSystem.addMoon(ganymede);
        solSystem.addMoon(callisto);
        solSystem.addMoon(titan);


        solSystem.print();


    }
}