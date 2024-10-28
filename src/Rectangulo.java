import java.util.Scanner;

public class Rectangulo extends figuraGeometrica{

    protected double base;
    protected double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double base, double altura, String color, boolean relleno){
        this.base = base;
        this.altura = altura;
        this.color = color;
        this.relleno = relleno;
    }

    public void getAltura(){
        System.out.println(this.altura);
    }

    public void setAltura(){
        Scanner scan = new Scanner(System.in);
        this.altura = scan.nextDouble();
    }

    public void getBase(){
        System.out.println(this.base);
    }

    public void setBase(){
        Scanner scan = new Scanner(System.in);
        this.base = scan.nextDouble();
    }

    public void getArea(){
        System.out.println("\nEl area es de : " + (base*altura));
    }

    public void getPerimetro(){
        System.out.println("\nEl perimetro es de : " + (2 * base + 2 * altura) );
    }

    public String toString(){
        return "\nColor: " + this.color + "\nRelleno: " + this.relleno + "\nAltura: " + this.altura + "\nBase: " + this.base + "\nFecha de creación: " + this.fechaCreacion;
    }
}
