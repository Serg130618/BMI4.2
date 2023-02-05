public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 68;
        int height = 168;
        double Bmiservice = service.calculate(weight, height);
        System.out.println(Bmiservice);
    }
}