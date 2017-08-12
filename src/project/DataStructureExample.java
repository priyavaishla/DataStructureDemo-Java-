package project;

import java.util.HashMap;
import java.util.HashSet;

class address{
	String state;
	int zipcode;
	String city;
	String streetaddress;
	address(String state,int zipcode,String city,String streetaddress){
		this.state=state;
		this.city=city;
		this.zipcode=zipcode;
		this.streetaddress=streetaddress;
		
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreetaddress() {
		return streetaddress;
	}
	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}
	@Override
	public String toString() {
		return "address [state=" + state + ", zipcode=" + zipcode + ", city="
				+ city + ", streetaddress=" + streetaddress + "]";
	}
	@Override
	public int hashCode() {
		if(streetaddress.equals("modinagar"))
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
		address other = (address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (streetaddress == null) {
			if (other.streetaddress != null)
				return false;
		} else if (!streetaddress.equals(other.streetaddress))
			return false;
		if (zipcode != other.zipcode)
			return false;
		return true;
	}
	
	
}
public class DataStructureExample {

	public static void main(String[] args) {
HashMap<String,HashSet<address>> addressmap= new HashMap();	
		
		address a1=new address("up",201024,"ghaziabad","modinagar");
		address a2=new address("mp",201025,"delhi","modinagaram");
		address a3=new address("uk",201023,"ghaziabad","modinagar");
		address a4=new address("um",201029,"kanpur","kolgadar");
HashSet<address>hs= new HashSet();
hs.add(a1);
hs.add(a2);
hs.add(a3);
hs.add(a4);

System.out.println(a1.hashCode());
System.out.println(a2.hashCode());


		addressmap.put("officeaddress", hs)	;
		
		
	System.out.println(addressmap);
		
		
		
		
		
	}

}
