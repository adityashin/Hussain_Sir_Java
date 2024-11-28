public class ConsolePrinter implements IPrintable {
    
    //Must implement , inherited abstract functionality
    @Override
    public void print(String msg){
        System.out.println("Printing "+msg+" on the console");
    }
}
