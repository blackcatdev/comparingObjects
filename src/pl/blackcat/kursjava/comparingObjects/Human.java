package pl.blackcat.kursjava.comparingObjects;

public class Human {
	private String name;
	private String surname;
	private String pesel;

	private Human(String name, String surname, String pesel) {
		this.name = name;
		this.surname = surname;
		this.pesel = pesel;
	}

	@Override
	public int hashCode() {
		return 13 * pesel.hashCode();
	}

	private boolean equals(Human object) {
		if (object == null)
			return false;
		if (object instanceof Human) {
			//Human otherHuman = object;
			return pesel.equals(object.getPesel());
		}
		return false;


	}

	private String getPesel() {
		return pesel;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public static void main(String[] args) {
		Human human1 = new Human("Adam", "Kowalski", "94040402020");
		Human human2 = new Human("Adam", "Kowalski", "94040402021");
		Human human3 = new Human("Adam", "Kowalski", "94040402020");

		System.out.println("Czy human1 == human2? Ich pesele to: " + human1.getPesel() + " " + human2.getPesel() + ": " + human1.equals(human2));
		System.out.println("Czy human2 == human1? Ich pesele to: " + human2.getPesel() + " " + human1.getPesel() + ": " + human2.equals(human1));
		System.out.println("\n");
		System.out.println("Czy human1 == human3? Ich pesele to: " + human1.getPesel() + " " + human3.getPesel() + ": " + human1.equals(human3));
		System.out.println("Czy human3 == human1? Ich pesele to: " + human3.getPesel() + " " + human1.getPesel() + ": " + human3.equals(human1));
		System.out.println("\n");
		System.out.println("Czy human2 == human3? Ich pesele to: " + human2.getPesel() + " " + human3.getPesel() + ": " + human2.equals(human3));
		System.out.println("Czy human3 == human2? Ich pesele to: " + human3.getPesel() + " " + human2.getPesel() + ": " + human3.equals(human2));


	}
}
