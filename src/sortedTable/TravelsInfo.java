package sortedTable;

import java.lang.reflect.Field;

public class TravelsInfo {
	private float price;
	private int nseats;
	private int rating;
	private String tname;
	
	public TravelsInfo(String tname, int rating, int nseats,float price){
		this.tname =tname;
		this.rating = rating;
		this.nseats = nseats;
		this.price = price;
	}
	
	public String toString(){
		return "TravelsInfo [ TravelsName:: "+tname+", Rating:: "+rating+",No of Seats:: "+","+nseats+",Price:: "+price+"]";
	}
	
	public Integer getValue(String field) throws IllegalArgumentException, IllegalAccessException{
		     Field[] fields = this.getClass().getDeclaredFields();
		     for(Field name: fields){
		    	 if(name.getName().equals(field)){
		    		 name.setAccessible(true);
		    		 return (int)name.get(this);
		    	 }
		     }
		     return null;
	}
	

}
