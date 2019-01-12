package symetricstring;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SymetricString {
	
	public List<Character> getCharsFromString(String string){
		List<Character> listChars = new ArrayList<>();
		for(int i=0;i<string.length();i++) {
			char c = string.charAt(i);
			if(c=='{'|| c=='}' || c=='[' || c==']' || c=='(' || c==')' ) {
				listChars.add(c);
			}
		}
		return listChars;
	}
	
	public boolean testSymetry(String string) {
		List<Character> listChars = getCharsFromString(string);
		Deque<Character> dequeChars = new LinkedList<>();
		for(int i=0;i<=listChars.size()-1;) {
			char c = (char)listChars.get(i);
			char c1 = i==listChars.size()-1 ? ' ' : (char)listChars.get(i+1);
			char cDeque = dequeChars.peekLast()!=null ? (char)dequeChars.peekLast() : ' ';
			if((c=='{'&& c1=='}') || (c=='[' && c1==']') || (c=='(' && c1==')') ) {
				listChars.remove(i);
				listChars.remove(i);
			}
			else if(  (cDeque=='{'&& c=='}') || (cDeque=='[' && c==']') || (cDeque=='(' && c==')') ) {
				dequeChars.pollLast();
				listChars.remove(i);
			}else {
				dequeChars.addLast(c);
				listChars.remove(i);
			}
		}
		return dequeChars.isEmpty();
	}

}