package employeeNew;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class employee {
private int id;
private String name;
private String  role;
private String Address;

    
    private Collection<employeeHistory> history = new ArrayList<employeeHistory>(); 
    
    
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
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Collection<employeeHistory> getHistory() {
		return history;
	}
	public void setHistory(List<employeeHistory> history) {
		this.history = history;
	}

}
