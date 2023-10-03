public class Calculator {
    private double velocity;
    private double distance;
    private double time;

    public void calculatedVelocity() {
        velocity = getDistance() / getTime();
        System.out.println("Du körde i " + velocity + " km/h.");
    }

    public void calculatedDistance() {
        distance = getVelocity() * getTime();
        if (distance > 10)
            System.out.println("Du körde " + distance/10 + " mil.");
        else
            System.out.println("Du körde " + distance + " km.");
    }

    public void calculatedTime() {
        time = getDistance() / getVelocity();
        if (time < 1)
            System.out.println("Du körde i " + time*60 + " minuter");
        else if (time > 1)
            System.out.println("Du körde i " + time + " timmar");
        else
            System.out.println("Du körde i " + time + " timme");
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
