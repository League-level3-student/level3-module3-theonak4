package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String backwards = "";
		for(int i=s.length()-1; i >= 0; i--) {
			backwards = backwards + s.charAt(i);
		}
		return backwards;
	}

}
