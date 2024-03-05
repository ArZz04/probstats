public class GaussianElimination {
    public double[] solve(double[][] A, double[] b) {
        int n = b.length;

        for (int i = 0; i < n; i++) {
            int maxRow = i;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(A[j][i]) > Math.abs(A[maxRow][i])) {
                    maxRow = j;
                }
            }

            // Swap rows
            double[] temp = A[i];
            A[i] = A[maxRow];
            A[maxRow] = temp;

            double t = b[i];
            b[i] = b[maxRow];
            b[maxRow] = t;

            // Make this column 0 below the diagonal
            for (int j = i + 1; j < n; j++) {
                double alpha = A[j][i] / A[i][i];
                b[j] -= alpha * b[i];
                for (int k = i; k < n; k++) {
                    A[j][k] -= alpha * A[i][k];
                }
            }
        }

        // Back substitution
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < n; j++) {
                sum += A[i][j] * x[j];
            }
            x[i] = (b[i] - sum) / A[i][i];
        }

        return x;
    }
}