import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("1.OYUNCU ADI:");
        String p1=s.nextLine();
        System.out.print("2.OYUNCU ADI:");
        String p2=s.nextLine();
        System.out.print("1.OYUNCU KİLO:");
        int k1 = s.nextInt();
        System.out.print("2.OYUNCU KİLO:");
        int k2 =s.nextInt();
        int d1 = (int) (Math.random()*30);
        int d2 = (int) (Math.random()*30);

        Fighter f1 =new Fighter(p1,d1,100,k1,50,50);
        Fighter f2 =new Fighter(p2,d2,100,k2,50,50);
        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}
