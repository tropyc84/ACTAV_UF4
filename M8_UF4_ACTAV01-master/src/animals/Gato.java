package animals;

public class Gato extends Animal {

    public Gato() {
    }

    @Override
    public void sonido() {
        System.out.println(this.getNombre() + " dice: MIAU !");
    }
}
