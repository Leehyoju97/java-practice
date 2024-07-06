package basic14.enumex04;

public enum City {
	SEOUL(200), BUSAN(100), JEJU(50);
	
	int population;	// 인스턴스 변수
	
	private City(int population) {
		this.population = population;
	}
	
	public int getPopulation() {	// 인스턴스 메서드
		return population;
	}
}
