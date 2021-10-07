import java.util.Scanner;


public class Pythagoras {

    
        public static void main(String[] args) {
         

           Scanner zahl = new Scanner(System.in);
           System.out.println("Sie haben die Wahl zwischen Folgenden Optionen \n Pythagoras \n Höhensatz \n Höhe im gleichseitigen Dreieck (HigD)");
           System.out.println("Für nicht bekannte Werte geben Sie <0 ein");
           String Auswahl = zahl.nextLine();
           
           if (Auswahl.contains("Pythagoras"))
           {
           
           System.out.println("a:");
           double a = zahl.nextDouble();
           System.out.println("b:");
           double b = zahl.nextDouble();
            
            if (a>=0 && b >=0){
           double c = Math.sqrt((a*a)+(b*b));
            System.out.println("c ist: "+ c); 
            }

            else if (a<=0 )                             
            {
                System.out.println("Geben sie c ein");
                double c = zahl.nextDouble();
                a = Math.sqrt((c*c)-(b*b));
                System.out.println("a ist: " + c);
            }
            else if (b<=0 )                  
            {
                System.out.println("Geben sie c ein");
                double c = zahl.nextDouble();
                b = Math.sqrt((c*c)-(a*a));
                System.out.println("b ist: " + b); 
            }
          }
          else if (Auswahl.contains("Höhensatz"))
          {
            
            System.out.println("p:");
           double p = zahl.nextDouble();
           System.out.println("q:");
           double q = zahl.nextDouble();
            
            if (p>=0 && q>=0){
           double h = Math.sqrt((p)+(q));
            System.out.println("Die Höhe ist: "+ h); 
            }

            else if (p<=0 )                             
            {
                System.out.println("Geben sie h ein");
                double h = zahl.nextDouble();
                p = (h*h)/q;
                System.out.println("p ist: " + p);
            }
            else if (q<=0 )                  
            {
                System.out.println("Geben sie h ein");
                double h = zahl.nextDouble();
                q = (h*h)/p;
                System.out.println("h ist: " + h); 
            }
          }
            else if (!Auswahl.contains("Pythagoras") || !Auswahl.contains("Höhensatz")) {
              if (Auswahl.contains("HigD"))
              {
                System.out.println("Geben sie die Seitenlänge s ein");
                double s = zahl.nextDouble();
                double hGleichseitig   = Math.sqrt(3)/2*s;
                System.out.println("Die Höhe ist: " + hGleichseitig);
                
              }
            }
          }
        }
    

