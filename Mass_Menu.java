import java.util.Scanner;

public class Mass_Menu 
{
    public void mass_conversion()
    {
        Scanner sc = new Scanner(System.in);

        int choice;
        while (true) {
            System.out.println("=== MASS CONVERSION ===");
            System.out.println("1. Kg to Grams ");
            System.out.println("2. Grams to Kg");
            System.out.println("3. Grams to Milligrams");
            System.out.println("4. Milligrams to Grams");
            System.out.println("5. Kg to Tons");
            System.out.println("6. Tons to Kg");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if(choice==0) 
                {
                 System.out.println("Returning to Main Menu...");
                 break;
                }

            double weight = sc.nextDouble();
            double result = 0.00;
            boolean isValid = true;

            switch (choice) 
            {
                case 1:
                    result = weight * 1000;
                    break;
                case 2:
                    result = weight / 1000;
                    break;
                case 3:
                    result = weight * 1000;
                    break;
                case 4:
                    result = weight / 1000;
                    break;
                case 5:
                    result = weight / 100;
                    break;
                case 6:
                    result = weight * 100;
                    break;
                default:
                    System.out.println("Invalid Input!\n\n\n");
                    isValid = false;
            }
            if(isValid)
            {
                System.out.println("Result : "+ result+"\n\n\n");
            }
        }
        sc.close();
    }
}
