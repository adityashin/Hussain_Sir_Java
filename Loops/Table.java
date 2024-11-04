public class Table {
    public static void main(String[] args) {
        int no = Integer.parseInt(args[0]);
        for(int i=1;i<=10;++i){
            System.out.printf("%d * %d = %d%no",no,i,no*i);
        }
    }
}
