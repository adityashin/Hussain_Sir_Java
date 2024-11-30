public interface Printable{
    //javac adds : public static final
    double TESTDATA = 123.45;

    //javac adds : public abstract => specification
    void print(String msg);
}