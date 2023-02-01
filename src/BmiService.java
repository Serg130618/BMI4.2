public class BmiService {

    public double calculate(int weight, double height) {
        return (weight * 100)/ (height + height);
    }
}
