public class Planet extends AstroObject {
    private static final int MAX_MOONS = 200;
    private int numMoons;       //no unit
    private double orbitTime;   //days
    private double orbitRadius; //km - 1000m
    private AstroObject[] moons;

    public Planet(String name, double mass, double radius, double rotoTime, double orbitTime, double orbitRadius) {
        super(name, mass, radius, rotoTime);
        this.numMoons = 0;
        this.orbitTime = orbitTime;
        this.orbitRadius = orbitRadius;
        moons = new AstroObject[MAX_MOONS];
    }

    public void addMoon(AstroObject moon) {
        if (numMoons < MAX_MOONS) {
            moons[numMoons] = moon;
            numMoons++;
        }
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Orbit time: " + orbitTime + " days");
        System.out.println("Orbit radius: " + orbitRadius + " km");
        if (numMoons > 0) printSatellites();
    }

    @Override
    public void printSatellites() {
        System.out.println("Moons:");
        for (int i = 0; i < numMoons; i++) {
            System.out.println("\t [" + i + "]" + moons[i].getName());
        }
    }

    public AstroObject[] getMoons() {
        return moons;
    }

    public int getNumMoons() {
        return numMoons;
    }

    public double getOrbitRadius() {
        return orbitRadius;
    }

    public Planet setOrbitRadius(double orbitRadius) {
        this.orbitRadius = orbitRadius;
        return this;
    }

    public double getOrbitTime() {
        return orbitTime;
    }

    public Planet setOrbitTime(double orbitTime) {
        this.orbitTime = orbitTime;
        return this;
    }

//    public String notacja(double liczba, int potega) {
//        StringBuilder s = new StringBuilder(String.valueOf(liczba));
//        for (int i = 0; i < potega; i++) {
//            s.append("0");
//        }
//        return s.toString();
//
//    }
}
