import java.util.Scanner;

public class Arithmetic_Menu{

    public void Arithmetic_Operations()
    {
    Scanner sc = new Scanner(System.in);
        int choice;

    while(true)
    {
     System.out.println("===ARITHMETIC OPERATIONS ===");
    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n0.Exit");

    System.out.println("Enter your choice : ");
    choice = sc.nextInt();
    sc.nextLine();

    if(choice == 0)
    {
        System.out.println("Returning to Main Menu...");
        break;
    }

    System.out.println("Enter the First Number: ");
    int num1 = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter the Second Number: ");
    int num2 = sc.nextInt();
    sc.nextLine();

    int result = 0;
    boolean isValid = true;

    
    switch(choice)
    {
        case 1:
        result = num1 + num2;
        break;

        case 2:
            result = num1 - num2;
            break;
        case 3:
            result = num1 * num2;
            break;
        case 4:
             if(num2 == 0)
            {
                System.out.println("Division by Zero is not Possible");
                while(true)
                {
                    num2 = sc.nextInt();
                    sc.nextLine();
                    if(num2!=0) break;
                }
            }

            result = num1 / num2;
            break;
        case 5:
            result = num1 % num2;
            break;

        default:
            System.out.println("Invalid choice!");
            isValid = false;
    }
    if(isValid)
    System.out.println("Result : "+result+"\n\n\n");
    }

    sc.close();
}
}