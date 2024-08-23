class currencies_calculation{
    static double[] conversionRatesToPhp = {
        56.00, // USD to PHP
        61.00, // EUR to PHP
        0.38,  // JPY to PHP
        70.00, // GBP to PHP
        36.00, // AUD to PHP
        41.00, // CAD to PHP
        62.00, // CHF to PHP
        7.70,  // CNY to PHP
        7.20,  // HKD to PHP
        41.50, // SGD to PHP
        0.68,  // INR to PHP
        0.042, // KRW to PHP
        12.30, // MYR to PHP
        1.55,  // THB to PHP
        0.0024, // VND to PHP
        15.25, // AED to PHP
        14.95, // SAR to PHP
        0.0038, // IDR to PHP
        3.00,   // ZAR to PHP
        1   // PHP
    };

    static String[] currencyCodes = {
        "USD", // US Dollar
        "EUR", // Euro
        "JPY", // Japanese Yen
        "GBP", // British Pound
        "AUD", // Australian Dollar
        "CAD", // Canadian Dollar
        "CHF", // Swiss Franc
        "CNY", // Chinese Yuan
        "HKD", // Hong Kong Dollar
        "SGD", // Singapore Dollar
        "INR", // Indian Rupee
        "KRW", // South Korean Won
        "MYR", // Malaysian Ringgit
        "THB", // Thai Baht
        "VND", // Vietnamese Dong
        "AED", // UAE Dirham
        "SAR", // Saudi Riyal
        "IDR", // Indonesian Rupiah
        "ZAR", // South African Rand
        "PHP"  // Philippine Peso
    };
    
    
    static int identifier1(String A){
        int index = 0;
        switch (A.toUpperCase()) {
            case "EUR":
                index = 1;
                break;
            case "JPY":
                index = 2;
                break;
            
            case "GBP":
                index = 3;
                break;
            
            case "AUD":
                index = 4;
                break;

            case "CAD":
                index = 5;
                break;

            case "CHF":
                index = 6;
                break;
            
            case "CNY":
                index = 7;
                break;

            case "HKD":
                index = 8;
                break;

            case "SGD":
                index = 9;
                break;

            case "INR":
                index = 10;
                break;

            case "KRW":
                index = 11;
                break;

            case "MYR":
                index = 12;
                break;

            case "THB":
                index = 13;
                break;

            case "VND":
                index = 14;
                break;

            case "AED":
                index = 15;
                break;

            case "SAR":
                index = 16;
                break;
            
            case "IDR":
                index = 17;
                break;

            case "ZAR":
                index = 18;
                break;

            case "PHP":
            index = 19;
            break;


            default:
                index = 0;
                break;
        }   
        
        return index;
    }

    static int identifier2(String A){
        int index = 0;
        switch (A.toUpperCase()) {
            case "EUR":
                index = 1;
                break;
            case "JPY":
                index = 2;
                break;
            
            case "GBP":
                index = 3;
                break;
            
            case "AUD":
                index = 4;
                break;

            case "CAD":
                index = 5;
                break;

            case "CHF":
                index = 6;
                break;
            
            case "CNY":
                index = 7;
                break;

            case "HKD":
                index = 8;
                break;

            case "SGD":
                index = 9;
                break;

            case "INR":
                index = 10;
                break;

            case "KRW":
                index = 11;
                break;

            case "MYR":
                index = 12;
                break;

            case "THB":
                index = 13;
                break;

            case "VND":
                index = 14;
                break;

            case "AED":
                index = 15;
                break;

            case "SAR":
                index = 16;
                break;
            
            case "IDR":
                index = 17;
                break;

            case "ZAR":
                index = 18;
                break;

            case "PHP":
                index = 19;
                break;
            
            default:
                index = 0;
                break;
        }   
        
        return index;
    }
    static double final_calculation(){
        double cmultiplier_result = currency_multiplier(Currency.amount, conversionRatesToPhp[currencies_calculation.identifier1(Currency.currency1)]);
        double result = currency_calculator(cmultiplier_result, conversionRatesToPhp[currencies_calculation.identifier1(Currency.currency2)]);
        return result;
    }

    static double currency_multiplier(double A, double B){
        return A * B;
    }

    static double currency_calculator(double A, double B){
        return A / B;

    }
    static boolean isAvailable(String A){
        boolean isAvailable = false; // Declare the variable outside the switch statement

        switch (A.toUpperCase()) {
            case "EUR":
            case "JPY":
            case "GBP":
            case "AUD":
            case "CAD":
            case "CHF":
            case "CNY":
            case "HKD":
            case "SGD":
            case "INR":
            case "KRW":
            case "MYR":
            case "THB":
            case "VND":
            case "AED":
            case "SAR":
            case "IDR":
            case "ZAR":
            case "PHP":
            case "USD":
                isAvailable = true;
                break;
            default:
                isAvailable = false;
                break;
        }
        return isAvailable;
    }
}