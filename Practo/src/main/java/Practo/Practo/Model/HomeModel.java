package Practo.Practo.Model;

public class HomeModel {
	    private int id;
	    private String name;
	    private String user;
	    private String password;
	    private String telephone;
	 
	    public void Contact() {
	    }
	 
	    public void Contact(String name, String user, String password, String telephone) {
	        this.name = name;
	        this.user = user;
	        this.password = password;
	        this.telephone = telephone;
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

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getTelephone() {
			return telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
	 
	    // getters and setters
	
}
