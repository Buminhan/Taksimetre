import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç kilometre yolculuk yapacağınızı giriniz.");
        double a;
        a= inp.nextDouble();
        System.out.println("Ödemeniz gereken ücret :"+(((a*2.2+10)<=20)?20:(a*2.2+10)));

    }
}
