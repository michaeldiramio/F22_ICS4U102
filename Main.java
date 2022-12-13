import java.util.ArrayList;

public class Main {


	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();

		animals.add(new Cat());
    animals.add(new Bird());

		/*for(int i = 0; i < animals.size(); i++) {
			animals.get(i).makeNoise();
		}*/

		// a "for each" loop
		for(Animal a : animals) {
			a.makeNoise();
		}
		
	}
	
}