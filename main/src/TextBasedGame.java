import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class TextBasedGame {

    public static void main(String[] args) {
        intro();
        checkAge();
        checkHeight();
        checkWeight();
        System.out.println("\nYay! Now we are ready to plant!");
        start();
        plant();
        water();
        harvest();
        end();
    }
    public static void intro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to my gardening game! Please enter your name");
        String name = scanner.next();
        System.out.println("Welcome, " + name + "!" );
    }
    public static void checkAge(){
        System.out.println("\nBefore we start planting, we have to make sure you are old enough to own land. (you have to be 18...but not too old either!) ");
        System.out.println("Please enter your age");
        Scanner ageCheck = new Scanner(System.in);
        int age = ageCheck.nextInt();
        if (age<18){
            System.out.println("Oh no! You are too young to own land.");
            System.out.println("You need to be " + (18-age) + " years older to own land. Try again in " + (18-age)+" years!");

            System.exit(0);
        }
       else if (age>100) {
            System.out.println("Oh no! You are too old and cannot move around to plant flowers");
            System.out.println("You need to be " + (age-100) + " years younger to buy land. Maybe in another life...");
            System.exit(0);

        }

    }

    public static void checkHeight(){
        System.out.println("\nWe also need to check whether you are tall enough to plant flowers!");
        System.out.println("Please enter your height (cm)");
        Scanner heightCheck = new Scanner(System.in);
        int height = heightCheck.nextInt();
        if (height <100||height>200) {
            if (height < 100) {
                System.out.println("You are too short! The flowers you plant will probably be taller than you");
                System.out.println("You need to be " + (height * 1.5) + " cm taller to plant flowers");
                System.exit(0);
            }
            if (height > 200) {
                System.out.println("You are too tall! How will you bend down to plant the flowers?");
                System.out.println("You need to be " + (200 - height) + " cm shorter to plant");
                System.exit(0);
            }
        }
        System.out.println("Fun fact: the singles digit of your height is " + height%10);

    }

    public static void checkWeight(){
        System.out.println("\nGreat. We still need you to fulfill the weight requirements");
        System.out.println("Please enter your weight (kg)");
        Scanner weightCheck = new Scanner(System.in);
        int weight = weightCheck.nextInt();
        if (weight<30){
            System.out.println("you are too light! the wind will blow you away");
            System.out.println("If you were twice as heavy, you would weigh " + weight*2 + " kg");

            System.out.println("You need to be " + (weight+20) + " kg heavier to plant flowers");
            return;
        }

    }


    public static void start() {
        System.out.println("Choose your flower: \n a. tulips\n b. roses \n c. daisies");
        Scanner scanner = new Scanner(System.in);
        char typeFlower=scanner.next().charAt(0);
        if (typeFlower == 'a') {
            System.out.println("You have picked tulips: You need a shovel, water, and tulip seeds.");
        } else if (typeFlower == 'b') {
            System.out.println("You have picked roses: You need a shovel, water, and rose seeds.");
        } else if (typeFlower == 'c') {
            System.out.println("You have picked daisies: You need a shovel, water, and daisy seeds.");
        }
        else {
            System.out.println("you are unable to follow directions and unworthy of planting flowers. you lose. goodbye");
            System.exit(0);
        }
    }
    public static void plant() {
        System.out.println("\nLet's start planting! Dig a small hole and plant the seeds.");
        System.out.println("Enter 'plant' when you're ready.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("plant")) {
            System.out.println("you planted your seeds! let's water it now.");
        } else {
            System.out.println("you did not plant the seed and it blew away in the wind. you lose");
            System.exit(0);
        }
    }

    public static void water() {
        System.out.println("\nEnter 'watermyplant' when you're ready to water the plants.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("watermyplant")) {
            System.out.println("you've watered your plant! now all we have to do is wait");
        } else {
            System.out.println("your plant was not watered and it shrivelled up and died. you lose. goodbye!");
            System.exit(0);
        }
    }

    public static void harvest() {
        System.out.println("\nEnter 'harvest' to see you many you've harvested! (this will be between 1-10)");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("harvest")) {
            Random random = new Random();
            // Generate a random number of flowers (1-10)
            int flowerCount = random.nextInt(10) + 1;
            System.out.println("\nYou harvested " + flowerCount + " flowers.");

            if (flowerCount >= 8) {
                System.out.println("that's perfect! you're going to make a lot of money");
            } else if (flowerCount >= 5) {
                System.out.println("not bad! that's a good amount of flowers");
            } else if (flowerCount >= 1) {
                System.out.println("hmm... that's not good. maybe the water was contaminated...");
            } else {
                System.out.println("what happened? did you even plant the seeds");
            }
        } else {
            System.out.println("you did not harvest your flowers! your neighbour took them and sold them all. better luck next time!");
            System.exit(0);
        }
    }
    public static void end() {
        System.out.println("\nThank you for playing! You were great today.");
        System.out.println("See you again soon!");
    }

}
