class RTriangle {
    public static void main(String[] args) {
        int NumberOfLines = Integer.parseInt(args[0]);
        for (int i = 0; i < NumberOfLines; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }   
    }
}