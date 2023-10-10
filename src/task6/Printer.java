package task6;

public class Printer {
   public  void print(String value){
       System.out.println("Printer");
    }
}

class Samsung extends Printer{
    public void print (String value){
        System.out.println("Sumsung");
    }
}

class TestPrinter{
    public static void main(String[] args) {
        Printer samsung = new Samsung();
        samsung.print("");
    }
}