import java.util.*;
class sumofqubes{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int qube = 0;
        System.out.println("enter the value m: ");
        int m = scanner.nextInt();
        System.out.println("enter the value n: ");
        int n = scanner.nextInt();
        for(int i=m;i<n+1;i++){
            int sum;
            sum =(int) Math.pow(i,3);
            qube +=sum;
        }System.out.println("sumofqubes = "+qube);
    }
}
    