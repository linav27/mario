
import java.util.Scanner;
public class Principal {
    static Personajes mario;
    static Personajes luigi;
    static Personajes yoshi;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mario= new Personajes("mario",100);
        luigi= new Personajes("luigi",100);
        yoshi= new Personajes("yoshi",100);
        System.out.println("bienvenidos");
        System.out.println("Escoje un personaje");
        System.out.println("1. mario");
        System.out.println("2. luigi");
        System.out.println("3. yoshi");
        int eleccion= sc.nextInt();
        switch (eleccion){
            case '1':
                mario= new Personajes("mario",100);
               break;
            case '2':
                luigi= new Personajes("luigi",100);
               break;   
               case '3':
                mario= new Personajes("yoshi",100);
               break;
        }
        do{
        System.out.println("selecciona una accion");
        char tecla = sc.next().charAt(0);
        tecla = Character.toLowerCase(tecla);
        
            switch (tecla){
                case 'w':
                saltar();
                    break;
                case 's':
                agachar();    
                break;
                case 'd':
                 mover();   
                    break;
            }         
        }
    }    
}
