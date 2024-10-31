public class SumOfNo {
    public static void main(String[] args) {
    
    int array[] = {1,2,3,4,5,6,7,8,9};
    int sum =0;
    for(int i =0;i<=array.length;++i){
        sum+=i;
    }
    System.out.printf("Sum of Array is %d ",sum);
        
    }
}
