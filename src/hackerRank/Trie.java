package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Trie {
    
    public static class Node{
        int NUMBER_OF_CHARS = 26;
        Node[] children = new Node[NUMBER_OF_CHARS];
        int size=0;
        
        private  int getIndex(char c){
            return c - 'a';
        }
        
        private  Node getNode(char c){
            return children[getIndex(c)];
        }
        
        private  void setNode(char c, Node node){
            children[getIndex(c)] = node;
        }
        
        private void add(String s){
            add(s,0);
        }
        
        private void add(String s, int index){
            
            size++;
            if(index == s.length() ){
                return;
            }
            
            char currentChar = s.charAt(index);
          //  int index = getIndex(currentChar);
            
            Node child = getNode(currentChar);
            
            if(child==null){
                child = new Node();
                setNode(currentChar, child);
                
            }
            child.add(s, index+1);
        }
        
        public int findCount(String s, int index){
            if(index == s.length()){
                return size;
            }
            
            Node child = getNode(s.charAt(index));
            
            if(child == null){
                return 0;
            }
            return child.findCount(s, index+1);
            
        }
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node root = new Node();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            
            switch(op){
                case "add" : 
                root.add(contact);
                break;
                
                case "find" : 
                System.out.println(root.findCount(contact, 0));
                break;
                
                default : 
                System.out.println("Invalid Input");
            }
        }
    }
}

