import java.util.Scanner;

public class Time_Menu {
     public void time_conversion()
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        while(true)
        {
             System.out.println("===TIME CONVERSION ===");
            System.out.println("1. Hours to Minutes");
            System.out.println("2. Minutes to Hours");
            System.out.println("3. Hours to Day");
            System.out.println("4. Day to Hours");
            System.out.println("5. Days to Month(approx. 30 days)");
            System.out.println("6. Month to Days(approx. 30 days)");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if(choice==0) 
                {
                 System.out.println("Returning to Main Menu...");
                 break;
                }

            int time = sc.nextInt();
            sc.nextLine();
            int result = 0;

            switch (choice)
             {
                case 1:
                    result = time * 60;
                    System.out.println("Result :"+result+" minutes\n\n\n");
                    break;
                case 2:
                    result = time / 60;
                    System.out.println("Result :"+result+" Hours\n\n\n");
                    break;
                 case 3:
                    result = time / 24;  
                    System.out.println("Result :"+result+" Day(s)\n\n\n");
                    break;
                 case 4:
                    result = time * 24;
                     System.out.println("Result :"+result+" Hours\n\n\n");
                    break;
                case 5:
                    result = time / 30;
                    System.out.println("Result :"+result+" Month(s)\n\n\n");
                    break;
                 case 6:
                    result = time * 30;
                    System.out.println("Result :"+result+" Day(s)\n\n\n");                   
                    break;
            
            
                default:
                    System.out.println("Invalid Choice!\n\n\n");
            }
            
        }
        sc.close();
    }

}
