package project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class costumer{
	private int id;
	private String name;
	private String address;
	
	costumer(int id,String name,String address){
		this.id=id;
		this.name=name;
		this.address=address;
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

	@Override
	public String toString() {
		return "costumer [id=" + id + ", name=" + name + ", address=" + address
				+ "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		costumer other = (costumer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}	
	
}
public class CostumerExample {

	public static void main(String[] args) {
	costumer ram=new costumer(1,"ram","ghaziabad");
	costumer shyam= new costumer(2,"shyam","delhi");
	costumer priya= new costumer(3,"priya","delhi");
	costumer sumit= new costumer(4,"sumit","varanasi");
	costumer hari= new costumer(5,"jelvin","ghaziabad");
	
	ArrayList<costumer> list = new ArrayList();
	 list.add(hari);
	list.add(sumit);
    list.add(priya);
      list.add(ram);
    list.add(shyam);
    System.out.println(list);
   //searching operation 
    int x=  list.indexOf(ram);
    if(x>0)
    	System.out.println("ram is found");
    
      costumer ram2=new costumer(1,"ram","ghaziabad");
    if(list.indexOf(ram2)>0)
    	System.out.println("match found in a list");
  
     //sorting 
    Collections.sort(list,(one,two)->one.getName().compareTo(two.getName()));
      System.out.println(list);
      
      
      Collections.sort(list,(one,two)->((Integer)one.getId()).compareTo((Integer)two.getId()));
   //   Collections.sort(list,(one,two)->((Integer)one.getId()).compareTo((Integer)(two.getId())));
      
      System.out.println(list);
	}
	

}
