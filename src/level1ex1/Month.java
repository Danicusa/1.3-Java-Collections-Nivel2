package level1ex1;

public class Month {
	private String name;
	
	public Month(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean equals(Object object) {
        if (object == null) return false;
        
        if (!(object instanceof Month)) return false;
        
        Month mont = (Month) object; 
        return this.getName().equals(mont.getName());
    }

		public int hashCode() {
		return this.getName().hashCode();
		}

}

