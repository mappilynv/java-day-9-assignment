import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        Animal mac = new Animal("Mac", true);
        animals.add(mac);
        Animal fin = new Animal("Fin");
        animals.add(fin);
        Animal squirrel = new Animal(false);
        animals.add(squirrel);
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");
        while(true){
            System.out.println("Please enter a name:");
            String animalName = scanner.nextLine();
            if(animalName.isEmpty()){
                break;
            }
            System.out.println("Is it a dog? Yes or no:");
            String userInput = scanner.nextLine();
            boolean dogOrNot;
            if(userInput.equals("yes")){
                boolean a = true;
                dogOrNot = a;
            } else {
                boolean b = false;
                dogOrNot = b;
            }

            animals.add(new Animal(animalName, dogOrNot));
        }

        for(Animal animal: animals){
            System.out.println(animal);
        }

    }
}
