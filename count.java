import java.util.HashMap;
import java.util.Map;

public class count {

			    public static void main(String[] args) {
			        count countWordTest = new count();
			        countWordTest.countWords("This is a program that read the word and match it This program uses map");
			    }
			 
			    public void countWords(String input) {
			        Map <String, String> map = new HashMap <String, String> ();
			 
			        if (input != null) {
			            String[] separatedWords = input.split(" ");
			            for (String str: separatedWords) {
			                if (map.containsKey(str)) {
			                    int count = Integer.parseInt(map.get(str));
			                    map.put(str, String.valueOf(count + 1));
			                } else {
			                    map.put(str, "1");
			                }
			            }
			        }
			 
			        System.out.println("Count :- " + map);
			    }
			 
			}
	
	

