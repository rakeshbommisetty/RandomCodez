package cache;

public interface ICache {
void put(String key, Integer value);
Integer get(String key);
void display();
int size();
int capacity();
}
