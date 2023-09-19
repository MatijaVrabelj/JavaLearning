import java.rmi.server.ExportException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        enterNumbers();
    }

    public static void enterNumbers() {
        Scanner scanner = new Scanner(System.in);
        String numbersEntered;
        double max = 0;
        double min = 0;
        int loopCount = 0;


       while(true){
            System.out.println("Enter numbers!");
            numbersEntered = scanner.nextLine();//ovdje je unesen kao string
           try{
              double validNum = Double.parseDouble(numbersEntered);
              if(loopCount == 0 || validNum < min){
                  min = validNum;
              }
              if(loopCount == 0 || validNum > max){
                  max = validNum;
              }
              loopCount ++;

           }catch (NumberFormatException nfe){
               break;
           }
        }
       if(loopCount > 0 ){
           System.out.println("min = " + min + " max = " + max);
       }else{
           System.out.println("NO valid data entered");
       }
    }
}



