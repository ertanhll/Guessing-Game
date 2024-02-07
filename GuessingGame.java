/*
    Aufgabe 4) Grafische Aufbereitung v. "GuessingGame" und Verwendung v. Methoden
*/
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Aufgabe4 {
    
    public static void main(String[] args) {
        int pixelWidth = 300;
        int pixelHeight = 200;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);



        Scanner sc = new Scanner(System.in);
        int number = new Random().nextInt(201) +(-100);
        int guess;
        int tries = 0;
        int deletehelper = 0;
        int x = 45;


        for(int i= 0;i<4;i++) {
            StdDraw.setPenColor(0, 204, 102);
            StdDraw.filledRectangle(x, 140, 25, 15);
            StdDraw.setPenColor(0, 102, 0);
            StdDraw.filledRectangle(x, 140, 22, 12);

            Font font0 = new Font("TIMES", Font.BOLD, 25);
            StdDraw.setFont(font0);
            StdDraw.setPenColor(Color.lightGray);
            StdDraw.text(x, 140, "€");
            x+=70;
            }
            x=45;

        for(int i= 0;i<4;i++) {
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.filledCircle(x, 70, 25);
            StdDraw.setPenColor(StdDraw.ORANGE);
            StdDraw.filledCircle(x, 70, 20);

            Font font0 = new Font("TIMES", Font.BOLD, 25);
            StdDraw.setFont(font0);
            StdDraw.setPenColor(Color.lightGray);
            StdDraw.text(x, 70, "€");
            x+=70;
        }



        String message = "Which number in the range from -100 to 100 do you want to choose?";

                System.out.println(message);

                while (sc.hasNext() ){


                    if(tries == 7){
                        StdDraw.setPenColor(Color.white);
                        StdDraw.filledRectangle(45, 150, 25,15);

                        Font font = new Font("Times", Font.BOLD, 25);
                        StdDraw.setFont(font);
                        StdDraw.setPenColor(Color.red);
                        StdDraw.text(150,175,"You LOST!!!" );
                        System.out.println("Type something to exit!");
                        sc.next();
                        if (sc.hasNext()){
                            return;
                        }

                    }


                    if (sc.hasNextInt()){
                        guess = sc.nextInt();
                        if(guess >= 100 || guess <= -100){
                            System.out.println("choose a number between 100 and -100");
                        }else{
                            ++deletehelper;
                            ++tries;
                            System.out.println(" This is your " + tries +" . try");
                            System.out.println("You have choosen : " + guess);
                            if(number == guess){
                                Font font1 = new Font("Times", Font.BOLD, 25);
                                StdDraw.setFont(font1);
                                StdDraw.setPenColor(Color.green);
                                StdDraw.text(150,175,"You WON!!!" );
                                System.out.println("Type something to exit!");
                                if (sc.hasNext()){
                                    return;
                                }
                            }
                            if( number > guess){
                                System.out.println("Choose something bigger!");
                            }
                            else{
                                System.out.println("Choose something smaller!");
                            }
                            switch (deletehelper){
                                case 1:
                                    StdDraw.setPenColor(Color.white);
                                    StdDraw.filledCircle(255,70, 25);

                                    break;

                                case 2:
                                    StdDraw.setPenColor(Color.white);
                                    StdDraw.filledCircle(185, 70, 25);
                                    break;

                                case 3:
                                    StdDraw.setPenColor(Color.white);
                                    StdDraw.filledCircle(115, 70, 25);
                                    break;

                                case 4:
                                    StdDraw.setPenColor(Color.white);
                                    StdDraw.filledCircle(45, 70, 25);
                                    break;

                                case 5:
                                    StdDraw.setPenColor(Color.white);
                                    StdDraw.filledRectangle(255, 140, 25,15);
                                    break;

                                case 6:
                                    StdDraw.setPenColor(Color.white);
                                    StdDraw.filledRectangle(185, 140,25,15 );

                                    break;

                                case 7:
                                    StdDraw.setPenColor(Color.white);
                                    StdDraw.filledRectangle(115, 140, 25,15);
                                    break;
                                case 8:
                                    StdDraw.setPenColor(Color.white);
                                    StdDraw.filledRectangle(45, 140, 25,15);
                                    break;
                            }

                        }


                    }else{
                        System.out.println("Invalid input!");
                        sc.next();
                    }
                }

            }

        }




        //1. Mit der Hilfe der Methode hasNextInt, hasNextDouble, hasNextLine kann man
        // die eingegebenen Daten und deren Datentypen unterschieden werden.

        //2. Nein. Eine ungültige Eingabe aus dem Input-Stream des Scanners muss nicht
        // entfert werden.