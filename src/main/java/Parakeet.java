public class Parakeet extends PetStore{
    private String Speak;
    private String Plumage;
    private String Classification;

    public Parakeet() {
    }

    public Parakeet(String name, int age, String species, String color) {
        super(name, age, species, color);
    }

    public Parakeet(String name, int age, String species, String color,
                    String speak, String plumage, String classification) {
        super(name, age, species, color);
        Speak = speak;
        Plumage = plumage;
        Classification = classification;
    }

    public String getSpeak() {
        return Speak;
    }

    public void setSpeak(String speak) {
        Speak = speak;
    }

    public String getPlumage() {
        return Plumage;
    }

    public void setPlumage(String plumage) {
        Plumage = plumage;
    }

    public String getClassification() {
        return Classification;
    }

    public void setClassification(String classification) {
        Classification = classification;
    }


    public String toString(){
        String texto=
                "\n El nombre del perico  es:" + " "+ getName()+
                "\n su edad es: " + " "+ getAge() +
                "\n su especie: " + " "+ getSpecies() +
                "\n su color es: " + " "+ getColor() +
                "\n su calisificacion es " + " " + getClassification() +
                "\n su pliemaje es: " + " " + getPlumage() +
                "\n el cual habla?: " + " " + getSpeak() ;
        return texto;
    }
}
