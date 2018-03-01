package sortedTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapTable implements ISortedTable {

	private List<TravelsInfo> tlist;
	private Map<String, TreeMap<Integer, TravelsInfo>> travelsMap;
	
	public MapTable(){
		tlist = new ArrayList<TravelsInfo>();
		travelsMap = new HashMap<String, TreeMap<Integer,TravelsInfo>>();
	}
	
	@Override
	public void add(TravelsInfo table) throws IllegalArgumentException, IllegalAccessException {
		tlist.add(table);
		for(String field: travelsMap.keySet()){
			TreeMap<Integer,TravelsInfo> tm = travelsMap.get(field);
			Integer temp = table.getValue(field);
			tm.put(temp, table);
		}
		
		
	}

	@Override
	public void addSortedFields(List<String> fields) {
		for(String field:fields){
			TreeMap<Integer,TravelsInfo> tm = new TreeMap<Integer,TravelsInfo>();
		travelsMap.put(field, tm);
		}
		
	}

	@Override
	public void displayFields(String field) {
		TreeMap<Integer,TravelsInfo> tm = travelsMap.get(field);
		for(Integer i:tm.keySet()){
			System.out.println(tm.get(i));
		}
	}

	@Override
	public void display() {
		for(TravelsInfo item : tlist){
			System.out.println(item.toString());
		}
	}

	
}
