public class ExpressionsEvaluation {
    public static void main(String[] args) {
        double x = 3.0 - ((56.0 - 12.0) / 44.0) * (4.0 / 2.0);
        System.out.println("x: " + x);

        double y = (2 * x) / (33 - x);
        System.out.println("y: " + y);

        double z = -x / (2 * y);
        System.out.println("z: " + z);
    }
}
