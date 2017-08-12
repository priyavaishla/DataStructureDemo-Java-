package project;

import java.util.HashSet;
import java.util.TreeSet;

class employee{
	private int id;
	private String name;
	private String address;
	private String designation;
	
	employee( int id,String name, String address,String designation){
	this.id=id;
	this.name=name;
	this.address=address;
	this.designation=designation;
	
	
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", address=" + address
				+ ", designation=" + designation + "]";
	}

	/*@Override
	public int hashCode() {
		if(address.equals("delhi"))
			return 10;
		else return 20;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}	*/
	
}
public class empoyeeExample {

	public static void main(String[] args) {
		
	employee priya=new employee(1,"priya","ghaziabd","software developer");
	employee sumit=new employee(2,"sumit","delhi","manager");
	employee priya1=new employee(1,"priya","ghaziabd","software developer");
	employee sumit1=new employee(2,"sumit","delhi","manager");
	
	/*HashSet<employee> set= new HashSet();
	set.add(sumit1);
	set.add(priya1);
	set.add(sumit);
	set.add(priya);
System.out.println(set);
System.out.println(priya.hashCode());
System.out.println(sumit.hashCode());*/

 TreeSet <employee> set = new TreeSet<>((first,second)->((Integer)first.getId()).compareTo(second.getId())); 
	
 set.add(sumit1);
	set.add(priya1);
	set.add(sumit);
	set.add(priya);
	System.out.println(set);
	}

}
