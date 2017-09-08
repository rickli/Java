
import java.io.Serializable;

public class JavaBean implements Serializable{
	
	private static final long serialVersionUID = 3894457445078873884L;
	
	private String name=null;
	private int age=0;
	private float height=0f;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//
		//
		name=null;
		
		System.gc();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public JavaBean() {
		super();
	}
}