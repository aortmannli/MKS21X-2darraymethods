public class ArrayMethods{

  public static int rowSum(int[][] ary, int x){
     if (x >= ary.length) return 0;
     int out = 0;
     for (int i = 0; i < ary[x].length; i++) {
       out += ary[x][i];
     }
     return out;
   }

    public static int columnSum(int[][] ary, int x){

    }

    public static int[] allRowSums(int[][] ary){

    }

    public static int[] allColSums(int[][] ary){

    }

    public static boolean isRowMagic(int[][] ary){

    }

    public static boolean isColumnMagic(int[][] ary){

    }
}
