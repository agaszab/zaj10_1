import java.util.Scanner;

public class Program {



    public static void main(String[] args) {

        String speed;


        Scanner scan= new Scanner(System.in);

        System.out.println("Z jaką prędkością chcesz się poruszać?");
        System.out.println("Możliwe opcje: ");

        for (Predkosc elem: Predkosc.values()) {
            System.out.println(elem);
        }


        speed=scan.nextLine();


       Predkosc predkosc=Predkosc.valueOf(speed);





        System.out.println("Poruszasz się z prędkością "+predkosc+ "która wynosi " +predkosc.getspeed());

    }
}
