//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        Quadrado q1 = new Quadrado();
        Losango l1 = new Losango();
        Retangulo r1 = new Retangulo();

        System.out.println(t1.calcularArea(3.5, 6.8));
        System.out.println(q1.calcularArea(3.5, 3.5));
        System.out.println(l1.calcularArea(3.5, 6.8));
        System.out.println(r1.calcularArea(3.5,3.5));
    }
}