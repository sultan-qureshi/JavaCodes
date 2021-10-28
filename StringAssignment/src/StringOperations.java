
public class StringOperations {
	public static void main(String[] args)
	{
		String str = new String("This is an example STRING for operations");
		String s1= str.toLowerCase();//Lower Case
		System.out.println(s1);
		
		String s2= str.toUpperCase();//Upper Case
		System.out.println(s2);
		
		String s3 =str.replace('a', '$');//Replace character
		System.out.println(s3);
		
		if(str.contains("example"))      //Check contains or not
			System.out.println("Contains");
		else
			System.out.println("NOT");
		
		String str2 = new String("This is an example string for operations");
		if(str.contentEquals(str2))      //Check match
			System.out.println("Match");
		else
			System.out.println("NOT");
		
	}

}
