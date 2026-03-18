
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Eric";
		String txt1 = "My name is Eric and am a student in university year 2";
		String txt2 = "My name is Eric and am a student in university year 2";
		String txt3 = "     Eric    ";
		System.out.println("My name is "+name+"\n");
		System.out.println("The length of my name is "+name.length()+"\n");
		System.out.println("My name in capital letters is "+name.toUpperCase()+"\n");
		System.out.println("My name in lower letters is "+name.toLowerCase()+ "\n");
		System.out.println("The position of my name is at "+txt1.indexOf("student")+"\n");
		System.out.println("The character at the 27th position is "+txt1.charAt(27)+"\n");
		System.out.println("The comparison between 2 text is "+txt1.equals(txt2)+"\n");
		System.out.println("The text before is "+txt3+" the text after is "+txt3.trim());
		System.out.println("The concatenation of two strings is "+name.concat(txt1)+"\n");
		System.out.println("The concatanation of two stings is "+name+txt1+"\n");
		System.out.println("Mr "+name);
	}

}
