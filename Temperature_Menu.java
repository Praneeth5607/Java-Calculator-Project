import java.util.Scanner;

public class Temperature_Menu {
    public void Temperature_Conversion()
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("=== TEMPERATURE CONVERSION ===");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Celsius to Kelvin");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("4. Fahrenheit to Kelvin ");
            System.out.println("5. Kelvin  to Celsius");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("0. Back to Main Menu");

            System.out.println("Enter your Choice :");
            choice = sc.nextInt();
            sc.nextLine();

            if(choice==0) 
                {
                 System.out.println("Returning to Main Menu...\n\n");
                 break;
                }

            System.out.println("Enter the Temperature : ");
            double temp = sc.nextDouble();

            double result = 0.00;
            boolean isValid = true;

            switch (choice) 
            {
                case 1:
                    result = (temp * 9/5) + 32;
                    break;
                case 2:
                    result = temp + 273.15;
                    break;
                case 3:
                    result = (temp - 32) * 5/9;
                    break;
                case 4:
                    result = ((temp - 32) * 5/9) + 273.15;
                    break;
                case 5:
                    result = temp - 273.15;
                    break;
                case 6:
                    result = ((temp - 273.15) * 9/5) + 32;
                    break;
                default:
                    System.out.println("Invalid Choice!\n");
                    isValid = false;
                    
            }
            if(isValid){
                System.out.println("Resultant Temperature : "+result+"\n\n\n");
            }
        }
        sc.close();
    }
}
