import java.io.*;
import java.util.ArrayList;

public class SolarSystem implements Serializable {
    private Sun sun;
    private ArrayList<Planet> planets;
    private ArrayList<Moon> moons;

    public SolarSystem(Sun sun) {
        this.sun = sun;
        planets = new ArrayList<>();
        moons = new ArrayList<>();
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void addMoon(Moon moon) {
        moons.add(moon);
    }

    public void print() {
        System.out.println("Solar System:");
        System.out.println("\n\tSun:");
        sun.print();
        System.out.println("\n\tPlanets:");
        for (Planet planet : planets) {
            planet.print();
        }
        System.out.println("\n\tMoons:");
        for (Moon moon : moons) {
            moon.print();
        }
    }

    public boolean saveSolarSystem(String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in " + filename);
            return true;
        } catch (IOException i) {
            i.printStackTrace();
            return false;
        }
    }

    public SolarSystem loadSolarSystem(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            SolarSystem solarSystem = (SolarSystem) in.readObject();
            in.close();
            fileIn.close();
            return solarSystem;
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("SolarSystem class not found");
            c.printStackTrace();
            return null;
        }
    }

}
