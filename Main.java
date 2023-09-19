public class Main {

    public static void main(String[] nousan) {
        DataSet ds = new DataSet();
        DiscreteMaths dm = new DiscreteMaths();
     
        System.out.println(dm.sumX(ds.getX()));
        System.out.println(dm.sumY(ds.getY()));
    }
}
