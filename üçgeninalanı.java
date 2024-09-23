import java.util.Scanner;

public class üçgeninalanı {
    public static void main(String[] args) {

        Scanner ımp=new Scanner(System.in);

        int a,b,c;
        System.out.println("a kenarını giriniz=");
        a= ımp.nextInt();
        System.out.println("b kenarını giriniz=");
        b= ımp.nextInt();
        System.out.println("c kenarını giriniz=");
        c= ımp.nextInt();


        int u=(a+b+c)/2;
        double alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("ALAN="+alan);

    }
}
