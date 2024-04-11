//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(4.2, 6.0);
        Quadrado q1 = new Quadrado(4.5);

        t1.calcularArea();
        q1.calcularArea();

        System.out.println(t1.getArea());
        System.out.println(q1.getArea());

    }
}