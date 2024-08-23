import java.util.*;
public class Currency{
    static String currency1;
    static String currency2;
    static double amount;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean stoper = true;
        while (stoper == true) {
            designs.availableCurrency();
            designs.toConvert();
            designs.frame();
            amount = count();
            currencies_calculation.identifier1(currency1);
            currencies_calculation.identifier2(currency2);
            designs.result();
            print("Convert again?(Yes,No): ");
            String isConvertagian = scan.nextLine();
            if(isConvertagian.equals("Yes")){
                stoper = true;
            }
            else if(isConvertagian.equals("No")){
                stoper = false;
            }      
        }           
    }

    static double count() {
        Scanner scan = new Scanner(System.in);
        double amount = 0;
        boolean stoper = true;
        while (stoper) {
            try {
                System.out.print("Enter amount: ");
                amount = scan.nextDouble();
                stoper = false;
            } catch (Exception e) {
                System.out.println("Something went wrong with the input. Please enter a valid number.");
                scan.next();
            }
        }
        return amount;
        
    }
    
    static void print(String A){
        System.out.print(A);
    }
    static void println(String A){
        System.out.println(A);
    }

    static boolean iscontinue(){
        Scanner scan = new Scanner(System.in);
        String iscontinue = scan.nextLine();
        boolean finalcontinue = true;
        print("Convert(Y,N)");
        if(iscontinue == "Y"){
            finalcontinue = true;
        }
        else{
            finalcontinue = false;
        }
        
        return finalcontinue;
    }
}