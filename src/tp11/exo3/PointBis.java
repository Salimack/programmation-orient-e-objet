package tp11.exo3;

public class PointBis<TypeDesPoints extends Number> {
    private TypeDesPoints x, y;

    public PointBis(TypeDesPoints x, TypeDesPoints y) {
        this.x = x;
        this.y = y;
    }

    public TypeDesPoints getX() { return x; }
    public TypeDesPoints getY() { return y; }

    public void translater(int coef) {
        double X = x.doubleValue() * coef;
        double Y = y.doubleValue() * coef;
    }
    
    public void afficher() {
        System.out.println("(x , y)");
    }
}
