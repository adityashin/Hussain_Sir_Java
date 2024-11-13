import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        double[][] data = new double[3][4];
        int value = 100;
        //display array contents:for loop
        for(int i=0;i<data.length;++i){
            for(int j=0;j<data[i].length;++j){
                data[i][j] = ++value;
                // System.out.println(data[i][j]=++value);
                System.out.println(Arrays.deepToString(data));
            }
        }
    }
}
