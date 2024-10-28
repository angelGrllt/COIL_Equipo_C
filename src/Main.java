import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        byte opcion;
        byte sw;
        String color;
        boolean relleno;
        do {
            System.out.println("\n1) Circulo " + "\n2) Rectangulo " + "\n3) Triangulo " + "\n4) Salir ");
            System.out.print("Elija su opcion: ");
            sw = sc.nextByte();
            switch (sw) {
                case 1:
                        System.out.println("\n1) Dar radio " + "\n2) Dar datos completos ");
                        System.out.print("Introduzca su opcion: ");
                        opcion = sc.nextByte();
                        if (opcion == 1){
                            System.out.print("\nIngresa el radio (con decimales): ");
                            double radio = sc.nextDouble();
                            Circulo c = new Circulo(radio);
                            c.setFechaCreacion();
                            do{
                                System.out.println("\nOtras opciones:");
                                System.out.println("1) Cambiar color" + "\n2) Cambiar relleno" + "\n3) Obtener área" + "\n4) Obtener perímetro" + "\n5) Información general" + "\n6) Regresar al menu");
                                System.out.print("Introduzca su opcion: ");
                                opcion = sc.nextByte();
                                switch (opcion) {
                                    case 1:
                                        System.out.print("\nIngresa el color: ");
                                        c.setColor();
                                        System.out.print("Ahora el color es: " );
                                        c.getColor();
                                        break;
                                    case 2:
                                        System.out.print("\nIngresa el relleno (true/false): ");
                                        c.setRelleno();
                                        c.getRelleno();
                                        break;
                                    case 3:
                                        c.getArea();
                                        break;
                                    case 4:
                                        c.getPerimetro();
                                        break;
                                    case 5:
                                        System.out.print("\nInformación de la figura: ");
                                        System.out.println(c);
                                        break;
                                    case 6:
                                        break;
                                    default:
                                        System.out.println("Opcion no valida");
                                }
                            }while (opcion !=6);
                        }else if (opcion == 2) {
                            System.out.print("Ingresa el radio (con decimales): ");
                            double radio = sc.nextDouble();
                            System.out.print("Ingresa el color: ");
                            color = sc.next();
                            System.out.print("Ingresa el relleno (true o false): ");
                            relleno = sc.nextBoolean();
                            Circulo c = new Circulo(radio, color, relleno);
                            c.setFechaCreacion();
                            do{
                                System.out.println("\nOtras opciones:");
                                System.out.println("1) Cambiar color" + "\n2) Cambiar relleno" + "\n3) Obtener área" + "\n4) Obtener perímetro" + "\n5) Información general" + "\n6) Regresar al menu");
                                System.out.print("Ingresa una opcion: ");
                                opcion = sc.nextByte();
                                switch (opcion) {
                                    case 1:
                                        System.out.print("\nIngresa el color: ");
                                        c.setColor();
                                        System.out.print("Ahora el color es: " );
                                        c.getColor();
                                        break;
                                    case 2:
                                        System.out.print("\nIngresa el relleno (true/false): ");
                                        c.setRelleno();
                                        c.getRelleno();
                                        break;
                                    case 3:
                                        c.getArea();
                                        break;
                                    case 4:
                                        c.getPerimetro();
                                        break;
                                    case 5:
                                        System.out.print("\nInformación de la figura: ");
                                        System.out.println(c);
                                        break;
                                    case 6:
                                        break;
                                    default:
                                        System.out.println("Opcion no valida");
                                }
                            }while (opcion !=6);
                        }
                    break;
                case 2:
                    System.out.println("\n1) Dar base y altura " + "\n2) Dar datos completos ");
                    System.out.print("Introduzca su opcion: ");
                    opcion = sc.nextByte();
                    if (opcion == 1){
                        System.out.print("\nIngresa la base (con decimales): ");
                        double base = sc.nextDouble();
                        System.out.print("Ingresa la altura (con decimales): ");
                        double altura = sc.nextDouble();
                        Rectangulo r = new Rectangulo(base,altura);
                        r.setFechaCreacion();
                        do{
                            System.out.println("\nOtras opciones:");
                            System.out.println("1) Cambiar color" + "\n2) Cambiar relleno" +  "\n3) Cambiar base" +  "\n4) Cambiar altura" +"\n5) Obtener área" + "\n6) Obtener perímetro" + "\n7) Información general" + "\n8) Regresar al menu");
                            System.out.print("Ingresa una opcion: ");
                            opcion = sc.nextByte();
                            switch (opcion) {
                                case 1:
                                    System.out.print("\nIngresa el color: ");
                                    r.setColor();
                                    System.out.print("Ahora el color es: " );
                                    r.getColor();
                                    break;
                                case 2:
                                    System.out.print("\nIngresa el relleno (true/false): ");
                                    r.setRelleno();
                                    r.getRelleno();
                                    break;
                                case 3:
                                    System.out.print("\nIngresa la nueva base (con decimales): ");
                                    r.setBase();
                                    System.out.print("La base es de: ");
                                    r.getBase();
                                    break;
                                case 4:
                                    System.out.print("\nIngresa la nueva altura (con decimales): ");
                                    r.setAltura();
                                    System.out.print("La base es de: ");
                                    r.getAltura();
                                    break;
                                case 5:
                                    r.getArea();
                                    break;
                                case 6:
                                    r.getPerimetro();
                                    break;
                                case 7:
                                    System.out.print("\nInformación de la figura: ");
                                    System.out.println(r);
                                    break;
                                case 8:
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            }
                        }while (opcion !=8);
                    }else if (opcion == 2){
                        System.out.print("\nIngresa la base (con decimales): ");
                        double base = sc.nextDouble();
                        System.out.print("Ingresa la altura (con decimales): ");
                        double altura = sc.nextDouble();
                        System.out.print("Ingresa el color: ");
                        color = sc.next();
                        System.out.print("Ingresa el relleno (true o false): ");
                        relleno = sc.nextBoolean();
                        Rectangulo r = new Rectangulo(base,altura, color,relleno);
                        r.setFechaCreacion();
                        do{
                            System.out.println("\nOtras opciones:");
                            System.out.println("1) Cambiar color" + "\n2) Cambiar relleno" +  "\n3) Cambiar base" +  "\n4) Cambiar altura" +"\n5) Obtener área" + "\n6) Obtener perímetro" + "\n7) Información general" + "\n8) Regresar al menu");
                            System.out.print("Ingresa una opcion: ");
                            opcion = sc.nextByte();
                            switch (opcion) {
                                case 1:
                                    System.out.print("\nIngresa el color: ");
                                    r.setColor();
                                    System.out.print("Ahora el color es: " );
                                    r.getColor();
                                    break;
                                case 2:
                                    System.out.print("\nIngresa el relleno (true/false): ");
                                    r.setRelleno();
                                    r.getRelleno();
                                    break;
                                case 3:
                                    System.out.print("\nIngresa la nueva base (con decimales): ");
                                    r.setBase();
                                    System.out.print("La base es de: ");
                                    r.getBase();
                                    break;
                                case 4:
                                    System.out.print("\nIngresa la nueva altura (con decimales): ");
                                    r.setAltura();
                                    System.out.print("La base es de: ");
                                    r.getAltura();
                                    break;
                                case 5:
                                    r.getArea();
                                    break;
                                case 6:
                                    r.getPerimetro();
                                    break;
                                case 7:
                                    System.out.print("\nInformación de la figura: ");
                                    System.out.println(r);
                                    break;
                                case 8:
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            }
                        }while (opcion !=8);
                    }
                    break;
                case 3:
                    System.out.println("\n1) Dar todos los lados " + "\n2) No dar lados ");
                    System.out.print("Introduzca su opcion: ");
                    opcion = sc.nextByte();
                    if (opcion == 1){
                        System.out.print("\nIngresa el lado 1 (con decimales): ");
                        double lado1 = sc.nextDouble();
                        System.out.print("Ingresa el lado 2 (con decimales): ");
                        double lado2 = sc.nextDouble();
                        System.out.print("Ingresa el lado 3 (con decimales): ");
                        double lado3 = sc.nextDouble();
                        Triangulo t = new Triangulo(lado1,lado2,lado3);
                        t.setFechaCreacion();
                        do{
                            System.out.println("\nOtras opciones:");
                            System.out.println("1) Cambiar color" + "\n2) Cambiar relleno" + "\n3) Obtener lados" +"\n4) Obtener área" + "\n5) Obtener perímetro" + "\n6) Información general" + "\n7) Regresar al menu");
                            System.out.print("Ingresa una opcion: ");
                            opcion = sc.nextByte();
                            switch (opcion) {
                                case 1:
                                    System.out.print("\nIngresa el color: ");
                                    t.setColor();
                                    System.out.print("Ahora el color es: " );
                                    t.getColor();
                                    break;
                                case 2:
                                    System.out.print("\nIngresa el relleno (true/false): ");
                                    t.setRelleno();
                                    t.getRelleno();
                                    break;
                                case 3:
                                    t.getLado1();
                                    t.getLado2();
                                    t.getLado3();
                                    break;
                                case 4:
                                    t.getArea();
                                    break;
                                case 5:
                                    t.getPerimetro();
                                    break;
                                case 6:
                                    System.out.print("\nInformación de la figura: ");
                                    System.out.println(t);
                                    break;
                                case 7:
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            }
                        }while (opcion !=7);
                    }else if (opcion == 2){
                        Triangulo t = new Triangulo();
                        t.setFechaCreacion();
                        do{
                            System.out.println("\nOtras opciones:");
                            System.out.println("1) Cambiar color" + "\n2) Cambiar relleno" + "\n3) Obtener lados" +"\n4) Obtener área" + "\n5) Obtener perímetro" + "\n6) Información general" + "\n7) Regresar al menu");
                            System.out.print("Ingresa una opcion: ");
                            opcion = sc.nextByte();
                            switch (opcion) {
                                case 1:
                                    System.out.print("\nIngresa el color: ");
                                    t.setColor();
                                    System.out.print("Ahora el color es: " );
                                    t.getColor();
                                    break;
                                case 2:
                                    System.out.print("\nIngresa el relleno (true/false): ");
                                    t.setRelleno();
                                    t.getRelleno();
                                    break;
                                case 3:
                                    t.getLado1();
                                    t.getLado2();
                                    t.getLado3();
                                    break;
                                case 4:
                                    t.getArea();
                                    break;
                                case 5:
                                    t.getPerimetro();
                                    break;
                                case 6:
                                    System.out.print("\nInformación de la figura: ");
                                    System.out.println(t);
                                    break;
                                case 7:
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            }
                        }while (opcion !=7);

                    }
                    break;
                    case 4:
                        break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (sw != 4);
    }
}