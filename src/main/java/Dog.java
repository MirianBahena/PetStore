public class Dog extends PetStore {
    private String Voice;
    private String Race;
    private double size;

    public Dog() {
    }


    public Dog(String name, int age, String species, String color) {
        super(name, age, species, color);
    }

    public Dog(String name, int age, String species, String color, String voice, String race, double size) {
        super(name, age, species, color);
        Voice = voice;
        Race = race;
        this.size = size;
    }

    public String getVoice() {
        return Voice;
    }

    public void setVoice(String voice) {
        Voice = voice;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        Race = race;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String toString() {
        String texto =
                "\nEl nombre del Perrito es:" + " " + getName() +
                "\n Su edad es: " + " " + getAge() +
                "\n Su especie: " + " " + getSpecies() +
                "\n Su color es: " + " " + getColor() +
                "\n Su raza es:" + " " +getRace() +
                "\n Con un tamaño en cm de: " + " "+ getSize() +
                "\n El cual emite: " + " " + getVoice();
        return texto;
    }
}
