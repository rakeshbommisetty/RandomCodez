package sortedTable;

import java.util.List;

public interface ISortedTable {
public void add(TravelsInfo table) throws IllegalArgumentException, IllegalAccessException;
public void addSortedFields(List<String> fields);
public void displayFields(String field);
public void display();
}
