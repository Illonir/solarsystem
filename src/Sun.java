public class Sun extends AstroObject{
    private static final int MAX_PLANETS = 8;
    private double surfaceTemp; //K
    private AstroObject[] planets;
    private int numPlanets;

    public Sun(String name, double mass, double radius, double rotoTime, double surfaceTemp) {
        super(name, mass, radius, rotoTime);
        this.surfaceTemp = surfaceTemp;
        planets = new AstroObject[MAX_PLANETS];
        numPlanets = 0;
    }

    public void addPlanet(AstroObject planet) {
        if (numPlanets < MAX_PLANETS) {
            planets[numPlanets] = planet;
            numPlanets++;
        }
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Surface temperature: " + surfaceTemp + " K");
        if (numPlanets > 0) printSatellites();
    }

    @Override
    public void printSatellites() {
        System.out.println("Planets:");
        for (int i = 0; i < numPlanets; i++) {
            System.out.println("\t [" + i + "]" + planets[i].getName());
        }
    }

    public AstroObject[] getPlanets() {
        return planets;
    }

    public double getSurfaceTemp() {
        return surfaceTemp;
    }

    public Sun setSurfaceTemp(double surfaceTemp) {
        this.surfaceTemp = surfaceTemp;
        return this;
    }
}
