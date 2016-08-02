package explorerproject;

import org.omg.CORBA.PUBLIC_MEMBER;

public class explorerproject {

	public static void main(String[] args) {
		String sayHi = "Hello World";
		int americaDiscovered = 1492;
		boolean DogAtHome ;
		DogAtHome= true;
		String todaysDate = "August 2nd";
		char xyl = 'X';
		float lunchMoney = 5.45f;
								

		System.out.println(sayHi);

	
		System.out.println("Columbus sailed the World in " + americaDiscovered);
		
		System.out.println("It is " + DogAtHome + " that I have a dog at home");
		
		System.out.println("Today is " + todaysDate);
		
		System.out.println("I spent " + lunchMoney + " on a cheeseburger");
		
		System.out.println(xyl + " marks he spot");
		
				
		String[] movies ={"New Hope", "Empire Strikes Back", "Return of the Jedi", "Dark Knight", "Avengers", "Star Trek", "Temple of Doom", "Last Crusade", "Captain America", "Suicide Squad"};        
		String[] bands ={"Weezer", "Nirvana", "Gasligh Anthem", "Descendents", "Alkaline Trio", "Social Distortion", "Frank Turner", "MMJ", "BB", "Lucero"};
		
	class rectangle {
		int width;
		int length;
		int getArea() {
			return width * length;
			
		}
	}
	
	class cube {
		int width;
		int length;
		int depth;
		int getVolume() {
			return width * length * length;
		}
	}
	
	class triangle {
		int height;
		int width;
		int triArea() {
			return (width * height)/2;
		}
	}
	
	
	
		}
	}
