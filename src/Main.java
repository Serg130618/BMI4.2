public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 82;
        int height = 170;
        double Bmiservice = service.calculate(weight, height);
        System.out.println(Bmiservice);
    }
}