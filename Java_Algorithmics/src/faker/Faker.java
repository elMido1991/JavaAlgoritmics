package faker;



public class Faker {
	
	private static final String alphabets = "abcdefghijklmnopqrstuvwxyz";
	private static final String numbers = "0123456789";
	
	
	public char getRandomAlphabet() {
		int randomIndex = (int)(Math.random()*25);
		return alphabets.charAt(randomIndex);
	}
	
	public char getRandomNumber() {
		int randomIndex = (int)(Math.random()*9);
		return numbers.charAt(randomIndex);
	}
	
    public String letterify(String letterString) {
    	if(letterString==null)
    		return null;
    	if(letterString.equals(""))
    		return "";
    	StringBuilder toString = new StringBuilder();
    	for(int i=0;i<letterString.length();i++) {
			String c = letterString.charAt(i)+"";
			if(c.matches("[a-zA-Z0-9]")) {
				toString.append(c);
			}
			else if(c.matches("[\\?]"))  {
				toString.append(getRandomAlphabet());
			}
		}
    	return toString.toString();
    }

    public String numerify(String numberString) {
    	if(numberString==null)
    		return null;
    	if(numberString.equals(""))
    		return "";
    	StringBuilder toString = new StringBuilder();
    	for(int i=0;i<numberString.length();i++) {
			String c = numberString.charAt(i)+"";
			if(c.matches("[a-zA-Z0-9]")) {
				toString.append(c);
			}
			else if(c.matches("[\\#]")) {
				toString.append(getRandomNumber());
			}
		}
    	return toString.toString();
    }

    public String bothify(String string) {
    	if(string==null)
    		return null;
    	else if(string.equals(""))
    		return "";
    	StringBuilder toString = new StringBuilder();
    	for(int i=0;i<string.length();i++) {
			String c = string.charAt(i)+"";
			if(c.matches("[a-zA-Z0-9]")) {
				toString.append(c);
			}
			else if(c.matches("[\\#]")) {
				toString.append(getRandomNumber());
			}
			else if(c.matches("[\\?]"))  {
				toString.append(getRandomAlphabet());
			}
		}
    	return toString.toString();
    }

}
