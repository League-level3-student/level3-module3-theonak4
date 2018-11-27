package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm{
public static void main(String[] args) {
	ArrayList<Animal> farm = new ArrayList<Animal>();
	Animal Chicken = new Chicken();
	farm.add(Chicken);
	Animal Cow = new Cow();
	farm.add(Cow);
	Animal Pig = new Pig();
	Animal Pig2 = new Pig();
	farm.add(Pig2);
	farm.add(Pig);
	Animal Sheep = new Sheep();
	Animal Sheep2 = new Sheep();
	Animal Sheep3 = new Sheep();
	farm.add(Sheep3);
	farm.add(Sheep2);
	farm.add(Sheep);
	for(int i = 0; i < farm.size(); i++) {
		farm.get(i).makeNoise();
	}
}
}
