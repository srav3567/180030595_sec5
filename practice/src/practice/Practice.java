package practice;

public class Practice {
	public static void main(String[] args) {
    //0123456789
	String s1="hi how are";//how-->(s,d)(3,6)
//charAt is used to find the character at a particular location
	System.out.println(s1.charAt(3));
//length
	System.out.println(s1.length());
//indexOf
	System.out.println(s1.indexOf('h'));
//lastIndexOf
	System.out.println(s1.lastIndexOf('h'));
//toUpperCase() ,toLowerCase()
	System.out.println(s1.toUpperCase()+" "+s1.toLowerCase());
  }
}
