public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("-----------------------------| SIMPLE |-----------------------------");
        main.calculateSimpleLinearRegression(2345);
        System.out.println("----------------------------| QUADRATIC |----------------------------");
        main.calculateQuadraticRegression(100);
    }

    public void calculateSimpleLinearRegression(int newXLinear) {
        DataSet ds = new DataSet();
        int[] xData = ds.getX();
        int[] yData = ds.getY();

        // Calcular la regresión lineal simple
        SimpleLinearRegression linearRegression = new SimpleLinearRegression();
        linearRegression.fit(xData, yData);

        // Obtener los coeficientes de la regresión lineal
        double slopeLinear = linearRegression.getSlope();
        double interceptLinear = linearRegression.getIntercept();

        // Imprimir la ecuación de regresión lineal
        System.out.println("Ecuación de regresión lineal: Y = " + slopeLinear + " * X + " + interceptLinear);

        // Predecir el valor de Y para un nuevo valor de X usando regresión lineal
        double predictedYLinear = linearRegression.predict(newXLinear);
        System.out.println("Predicción lineal para X = " + newXLinear + ": Y = " + predictedYLinear);
    }

    public void calculateQuadraticRegression(int newXQuadratic) {
        DataSet ds = new DataSet();
        int[] xData = ds.getX();
        int[] yData = ds.getY();

        // Calcular la regresión cuadrática
        QuadraticLinearRegression quadraticRegression = new QuadraticLinearRegression();
        quadraticRegression.fit(xData, yData);

        // Obtener los coeficient es de la regresión cuadrática
        double aQuadratic = quadraticRegression.getA();
        double bQuadratic = quadraticRegression.getB();
        double cQuadratic = quadraticRegression.getC();

        // Imprimir la ecuación de regresión cuadrática
        System.out.println("Ecuación de regresión cuadrática: Y = " + aQuadratic + " * X^2 + " + bQuadratic + " * X + " + cQuadratic);

        // Predecir el valor de Y para un nuevo valor de X usando regresión cuadrática
        double predictedYQuadratic = quadraticRegression.predict(newXQuadratic);
        System.out.println("Predicción cuadrática para X = " + newXQuadratic + ": Y = " + predictedYQuadratic);
    }
}