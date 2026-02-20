import java.util.Random;
public class TestSensor {
    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[5];
        Random rand = new Random();
        double sum = 0;
            for (int i = 0; i < sensors.length; i++) {
            double temp = -60 + rand.nextDouble() * 120;
            sensors[i] = new Sensor("location " + (i + 1), temp);
            System.out.println("sensor " + (i + 1) + " reading: " + sensors[i].getReading());
            sum += sensors[i].getReading();
        }
        double average = sum / sensors.length;
        System.out.println("avg temp: " + average);
    }
}