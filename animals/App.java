public class App {
 public static void main(String[] args) {

   Animal dog = new Animal("Roger", 15, "Miniature Schnauzer", "Dog");

    Animal cat = new Animal("Kitty", 9, "Bengal", "Cat");

    Animal monkey = new Animal("Chip", 4, "Spider Monkey", "Monkey");

    Animal[] allAnimals = {dog, cat, monkey};

    System.out.println("Available indoor animals:");

    for (Animal animal : allAnimals){
      if (animal.insidePet()){
        System.out.println("----------------------");
        System.out.println(animal.mName);
        System.out.println(animal.mAge);
        System.out.println(animal.mSpecies);
        System.out.println(animal.mAdopted);
      }
    }

  }
}
