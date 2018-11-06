public class ArrayMethods{

  public static int rowSum(int[][] ary, int x){
    //returns the sum of the elements in Row x of ary.
     if (x >= ary.length) return 0;
     int out = 0;
     for (int i = 0; i < ary[x].length; i++) {
       out += ary[x][i];
     }
     return out;
   }

    public static int columnSum(int[][] ary, int x){
      //returns the sum of the elements in Column x of ary (careful with rows of different lengths!).
      int out = 0;
      for (int i = 0; i < ary.length; i++) {
        if (ary[i].length > x) {
          out += ary[i][x];
        }
      }
      return out;
    }

    public static int[] allRowSums(int[][] ary){
    //returns an array of the row sums for each row of ary.
    //Index i of the return array contains the sum of elements in row i.
      int len = ary.length;
      int[] sums = new int[len];
      for (int i = 0; i < len; i++) {
        sums[i] = rowSum(ary, i);
      }
      return sums;
    }

    public static int[] allColSums(int[][] ary){
      int max = 0;
      for (int i = 0; i < ary.length; i++){
        if (ary[i].length > max){
          max = ary[i].length;
        }
      }
      int[] sums = new int[max];
      for (int x = 0; x < max; x++){
        sums[x] = columnSum(ary,x);
      }
      return sums;
      //Returns an array with the column sum of each column of ary.
      //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
      //Index i of the return array contains the sum of elements in column i, ignoring any rows that are too short.
    }

    public static boolean isRowMagic(int[][] ary){

    }

    public static boolean isColumnMagic(int[][] ary){

    }
}
