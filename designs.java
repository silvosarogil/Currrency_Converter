import java.util.*;;
public class designs {
    static void frame(){
        println("=================");
        println(  "=      "+Currency.currency1+"      =");
        println("=               =");
        println("=      to       =");
        println("=               =");
        println(  "=      "+Currency.currency2+"      =");
        println("=================");
    }
    static void arrow(){
        println("==");
        println("||");
        println("||");
        println("==");
        println("\\/");
        
    }
    static void toConvert(){
        Scanner scan = new  Scanner(System.in);
        boolean stoper = true;
        while (stoper) {
            println("Enter currency to be Converted: ");
            Currency.currency1 =  scan.nextLine();
            
            designs.arrow();
            
            Currency.currency2 = scan.nextLine();
            boolean a = Currency.currency1.length() == 3 && currencies_calculation.isAvailable(Currency.currency1) == true;
            boolean b = Currency.currency1.length() == 3 && currencies_calculation.isAvailable(Currency.currency2) == true;
            if(a == false || b == false ){
                print("Please enter a proper currency code (3 letters) and make sure the currency is available. Try again!");
            }
            else{
                stoper = false;            }

        }
    
    }
    static void printbol(boolean A){
        System.out.println(A);
    }
    static void result(){
        double converted = currencies_calculation.final_calculation();
        println(" ");
        println(" ");
        println("==========================================");
        System.out.println("|| " +Currency.amount + " " + Currency.currency1.toUpperCase() + " is equivalent to " + converted + " " + Currency.currency2.toUpperCase() + " ||" );
        println("==========================================");
        println(" ");
        println(" ");
    }
    static void availableCurrency(){
        print("Available Currencies: ");
        for(int i = 0; i < currencies_calculation.currencyCodes.length;i++){
            print(currencies_calculation.currencyCodes[i] + ", ");
        }
        println(" ");
    }
    static void print(String A){
        System.out.print(A);
    }
    static void println(String A){
        System.out.println(A);
    }

}
