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

        GaussianElimination solver = new GaussianElimination();
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
}
