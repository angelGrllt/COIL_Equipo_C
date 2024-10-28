public class Circulo extends figuraGeometrica{
    protected double radio;

    public Circulo(Double radio){
        this.radio = radio;
    }

    public Circulo(Double radio, String color, boolean relleno){
        this.radio = radio;
        this.color = color;
        this.relleno = relleno;
    }

    public void getArea(){
        System.out.println("\nEl area es de : " + (Math.PI * (radio * radio)));
    }

    public void getPerimetro(){
        System.out.println("\nEl perimetro es de : " + (2 * Math.PI * radio));
    }

    public String toString(){
        return "\nColor: " + this.color + "\nRelleno: " + this.relleno + "\nRadio: " + this.radio + "\nFecha de creación: " + this.fechaCreacion;
    }
}
