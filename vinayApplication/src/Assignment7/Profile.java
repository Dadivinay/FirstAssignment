package Assignment7;

public class Profile {
	 private String name;
	    private int age;
	    private String location;
	    private String bio;
		public Profile(String name, int age, String location, String bio) {
			super();
			this.name = name;
			this.age = age;
			this.location = location;
			this.bio = bio;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getBio() {
			return bio;
		}
		public void setBio(String bio) {
			this.bio = bio;
		}
		@Override
		public String toString() {
			return "Profile [name=" + name + ", age=" + age + ", location=" + location + ", bio=" + bio + "]";
		}
}
