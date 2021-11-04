import java.util.LinkedList;
import java.time.*;
class datt {
	LocalDate datee;

	public datt(LocalDate datee) {
		this.datee = datee;
	}

	public LocalDate getDatee() {
		return datee;
	}
	
	
}
public class question4 {

	public static void main(String[] args) {

		LinkedList<datt> db = new LinkedList<>();
		db.add(new datt(LocalDate.of(1999, 12, 17)));
		db.add(new datt(LocalDate.of(2000, 12, 23)));
		db.add(new datt(LocalDate.of(1998, 01, 01)));
		db.add(new datt(LocalDate.of(2003, 10, 19)));
		
		for(datt e:db) {
			if(e.getDatee().isLeapYear()==true)
				System.out.println("Your DOB is "+e.getDatee()+" and was a leap Year");
			else if(e.getDatee().isLeapYear()==false)
				System.out.println("Your DOB is "+e.getDatee()+" and was NOT a leap Year");
		}

	}
}
