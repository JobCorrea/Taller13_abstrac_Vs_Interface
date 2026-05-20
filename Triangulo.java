public class Triangulo extends Figura {
    protected double base;
    protected double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void mostrarArea() {
        System.out.println("El area del Triangulo es: " + calcularArea());
    }
}