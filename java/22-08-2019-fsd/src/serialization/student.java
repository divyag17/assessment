package serialization;

import java.io.Serializable;

public class student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9074880079613712948L;
	private String id;
	private String name;
	public student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}
	
}
