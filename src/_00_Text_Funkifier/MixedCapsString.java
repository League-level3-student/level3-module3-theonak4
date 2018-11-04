package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String mxdcaps = "";
		s = s.toLowerCase();
		for(int i=0; i < s.length(); i++) {
			if(i%2 != 0) {
				mxdcaps+=Character.toString(s.charAt(i)).toUpperCase();
			} else {
			mxdcaps+=s.charAt(i);
			}
		}
		return mxdcaps;
	}

}
