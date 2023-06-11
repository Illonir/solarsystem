import java.io.Serializable;

public class AstroObject implements Serializable {
    private String name;
    private double mass;        //kg
    private double radius;      //km - 1000m
    private double rotoTime;    //hours

    public AstroObject(String name, double mass, double radius, double rotoTime) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.rotoTime = rotoTime;
    }

    public double getDensity() {
        return mass / (4.0/3.0 * Math.PI * Math.pow(radius, 3));
    }

    public double getLinearVelocity() {
        return 2 * Math.PI * radius / (rotoTime * 3600);
    }

    public void print() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Mass: " + mass + " kg");
        System.out.println("Radius: " + radius + " km");
    }

    public void printSatellites() {
        System.out.println("No satellites");
    }

    public double getRotoTime() {
        return rotoTime;
    }

    public AstroObject setRotoTime(double rotoTime) {
        this.rotoTime = rotoTime;
        return this;
    }

    public double getRadius() {
        return radius;
    }

    public AstroObject setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    public double getMass() {
        return mass;
    }

    public AstroObject setMass(double mass) {
        this.mass = mass;
        return this;
    }

    public String getName() {
        return name;
    }

    public AstroObject setName(String name) {
        this.name = name;
        return this;
    }
}
