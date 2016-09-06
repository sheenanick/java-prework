class Animal {
  public String mName;
  public int mAge;
  public String mBreed;
  public String mSpecies;
  public boolean mAdopted = false;

  public Animal(String name, int age, String breed, String species){
    mName = name;
    mAge = age;
    mBreed = breed;
    mSpecies = species;
  }

  public boolean insidePet(){
    return (mSpecies == "Dog");
  }

}
