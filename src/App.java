import java.util.Scanner;

public class App {

    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa ordena tres números introducidos por teclado.");
        System.out.println("Por favor, vaya introduciendo los tres números y pulsando INTRO:");

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int v3 = sc.nextInt();


        if (v1 <= v2 && v1 < v3){
            if (v2 >= v1 && v2 < v3){
                System.out.printf("""
                       Los números introducidos ordenados de menor a mayor son %d, %d, %d
                        """, v1,v2,v3);
            } else {
                System.out.printf("""
                       Los números introducidos ordenados de menor a mayor son %d, %d, %d
                        """, v1,v3,v2);
            }
        } else if ( v1 > v2 && v1 <= v3){
            if (v1 > v3 && v2 < v3){
                System.out.printf("""
                       Los números introducidos ordenados de menor a mayor son %d, %d, %d
                        """, v2,v3,v1);
            } else {
                System.out.printf("""
                       Los números introducidos ordenados de menor a mayor son %d, %d, %d
                        """, v2,v1,v3);
            }
        }
    }
}
