import java.util.Scanner;

public class Main_Menu 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true)
        {
        System.out.println("========== MAIN MENU ==========");
        System.out.println("1.Arithmetic Operations\n2.Temperature Conversion");
        System.out.println("3.Mass Conversion\n4.Length Conversion");
        System.out.println("5.Time Conversion\n0.Exit");
             
        System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice==0){
                System.out.println("Returning Back...");
                break;
            } 

            switch (choice) {
                case 1:
                Arithmetic_Menu am = new Arithmetic_Menu();
                am.Arithmetic_Operations();
                break;
                case 2:
                Temperature_Menu tm = new Temperature_Menu();
                tm.Temperature_Conversion();
                break;
                case 3:
                Mass_Menu mm = new Mass_Menu();
                mm.mass_conversion();
                break; 
                case 4:
                Length_Menu lm = new Length_Menu();
                lm.length_conversion();
                break; 
                case 5:
                Time_Menu time = new Time_Menu();
                time.time_conversion();
                break;
            
                default:
                System.out.println("Invalid Choice!");
            }
        }
       
        sc.close();
    }
}
