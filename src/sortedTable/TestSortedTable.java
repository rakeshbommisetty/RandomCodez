package sortedTable;

import java.util.ArrayList;

public class TestSortedTable {

	public static void main(String[] args) throws Exception {
//		int n = Integer.parseInt(args[0]);
		int n = 10;
		MapTable table = new MapTable();
		ArrayList<String> sfields = new ArrayList<String>();
		sfields.add("rating");
		sfields.add("nseats");
		//sfields.add("rating");

		table.addSortedFields(sfields);
		
		for(int i = 0; i < n; ++i) {
			String tname = "Travels" + (i+1);
			float fare = 10.0f + i;
			int nseats = 40 - i;
			int rating = i % 10;
			TravelsInfo tmp = new TravelsInfo(tname, rating, nseats, fare);
			table.add(tmp);
		}
		table.display();
		System.out.println();
		table.displayFields("nseats");
		System.out.println();
		table.displayFields("rating");
	}

}
