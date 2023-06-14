import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x =0;
System.out.printf("podaj liczbe");
        int y = scan.nextInt();
        do {
            if(y%5==0)
                x+=y;
            System.out.printf("Podaj liczbe");
            y = scan.nextInt();
        }
          while(y!=-5);
        System.out.printf("Suma liczb podzielnych przez 5 "+x);
    }
}



