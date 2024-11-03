public class ReverseTriangle {
        public static void main(String[] args) {
            int NumberOfLines = Integer.parseInt(args[0]);
            for (int i = NumberOfLines; i >=0; --i) {
                for (int j = i; j >=0; --j) {
                    System.out.print("*");
                }
                System.out.println("");
            }   
        }
}
