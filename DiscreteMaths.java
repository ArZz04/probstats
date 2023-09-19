public class DiscreteMaths {

    public DiscreteMaths() {
    } 

    public int sumX(int x[]) {
      int totalX = 0;
      
      for (int i=0;  i < x.length; i++)
        totalX = totalX + x[i];

      return totalX;
    }

    public int sumY(int y[]) {
      int totalY = 0;
      
      for (int i=0;  i < y.length; i++)
        totalY = totalY + y[i];

      return totalY;
    }

}
