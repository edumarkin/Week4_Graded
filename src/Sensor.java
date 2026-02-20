public class Sensor {
    String location;
    double reading;

    public Sensor(String location, double reading) {
        this.location = location;

        if (reading < -50.0 || reading > 50.0) {
            this.reading = 0.0;   // default value
        } else {
            this.reading = reading;
        }
    }

    public double getReading() {
        return reading;
    }

    public String getLocation() {
        return location;
    }
}
