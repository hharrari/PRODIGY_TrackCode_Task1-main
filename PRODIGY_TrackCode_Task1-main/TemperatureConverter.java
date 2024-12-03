
    import java.util.Scanner;
    
    public class TemperatureConverter {
        public static void main(String[]args) {
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter the temperature value");
            double temp = input.nextDouble();
            
            input.nextLine(); // clearing the space
            
            System.out.println("Enter the unit (Celsius, Fahrenheit, or Kelvin): ");
            String unit = input.nextLine();
            
            System.out.println("You entered a temp of: " + temp + " "+ unit);
            System.out.println(" ");
            
            if(unit.equalsIgnoreCase("celsius")) {
                convertFromCelsius(temp);
            }
            else if(unit.equalsIgnoreCase("fahrenheit")) {
                convertFromFahrenheit(temp);
            }
            else if(unit.equalsIgnoreCase("kelvin")) {
                convertFromKelvin(temp);
            }
            input.close();
        }
        public static void convertFromCelsius(double celsius) {
            double fahrenheit = (celsius * 9/5 ) + 32;
            double kelvin = celsius + 273.15 ;
            System.out.println("Since You entered the temperature in Celsius: " + celsius);
            System.out.println("Here's the temp in fahrenheit: " + fahrenheit + " and in Kelvin: " + kelvin);	
        }
        public static void convertFromFahrenheit(double fahrenheit) {
            double celsius = (fahrenheit - 32) * 5/9 ;
            double kelvin = celsius + 273.15 ;
            System.out.println("Since You entered the temperature in Fahrenheit" + fahrenheit);
            System.out.println("Here's the temp in celsius: " + celsius + "and in Kelvin: " + kelvin);	
        }
        public static void convertFromKelvin(double kelvin) {
            double celsius = kelvin - 273.15 ;
            double fahrenheit = celsius * 9/5 + 32 ;
            System.out.println("Since You entered the temperature in Kelvin" + kelvin);
            System.out.println("Here's the temp in celsius: " + celsius + "and in fahrenheit: " + fahrenheit);	
        }
    }
    

