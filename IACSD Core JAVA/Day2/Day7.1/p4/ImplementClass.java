package p4;

import javax.xml.crypto.Data;

public class ImplementClass implements A,B {
    
    @Override 
    public void show(){
        System.out.println("Value of A's data's variable is "+A.DATA+" & value of B's Data variable is "+B.DATA) ; 
    }
}
