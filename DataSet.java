public class DataSet {
    private int x[];
    private int y[];

    public DataSet() {

        x = new int[] {651,762,856,1063,1190,1298,1421,1440,1518};
        y = new int[] {23,25,30,34,43,48,52,57,58};

        //y = new int[] {-3, -2, -1, 0, 1, 2, 3};
        //x = new int[] {7, 3, 0, 1, 3, 6, 14};

    }

    public int[] getX() {
        return this.x;
    }
 
    public int[] getY() {
        return this.y;
    }

}
