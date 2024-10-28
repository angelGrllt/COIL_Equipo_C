import java.util.*;

public class figuraGeometrica {
    protected String color;
    protected boolean relleno;
    protected Date fechaCreacion;

    public figuraGeometrica() {
        this.color = "Blanco";
        this.relleno = false;
    }

    public void getColor(){
        System.out.println(this.color);
    }

    public void setColor(){
        Scanner scan = new Scanner(System.in);
        this.color = scan.nextLine();
    }

    public void getRelleno(){
        if (this.relleno){
            System.out.println("La figura tiene relleno");
        }else{
            System.out.println("La figura no tiene relleno");
        }
    }

    public void setRelleno(){
        Scanner scan = new Scanner(System.in);
        this.relleno = scan.nextBoolean();
    }

    public void getFechaCreacion(){
        System.out.println(this.fechaCreacion);
    }

    public void setFechaCreacion(){
        this.fechaCreacion = new Date();
    }

    public String toString(){
        return "Color: " + this.color + "\nRelleno: " + this.relleno;
    }

}
