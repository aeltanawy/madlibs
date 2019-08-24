//Tutorial from Blondiebytes for Hackerrank 30-day coding challenge
package madlibs;

import java.util.Scanner;
import java.util.Random;

public class MadLibs {

  Scanner scanner = new Scanner(System.in);
  String story;
  String name;
  String adj1;
  String adj2;
  String noun1;
  String noun2;
  String noun3;
  String adv;
  String randnums;
  Random rand = new Random();

  // Getters

  public String getStory() {
    return story;
  }

  public String getName() {
    return name;
  }

  public String getAdj1() {
    return adj1;
  }

  public String getAdj2() {
    return adj2;
  }

  public String getNoun1() {
    return noun1;
  }

  public String getNoun2() {
    return noun2;
  }

  public String getNoun3() {
    return noun3;
  }

  public String getAdv() {
    return adv;
  }

  public String getRandNums(){
    return randnums;
  }

  // Setters
  public void setStory(String newStory) {
    this.story = newStory;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public void setAdj1(String newAdj1) {
    this.adj1 = newAdj1;
  }

  public void setAdj2(String newAdj2) {
    this.adj2 = newAdj2;
  }

  public void setNoun1(String newNoun1) {
    this.noun1 = newNoun1;
  }

  public void setNoun2(String newNoun2) {
    this.noun2 = newNoun2;
  }

  public void setNoun3(String newNoun3) {
    this.noun3 = newNoun3;
  }
  public void setAdv(String newAdv) {
    this.adv = newAdv;
  }

  public void setRandNums() {
    int num = Math.abs(rand.nextInt()) % 100;
    int index = 0;
    int[] numberHolder = new int[3]; //an array with 3 items with int only
    while (index < numberHolder.length) {
      numberHolder[index] = num + index;
      index++;
    }
    randnums = "not " + numberHolder[0] + ", not " + numberHolder[1] + ", but " + numberHolder[2];
  }

  // Print Instructions to Player
  public void printInst() {
    System.out.println("Welcome to the MadLibs game. If you type in"
      + "words, we'll give you a story. Start by typing in a name:");
  }

  // Get data from player
  public void enterName() {
    setName(scanner.nextLine());
  }

  public void enterNoun1() {
    System.out.println("Give me a noun: ");
    setNoun1(scanner.nextLine());
  }

  public void enterNoun2() {
    System.out.println("Give me a second noun: ");
    setNoun2(scanner.nextLine());
  }

  public void enterNoun3() {
    System.out.println("Give me a final noun: ");
    setNoun3(scanner.nextLine());
  }

  public void enterAdj1() {
    System.out.println("Give me an adjective: ");
    setAdj1(scanner.nextLine());
  }

  public void enterAdj2() {
    System.out.println("Give me another adjective: ");
    setAdj2(scanner.nextLine());
  }

  public void enterAdv() {
    System.out.println("I need an adverb: ");
    setAdv(scanner.nextLine());
  }

  public void putTogetherTheStory(){
    String story;
    int num = Math.abs(rand.nextInt()) % 2;
    if (num == 0) {
      story = "Jesse and her best friend " + getName() + " went to Disney World today. They  saw a " + getNoun1() + " in a show at the Magic Kingdom and ate a " + getAdj1() + " feast for dinner. The next day I ran" + getAdv() + " to meet Micky Mouse in his " + getNoun2() + " and then that night I gazed at the " + getRandNums() + " " + getAdj2() + " fireworks shooting from the " + getNoun3() + ".";
    } else {
      story = "Amanda and her frenemy " + getName() + " went to the zoo last summer. They saw a huge " + getNoun1() + " and a tiny little " + getNoun2()+ ". That night they decided to climb " + getAdv() + " into the " + getNoun3() + " to get a closer look. The zoo was " + getAdj1() + " at night, but they didn't care ... until " + getRandNums() + " " + getAdj2() + " apes yelled in their faces, making Amanda and " + getName() + " sprint all the way back home.";
    }
    setStory(story);
  }

  public void play() {
    enterName();
    enterNoun1();
    enterNoun2();
    enterNoun3();
    enterAdj1();
    enterAdj2();
    enterAdv();
    setRandNums();
    putTogetherTheStory();
    System.out.println(getStory());
  }

  public static void main(String[] args) {
    MadLibs game = new MadLibs();
    game.printInst();
    game.play();
  }
}
