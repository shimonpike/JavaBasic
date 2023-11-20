package Maps;

public class CarOwner {
	private String name;
	private String phone;
	private int id;
		
	public CarOwner(String name, String phone,
			int id) {
		super();
		this.name = name;
		this.phone = phone;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "name=" + name 
				+ ", phone=" + phone 
				+ ", id=" + id;
	}
	
	
}
