public class Pato implements Volador, Nadador {
    protected String nombre;

    public Pato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " esta volando");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " esta nadando");
    }
}