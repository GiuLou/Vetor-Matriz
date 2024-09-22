import java.util.Scanner;
    
public static void main(String[] args) throws Exception {
 double [] valores = new double [10];
 Scanner scan = new Scanner (System.in); 
  for (int c= 0; c<valores.length; c++){
 System.out.println( "Digite uma nota: "); 
 valores [c] = scan.nextDouble();
 
 }
 
 System.out.println("Os numeros digitados foram: "); 
 for (double valor: valores)
 
 {
 
 System.out.print(valor+", ");
 
 }




}
