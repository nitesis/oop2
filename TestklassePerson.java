
import java.util.*; 

public class TestklassePerson {

	public static void main(String[] args) {
		
		Person ben = new Person(1, "l'Oncle Soul", "Ben");
		Person erykah = new Person(2, "Badu", "Erykah");
		Person amy = new Person(3, "Winehouse", "Amy");
		Person ester = new Person(4, "Rada", "Ester");
		Person shiva = new Person(5,"Nata","Shiva");
		
		System.out.println(ben.toString());
		System.out.println(erykah.toString());
		System.out.println(amy.toString());
		
		ArrayList<Person> myList = new ArrayList<>();
		myList.add(ben);
		myList.add(erykah);
		myList.add(amy);
		myList.add(ester);
		myList.add(shiva);
		
		System.out.println(myList);
		
		TreeSet<Person> mySet = new TreeSet<>();
		mySet.add(ben);
		mySet.add(erykah);
		mySet.add(amy);
		mySet.add(shiva);
		mySet.add(ester);
		
		System.out.println(mySet);
		
		HashMap<Integer, Person> myMap = new HashMap<>();
		myMap.put(5, shiva);
		myMap.put(2, ester);
		myMap.put(3, erykah);
		myMap.put(4, ben);
		myMap.put(1, amy);
		System.out.println(myMap);

	}

}
