public class Moon extends AstroObject{
    private double orbitRadius;    //km - 1000m
    private double orbitTime;   //days

    public Moon(String name, double mass, double radius, double rotoTime, double orbitRadius, double orbitTime) {
        super(name, mass, radius, rotoTime);
        this.orbitRadius = orbitRadius;
        this.orbitTime = orbitTime;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Orbit radius: " + orbitRadius + " km");
        System.out.println("Orbit time: " + orbitTime + " days");
    }

    public double getOrbitTime() {
        return orbitTime;
    }

    public Moon setOrbitTime(double orbitTime) {
        this.orbitTime = orbitTime;
        return this;
    }

    public double getOrbitRadius() {
        return orbitRadius;
    }

    public Moon setOrbitRadius(int orbitRadius) {
        this.orbitRadius = orbitRadius;
        return this;
    }
}
