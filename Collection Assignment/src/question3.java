import java.util.*;

class employee   {
	private int id;
	private String name;
	private String dept;
	private int salary;
	
	public employee(int id,String name,String dept,int salary) {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public int getSalary() {
		return salary;
	}

}
class employeenamecmp implements Comparator<employee> {
	@Override
	public int compare(employee o1, employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
public class question3 {

	public static void main(String[] args) {
		//employee e1 = new employee(101,"gfs","HKL",20000);
		//employee e2 = new employee(102,"leuw","YSJ",30000);
		
		Set<employee> em = new TreeSet<employee>(new employeenamecmp());
		em.add(new employee(101,"bfs","HKL",20000));
		em.add(new employee(103,"aeuw","YSJ",30000));
		em.add(new employee(102,"cfjs","UKL",18000));
		em.add(new employee(105,"obfs","HKL",17000));
		em.add(new employee(106,"naeuw","YSJ",30000));
		em.add(new employee(104,"fs","UKL",28000));

		for(employee e:em) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary());
		}
		
	}

}
