package poo;

public class Commons {

    public void clearScreen() {
        for(int clear = 0; clear < 1000; clear++) {
            System.out.println("\b");
        };
    }

    public void waitForInput() {
        try{System.in.read();}
            catch(Exception e){}
    }
    
}
