public class Quadrado implements CalcularArea{
    private double lado;
    private double area;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    @Override
    public void calcularArea() {
        this.area = this.lado * this.lado;
    }
}
