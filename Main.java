import java.util.ArrayList;

public class Main {


	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();

		animals.add(new Cat());
    animals.add(new Dog());
    animals.add(new Eagle());
    animals.add(new Fish());
    animals.add(new Jellyfish());
		animals.add(new Giraffe());

		/*for(int i = 0; i < animals.size(); i++) {
			animals.get(i).makeNoise();
		}*/

		// a "for each" loop
		for(Animal a : animals) {
			a.makeNoise();
		}
		
	}
	
}