
/**
 * 
 */
package entity;

/**
 * 
 */
public class Customer {

	// decalring fields
	private String id;
	private String name;
	private String email;
	private String phone;
	private String policys;

	// defining constructors

	public Customer(String id, String name, String email, String phone, String policys) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.policys = policys;
	}

	public Customer(String id, String name, String email, String phone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.policys = "[]";
	}

	// Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPolicys() {
		return policys;
	}

	public void setPolicys(String policys) {
		this.policys = policys;
	}
}