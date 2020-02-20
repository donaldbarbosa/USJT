import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        int x;
        int y;
        String opera;

        Scanner input = new Scanner(System.in);
        System.out.println("Eai filhao, vai fazer o que?");
        System.out.println("Soma, Subtracao, Divisao, Multiplicacao");
        opera = input.nextLine();
        System.out.println(opera);
        System.out.println("Fala ai o numero: ");
        x = input.nextInt();
        System.out.println("Fala aí outro numero: ");
        y = input.nextInt();

        if(opera == "Divisao" && (x == 0 || y == 0)){
            System.out.println("Ta doido mermao, da para dividir por zero nao");

        }
        else{

            if(opera == "Soma"){
                    System.out.println("E a soma deu: " + (x+y));
        }
        
        if(opera == "Subtracao"){
            if(x < y){
                System.out.println("E a subtracao deu: " + (y-x));
            }
            else{
                System.out.println("E a subtracao deu: " + (x-y));
            }   
        }

        if(opera == "Divisao"){
            System.out.println("E a divisao deu: " + (x/y));
        }

        if(opera == "Multiplicacao"){
            System.out.println("A multiplicacao deu: " + (x*y));
        
        }

        }

        
}
}