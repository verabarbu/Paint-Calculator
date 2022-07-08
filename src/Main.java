import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables declared in main
        double totalObstacle = 0;
        double totalMetres = 0;
        double totalPaintLitres = 0;

        //user input
        Scanner myScanner = new Scanner(System.in);

        //walls number loop
        System.out.println("How many walls do you want to paint?");
        int wallsNo;

        for(wallsNo = myScanner.nextInt(); wallsNo >= 1; wallsNo--) {

            System.out.println("What is the wall length?");
            double length = myScanner.nextDouble();
            System.out.println("The wall length is " + " " + length + " " + "metres");

            System.out.println("What is the wall height?");
            double height = myScanner.nextDouble();
            System.out.println("The wall width is " + " " + height + " " + "metres");

            totalMetres += (length * height);

        }

        System.out.println("The total painting surface is" + " " + totalMetres + " " + "squared metres");

        //obstacles number loop
        System.out.println("How many obstacles do you have in total?");
        int obstacleNo;

        for(obstacleNo = myScanner.nextInt(); obstacleNo >= 1; obstacleNo--) {

                System.out.println("What is the obstacle length?");
                double oLength = myScanner.nextDouble();
                System.out.println("The obstacle length is " + " " + oLength + " " + "metres");

                System.out.println("What is the obstacle height?");
                double oHeight = myScanner.nextDouble();
                System.out.println("The obstacle width is " + " " + oHeight + " " + "metres");

                totalObstacle += (oLength * oHeight);

                System.out.println("The total obstacle surface is" + " " + totalObstacle + " " + "squared metres");

            }

        double toBePainted = totalMetres - totalObstacle;

        System.out.println("There are" + " " + toBePainted + " " + "squared metres to be painted");

        //colour array
        System.out.println("Please choose your colour: red = 0, blue = 1, green = 2, purple = 3");
        String [] colours = {"red", "blue", "green", "purple"};
        System.out.println(colours[myScanner.nextInt()]);
        for (int i = 0; i < colours.length; i++){
            if(colours[i].contains("red")){
                //assuming 1 litre of red paint covers 5 square metres
                totalPaintLitres = (totalMetres - totalObstacle) / 5;
            }else if (colours[i].contains("blue")){
                //assuming 1 of blue paint covers 3 square metres
                totalPaintLitres = (totalMetres - totalObstacle) / 3;
            }else if (colours[i].contains("green")){
                //assuming 1 of green paint covers 2 square metres
                totalPaintLitres = (totalMetres - totalObstacle) / 2;
            } else if (colours[i].contains("purple")){
                //assuming 1 of purple paint covers 6 square metres
                totalPaintLitres = (totalMetres - totalObstacle) / 6;
            }
        }

        System.out.println("The total paint needed is" + " " + totalPaintLitres + " " + "litres");

        System.out.println("How many litres are in the paint bucket?");
        double paintBucket = myScanner.nextDouble();

        System.out.println("How much does the paint bucket cost?");
        double bucketCost = myScanner.nextDouble();

        System.out.println("How many coats of paint do you need?");
        int coats = myScanner.nextInt();

        switch (coats) {
            case 1 -> System.out.println("1 coat does not seem enough");
            case 2 -> System.out.println("2 coats it's about right");
            case 3 -> System.out.println("Good job");
            default -> System.out.println("Too much paint!!!");
        }

        System.out.println("You need" + " " + Math.ceil((totalPaintLitres/paintBucket)*coats) + " " + "buckets");
        System.out.println("The paint will cost you" + " " + Math.ceil(((totalPaintLitres/paintBucket)*coats)*bucketCost) + " " + "GBP");

    }
}