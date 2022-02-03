/*this program is to understand the difference
 *  between class object and reference*/

package tim.classreferenceobject.house;

public class Main {
	public static void main(String args[]) {
		House greenHouse = new House("Green"); //creating a new instance
		House  anotherHouse = greenHouse; //referencing object to another variable
		System.out.println(greenHouse.getColor());
		System.out.println(anotherHouse.getColor());
		
		anotherHouse.setColor("Purple");
		System.out.println(greenHouse.getColor());
		System.out.println(anotherHouse.getColor());
		
		House blueHouse = new House("Blue");
		System.out.println(blueHouse.getColor());
		
	    anotherHouse = blueHouse;
	    System.out.println(anotherHouse.getColor());
	}
}
