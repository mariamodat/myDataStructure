package stacksAndQueues;

import java.util.ArrayList;

public class AnimalShelter {
  protected ArrayList<Animal> animals;

//  public AnimalShelter(ArrayList<Animal> animals) {
//    this.animals = animals;
//  }

  public AnimalShelter() {
    animals = new ArrayList<>();
  }


  public void enqueue(Animal animal1) {
    animals.add(animal1);
  }

  public Animal dequeue(String pref) {
    pref = pref.toLowerCase();
    Animal animal;
    int incrementor = 0;
    switch (pref) {
      case "dog":
        do {
          animal = animals.get(incrementor++);
        } while (animal.getClass() != Dogs.class);
        animals.remove(animal);
        return animal;
      case "cat":
        do {
          animal = animals.get(incrementor++);
        } while (animal.getClass() != Cats.class);
        animals.remove(animal);
        return animal;
      default:
        return null;
    }

  }
}
