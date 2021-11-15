package WorldData;

import java.util.ArrayList;

public class Main {
	public static DBManager dbM;
	public static ArrayList<Info> countryList;
	public static FrameMain MF;

	public static void main(String[] args) {
		dbM = new DBManager();
		countryList = new ArrayList<Info>();
		// TODO Auto-generated method stub
		MF = new FrameMain();
	}
}
