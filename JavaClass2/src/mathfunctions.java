
public class mathfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5, b = 6, c = 25, radius = 8, width = 12, length = 9,radius1 = 8, height = 14;
		
		//area of circle
		double area = Math.PI * Math.pow(radius1, 2);
		
		//area of rectangle
		float area2 = length * width;
		
		//volume of cylinder
		double volume1 = Math.PI * Math.pow(radius1, 2) * height;
		
		//volume of cone
		double volume2 = (Math.PI * Math.pow(radius1, 2) * height)/3;
		
		System.out.println("The area of circle is: "+area);
		System.out.println("The area of rectangle is: "+area2);
		System.out.println("The volume of a cylinder is: "+volume1);
		System.out.println("The volume of a coner is: "+volume2);
		
		/*System.out.println("The maximum number between "+a+" and "+b+" is "+Math.max(a, b));
		System.out.println("The minimum number between "+a+" and "+b+" is "+Math.min(a, b));
		System.out.println("The value of pi is "+Math.PI);
		System.out.println("The squareroot of 25 is "+Math.sqrt(c));
		System.out.println("The value of "+a+" power "+b+" is "+Math.pow(a, b));*/
	}

}
