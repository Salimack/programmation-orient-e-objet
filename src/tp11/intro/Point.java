package tp11.intro;

public class Point<TypeDesPoints> {
    private TypeDesPoints x, y;

    public Point(TypeDesPoints x, TypeDesPoints y) {
        this.x = x;
        this.y = y;
    }

    public TypeDesPoints getX() { return x; }
    public TypeDesPoints getY() { return y; }

    public void afficher() {
        System.out.println("(x , y");
    }
}
