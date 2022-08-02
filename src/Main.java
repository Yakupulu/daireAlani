import java.util.Scanner;


public class Main {
    public static void main(String[] args){

      //Daire alanı ve çevresini bulma
      /*  int r;
        double pi=3.14;

        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin yaricapini giriniz:");
        r=input.nextInt();

        double alan=pi*r*r;
        double cevre=2*pi*r;

        System.out.println("Dairenin alani:"+alan);
        System.out.println("Dairenin cevresi:"+cevre);

       */

        // dilim alanı bulma

        int r,a;
        double pi=3.14,dilimAlan;

        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin yaricapini giriniz:");
        r= input.nextInt();
        System.out.print("Merkez acinin olcusunu giriniz:");
        a= input.nextInt();

        dilimAlan= (pi*(r*r)*a) / 360.0;
        System.out.println("Dilim alani:"+dilimAlan);

    }
}
