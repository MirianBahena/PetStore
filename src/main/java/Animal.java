import java.sql.SQLOutput;

public class Animal {
    public static void main(String[] args) {
        Dog Dog1 = new Dog("Sky", 3, "Canis Familiaris", "Negro");
        Parakeet parakeet1= new Parakeet("Dino", 2, "M undulatus", "Verde, azul y rojo");


        Dog1.setVoice("Ladrido");
        Dog1.setSize(110);
        Dog1.setRace( "Pastor aleman");

        parakeet1.setClassification("Aereo");
        parakeet1.setSpeak("si");
        parakeet1.setPlumage("suave");

        System.out.println("Metodo toString() de Dog: " + Dog1.toString());
        System.out.println("Metodo toString() de Parakeet: " + parakeet1.toString());






    }
}
