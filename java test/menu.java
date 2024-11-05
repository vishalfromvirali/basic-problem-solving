import java.util.*;
class ticket{
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("pizza =200,buger = 150,briyani = 250,dosa = 80,idly= 50 these are the menu");
    System.out.println("enter how many pizza:");
    int pizza = scanner.nextInt();
    System.out.println("enter how many burger:");
    int burger = scanner.nextInt();
    System.out.println("enter how many briyani:");
    int briyani = scanner.nextInt();
    System.out.println("enter how many dosa:");
    int dosa = scanner.nextInt();
    System.out.println("enter how many idly:");
    int idly = scanner.nextInt();
    int total;
    total = (pizza*200+burger*150+briyani*250+idly*50+dosa*80);
    if(total>500){
        int price;
        price = total/10;
        int finalprice = total-price;
        System.out.println(finalprice);
    }
  
}
}