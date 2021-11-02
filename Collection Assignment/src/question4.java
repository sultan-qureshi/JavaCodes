import java.util.Iterator;
import java.util.LinkedList;
import java.time.*;
public class question4 {

	public static void main(String[] args) {
		
		

		LocalDate dat1 =  LocalDate.of(1999, 12, 17); 
		LocalDate dat2 = LocalDate.of(2000, 12, 23); 
		LocalDate dat3 = LocalDate.of(1998, 01, 01); 
		LocalDate dat4 = LocalDate.of(2003, 10, 19); 

		LinkedList db = new LinkedList();
		db.add(dat1);
		db.add(dat2);
		db.add(dat3);
		db.add(dat4);
		
	
		 Iterator itr=db.iterator();  
		  while(itr.hasNext()){  
		
			  System.out.println("Your DOB is: "+itr.next()+" and it a leap Year");  
		  }  
		

	}
}
