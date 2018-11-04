package _00_Text_Funkifier;

public class BackwardsMixedCapsString extends SpecialString {

		public BackwardsMixedCapsString(String s) {
			super(s);
		}

		@Override
		public String funkifyText(String s) {
			String backwards = "";
			for(int i=s.length()-1; i >= 0; i--) {
				backwards = backwards + s.charAt(i);
			}
			String mxdcaps = "";
			for(int i=0; i < backwards.length(); i++) {
				if(i%2 != 0) {
					mxdcaps+=Character.toString(backwards.charAt(i)).toUpperCase();
				} else {
				mxdcaps+=backwards.charAt(i);
				}
			}
			
			return mxdcaps;
		}

	

}
