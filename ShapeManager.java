package Astrazione;
import java.util.*;

// ESERCIZIO DA TERMINARE e SISTEMARE

public class ShapeManager {
    Shape myCircle = new Circle(0, 0, 0);
    Shape myRectangle = new Rectangle(0, 0, 0, 0);

    // Populated Objects
    Shape myCircle1 = new Circle(15, 300, 20);
    Shape myRectangle1 = new Rectangle(30, 12, 34, 99);
    
    public static void main(String[] args){
        Scanner myScelta = new Scanner(System.in);
        Scanner Inserimento = new Scanner(System.in);

        System.out.println("Menu' scelta:\n[1] - Aggiungi Forma geometrica\n[2] - Ottieni area totale\n[3] - Ottieni perimetro totale\n[4] - Calcola Area\n[5] - Calcola Perimetro");
        int scelta = myScelta.nextInt();
        switch(scelta){
            case 1:
            // Metodo addShape con oggetto
            break;
            case 2:
            // Stampa area totale calcolando dagli oggetti gia' presenti e popolati
            break;
            case 3:
            // Stampa perimetro totale calcolando dagli oggetti gia' presenti e popolati
            break;
            case 4:
            System.out.println("Di quale Forma Geomtrica vuoi calcolare l'area?\n[1] - Cerchio\n[2] - Rettangolo");
            int newScelta = myScelta.nextInt();
            if (newScelta==1){
                myCircle.getArea();
            } else if (newScelta==2){
                myRectangle.getArea();
            } else {
                System.out.println("Inserimento errato.");
            }
            break;
            case 5:
            System.out.println("Di quale Forma Geomtrica vuoi calcolare il perimetro?\n[1] - Cerchio\n[2] - Rettangolo");
            int newScelta = myScelta.nextInt();
            if (newScelta==1){
                myCircle.getPerimeter();
            } else if (newScelta==2){
                myRectangle.getPerimeter();
            } else {
                System.out.println("Inserimento errato.");
            }
            break;
            default:
            System.out.println("Errore inserimento!");
        }
    
    }


    public void addShape(){
        Scanner shapeName = new Scanner(System.in);
        System.out.println("Inserisci il nome della forma che vuoi aggiungere: ");
        String shape = shapeName.nextLine();
    }

    public void getTotalArea(){
        int areaTotale = myCircle1.areacerchio+myRectangle1.areaRettangolo;
        System.out.println("L'area totale delle forme disponibili e': "+areaTotale);

    }
    public void getTotalPerimeter(){ // 
        int perimetroTotale = myCircle1.perimetrocerchio+myRectangle1.perimetroRettangolo;
        System.out.println("Il perimetro totale delle forme disponibili e': "+perimetroTotale);
    }
}

abstract class Shape {
    public abstract void getArea();
    public abstract void getPerimeter();
}

class Circle extends Shape {
    public int radius, area, perimeter;
    public Circle(int raggio, int areacerchio, int perimetrocerchio){
        this.radius = raggio;
        this.area = areacerchio;
        this.perimeter = perimetrocerchio;
    }

    public void getShape(){
        System.out.println("Circle");
    }

    public void getArea(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Inserisci il raggio del cerchio:");
        double radius = myInput.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("L'area del tuo cercio e' pari a: "+area);
        myInput.close();
    }
    public void getPerimeter(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Inserisci il raggio del cerchio:");
        double radius = myInput.nextDouble();
        double perimeter = Math.PI * radius * 2;
        System.out.println("L'area del tuo cercio e' pari a: "+perimeter);
        myInput.close();
    }
}

class Rectangle extends Shape {
    public int baseR, altezzaR, areaR, perimeterR;
    public Rectangle(int base, int altezza, int areaRettangolo, int perimetroRettangolo){
        this.baseR = base;
        this.altezzaR = altezza;
        this.areaR = areaRettangolo;
        this.perimeterR = perimetroRettangolo;
    }
    public void getShape(){
        System.out.println("Rectangle");
    }

    public void getArea(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Inserisci l'altezza del rettangolo:");
        double height = myInput.nextDouble();
        System.out.println("Inserisci la base del rettangolo:");
        double base = myInput.nextDouble();
        double rectangleArea = height * base;
        System.out.println("L'area del tuo rettangolo e' pari a: "+rectangleArea);
        myInput.close();
    }
    public void getPerimeter(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Inserisci l'altezza del rettangolo:");
        double height = myInput.nextDouble();
        System.out.println("Inserisci la base del rettangolo:");
        double base = myInput.nextDouble();
        double rectanglePerimeter = (height * base)*2;
        System.out.println("Il perimetro del tuo rettangolo e' pari a: "+rectanglePerimeter);
        myInput.close();
    }
}

/*class newShape extends Shape {

    String shapeName;
    public newShape(String newShapeName){
        this.shapeName = newShapeName;
    }

    public void setNewShapeName(String shapeNameChosen){
        this.shapeName = shapeNameChosen;
    }

    public String getNewShapeName(){
        return shapeName;
    }
    */
