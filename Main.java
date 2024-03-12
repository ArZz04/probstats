public class Main {

    public static void main(String[] nousan) {
        Main main = new Main();
        System.out.println("-----------------------------| SIMPLE |-----------------------------");
        SimpleLinearRegression.calculateSimpleLinearRegression(1519); // 1519
        System.out.println("----------------------------| QUADRATIC |----------------------------");
        System.out.println("--------------------------| IN MAINTENANCE |-------------------------");
        QuadraticLinearRegression.calculateQuadraticRegression(1600);
    }

}