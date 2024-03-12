public class QuadraticLinearRegression {

    private double a, b, c;

    public void fit(int[] x, int[] y) {
        int n = x.length;
        DiscreteMaths dm = new DiscreteMaths();

        int sumX = dm.sumX(x);
        int sumY = dm.sumY(y);
        int sumXY = dm.sumXY(x, y);
        int sumXSquare = dm.sumXSquare(x);
        int sumXCube = dm.sumXCube(x);
        int sumXSquareY = dm.sumXSquareY(x, y);

        // Solving equations to find quadratic coefficients (a, b, c)
        double[][] equations = {
                {n, sumX, sumXSquare},
                {sumX, sumXSquare, sumXCube},
                {sumXSquare, sumXCube, sumXSquare * sumXSquare}
        };

        double[] results = {sumY, sumXY, sumXSquareY};

        Cleaner solver = new Cleaner();
        double[] coefficients = solver.solve(equations, results);

        // Assigning coefficients
        a = coefficients[0];
        b = coefficients[1];
        c = coefficients[2];
    }

    public double predict(int x) {
        return a * x * x + b * x + c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public static void calculateQuadraticRegression(int newXQuadratic) {
        DataSet ds = new DataSet();
        int[] xData = ds.getX();
        int[] yData = ds.getY();

        // Calcular la regresión cuadrática
        QuadraticLinearRegression quadraticRegression = new QuadraticLinearRegression();
        quadraticRegression.fit(xData, yData);

        // Obtener los coeficientes de la regresión cuadrática
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
