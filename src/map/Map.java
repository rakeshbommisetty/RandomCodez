package map;

public interface Map {
public boolean put(String key, Integer value);
public Integer get(String key);
public String remove(String key);
public boolean contains(String key);
public int size();
public void display();
}
