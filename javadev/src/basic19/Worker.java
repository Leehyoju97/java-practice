package basic19;

public class Worker {
	public static final int POSITION_MANAGER = 0;
	public static final int POSITION_ASSISANT = 0;
	public static final int POSITION_EMPLOYEE = 0;
	
	private String name;
	private int position;
	
	public Worker() {
		name = null;
		position = Integer.MAX_VALUE;
	}
		
	public Worker(String name, int position) {
		this.name = name;
		this.position = position;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "Worker [name=" + name + ", position=" + position + "]";
	}
}
