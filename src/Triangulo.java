public class Triangulo extends figuraGeometrica{
    protected double lado1;
    protected double lado2;
    protected double lado3;

    public Triangulo(){
        this.lado1 = 1.0;
        this.lado2 = 1.0;
        this.lado3 = 1.0;
    }

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void getLado1(){
        System.out.println("Lado 1: " + this.lado1);
    }

    public void getLado2(){
        System.out.println("Lado 2: " + this.lado2);
    }

    public void getLado3(){
        System.out.println("Lado 3: " + this.lado3);
    }

    public void getArea(){
        double s = (lado1 + lado2 + lado3) / 2;
        System.out.println("\nEl area es de : " + Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3)));
    }

    public void getPerimetro(){
        System.out.println("\nEl perimetro es de : " + (lado1 + lado2 + lado3));
    }

    public String toString(){
        return "\nColor: " + this.color + "\nRelleno: " + this.relleno + "\nLado 1: " + this.lado1 + "\nLado 2: " + this.lado2 + "\nLado 3: " + this.lado3 + "\nFecha de creación: " + this.fechaCreacion;
    }

}
