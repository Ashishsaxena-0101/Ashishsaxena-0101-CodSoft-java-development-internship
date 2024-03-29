
    import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
    //import java.util.spi.CurrencyNameProvider;
    public class task_3_currency_convertor {
        private Map<String,Double> exchangeRates;

        public task_3_currency_convertor(){

            exchangeRates= new HashMap<>();
            exchangeRates.put("USD",1.0);   //base currency (US Dollar )
            exchangeRates.put("EUR", 0.86);    //Euro
            exchangeRates.put("GBP", 0.74);    //BRITISH found
            exchangeRates.put("JPY", 109.78);  //Japanese Yen
            exchangeRates.put("CAD", 1.26);    //Canadian Dollar
            exchangeRates.put("AUD", 1.35);    //Australian Dollar
            exchangeRates.put("INR", 73.92);   //Indian Rupee
            exchangeRates.put("CNY", 6.44);    //Chinese Yuen
        }

        public double convertCurrency(double amount,String fromCurrency,String toCurrency)
        {

            if(exchangeRates.containsKey(fromCurrency) && exchangeRates.containsKey(toCurrency))
            {

                double fromRate=exchangeRates.get(fromCurrency);

                double toRate=exchangeRates.get(toCurrency);

                return amount*(toRate/fromRate);
            }

            else
            {

                System.out.println("Invalid currency codes.");
                return -1.0;

            }
        }

        public static void main(String[] args)
        {
            task_3_currency_convertor convertor=new task_3_currency_convertor();
            Scanner sc=new Scanner(System.in);

            System.out.println("Currency Convertor");
            System.out.println("Enter the amount/ Value to be Converted");
            double amount =sc.nextDouble();

            System.out.println("Enter the Source Currency Code (e.g. USD):");
            String fromCurrency= sc.next().toUpperCase();

            System.out.println("Enter the Target Currency Code (e.g.. EUR):");
            String toCurrency=sc.next().toUpperCase();

            double converted_Amount= convertor.convertCurrency(amount,fromCurrency,toCurrency);

            if(converted_Amount!= -1.0)
            {
                System.out.println(amount +" " + fromCurrency + " is equal to " + converted_Amount + " " + toCurrency);
                System.out.println("Thank you for using Currency Converter");
            }
        }
    }
