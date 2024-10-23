package tp2_convertisseurobjet_tricca_mingfu;

/**
 *
 * @author anton
 */

public class TP2_convertisseurObjet_TRICCA_MINGFU {

public class Convertisseur { 

    int nbConversions = 0;    

    public static double CelsiusVersKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double KelvinVersCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double FahrenheitVersCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double CelsiusVersFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double FahrenheitVersKelvin(double fahrenheit) {
        return CelsiusVersKelvin(FahrenheitVersCelsius(fahrenheit));
    }
    
    public static double KelvinVersFahrenheit(double kelvin) {
        return CelsiusVersFahrenheit(KelvinVersCelsius(kelvin));
    }

    // Incrementation du compteur
    public double convertir(double valeur, String type) {
        double result = 0;
        switch (type) {
            case "CelsiusVersKelvin" -> result = CelsiusVersKelvin(valeur);
            case "KelvinVersCelsius" -> result = KelvinVersCelsius(valeur);
            case "FahrenheitVersCelsius" -> result = FahrenheitVersCelsius(valeur);
            case "CelsiusVersFahrenheit" -> result = CelsiusVersFahrenheit(valeur);
            case "FahrenheitVersKelvin" -> result = FahrenheitVersKelvin(valeur);
            case "KelvinVersFahrenheit" -> result = KelvinVersFahrenheit(valeur);
            default -> System.out.println("Type de conversion inconnu.");
        }
        nbConversions++;
        return result;
    }

    @Override
    public String toString() {
        return "Nombre de conversions: " + nbConversions;
    }

    public void main(String[] args) {
int temp;        
// Premier objet Convertisseur
        Convertisseur convertisseur1 = new Convertisseur();
        System.out.println("Convertisseur 1:");
        temp = 280;
        double kelvin1 = convertisseur1.convertir(temp, "CelsiusVersKelvin");
        System.out.println(temp +"°C = " + kelvin1 + "K");
        double fahrenheit1 = convertisseur1.convertir(temp, "CelsiusVersFahrenheit");
        System.out.println(temp +"°C = " + fahrenheit1 + "°F");
        
        System.out.println(convertisseur1);

// Second objet Convertisseur
        Convertisseur convertisseur2 = new Convertisseur();
        System.out.println("\nConvertisseur 2:");
        temp = 1310;
        double celsius1 = convertisseur2.convertir(temp,  "FahrenheitVersCelsius");
        System.out.println(temp +"°F = " + celsius1 + "°C");
        double fahrenheit2 = convertisseur2.convertir(temp, "KelvinVersFahrenheit");
        System.out.println(temp + "K = " + fahrenheit2 + "°F");
        
        System.out.println(convertisseur2);
    }
}
}