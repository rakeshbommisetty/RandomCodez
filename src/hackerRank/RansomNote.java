package hackerRank;

import java.util.*;

public class RansomNote {
    Map<String,Integer> magSet;
    String[] noteSet;
    
    public RansomNote(String magazine, String note) {
        magSet = new HashMap<String,Integer>();
        String[] magArr = magazine.split("\\s");
                
        for(String s:magArr){
            if(!magSet.containsKey(s))
                magSet.put(s,1);
            else{
                int count = magSet.get(s);
                count += 1;
                magSet.put(s,count);
            }
        }
        
        noteSet = note.split("\\s");
        
    }
    
    public boolean solve() {
        
        for(String ns:noteSet){
            if(magSet.containsKey(ns)){
                int count = magSet.get(ns);
                if(count==1){
                    magSet.remove(ns);
                }else{
                    magSet.put(ns,--count);
                }
            }else{
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
