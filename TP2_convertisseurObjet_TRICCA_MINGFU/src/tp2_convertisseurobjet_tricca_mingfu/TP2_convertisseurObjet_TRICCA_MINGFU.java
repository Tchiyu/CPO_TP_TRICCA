package tp2_convertisseurobjet_tricca_mingfu;
import java.util.Scanner;  // Import the Scanner class
/**
 *
 * @author anton
 */

public class TP2_convertisseurObjet_TRICCA_MINGFU {
    
    public static void main(String[] args) {

/*
int temp;
// Premier objet Convertisseur
        Convertisseur convertisseur1 = new Convertisseur();
        System.out.println("Convertisseur 1:");
        temp = 280;
        double kelvin1 = convertisseur1.convertir(temp, "CelsiusVersKelvin");
        System.out.println(temp +"C = " + kelvin1 + "K");
        double fahrenheit1 = convertisseur1.convertir(temp, "CelsiusVersFahrenheit");
        System.out.println(temp +"C = " + fahrenheit1 + "F");
        
        System.out.println(convertisseur1);

// Second objet Convertisseur
        Convertisseur convertisseur2 = new Convertisseur();
        System.out.println("\nConvertisseur 2:");
        temp = 1310;
        double celsius1 = convertisseur2.convertir(temp,  "FahrenheitVersCelsius");
        System.out.println(temp +"F = " + celsius1 + "C");
        double fahrenheit2 = convertisseur2.convertir(temp, "KelvinVersFahrenheit");
        System.out.println(temp + "K = " + fahrenheit2 + "F");
        
        System.out.println(convertisseur2);
    */
    Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Entrer le type de calcul");
    String monprocess = myObj1.nextLine();  // Read user input
    System.out.println("Vous avez selectionne: " + monprocess);  // Output user input
    
    Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Entrer la valeur");
    String temp = myObj2.nextLine();  // Read user input
    System.out.println("Vous avez selectionne: " + monprocess);
    
    Convertisseur convertisseur1 = new Convertisseur();
        System.out.println("Convertisseur 1:");
        int temp2 = Integer.valueOf(temp);
        double temp3 = convertisseur1.convertir(temp2, monprocess);
        System.out.println(temp2 + " devient " + temp3);
    }
}