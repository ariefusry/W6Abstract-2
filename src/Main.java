//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        Fish f = new Fish();
        Snake s = new Snake();

        System.out.println(" ");
        t.move();
        t.roar();
        t.breath();
        System.out.println(" ");
        f.move();
        System.out.println(" ");
        s.move();
        s.molting();
        s.breath();
    }
}