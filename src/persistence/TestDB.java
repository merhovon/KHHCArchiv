package persistence;

public class TestDB {

	public TestDB() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ConfigTable tabConfig = new ConfigTable();
		tabConfig.insertConfig("C:", "E:", "false");
		tabConfig.updateConfigSource("C:/Benutzer");

	}

}
