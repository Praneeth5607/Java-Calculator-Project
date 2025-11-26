import java.util.Scanner;

public class Length_Menu {
    public void length_conversion()
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        while(true)
        {
             System.out.println("===LENGTH CONVERSION ===");
            System.out.println("1. Kilometer to Meter");
            System.out.println("2. Meter to Kilometer");
            System.out.println("3. Meter to Centimeter");
            System.out.println("4. Centimeter to Meter");
            System.out.println("5. Centimeter to Millimeter");
            System.out.println("6. Millimeter to Centimeter");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if(choice==0) 
                {
                 System.out.println("Returning to Main Menu...");
                 break;
                }

            double length = sc.nextDouble();
            double result = 0.00;

            switch (choice)
             {
                case 1:
                    result = length * 1000;
                    System.out.println("Result :"+result+" m\n\n\n");
                    break;
                case 2:
                    result = length / 1000;
                    System.out.println("Result :"+result+" Km\n\n\n");
                    break;
                 case 3:
                    result = length * 100;  
                    System.out.println("Result :"+result+" cm\n\n\n");
                    break;
                 case 4:
                    result = length / 100;
                     System.out.println("Result :"+result+" m\n\n\n");
                    break;
                case 5:
                    result = length * 10;
                    System.out.println("Result :"+result+" mm\n\n\n");
                    break;
                 case 6:
                    result = length / 10;
                    System.out.println("Result :"+result+" cm\n\n\n");                   
                    break;
            
            
                default:
                    System.out.println("Invalid Choice!\n\n\n");
            }
            
        }
        sc.close();
    }
}
