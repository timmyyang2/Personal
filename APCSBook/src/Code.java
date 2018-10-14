
public class Code {
	
	private String code;
	private String old;
	private String x;
	
	public Code(String code) {
	   this.code = code;
	   this.old = code;
	   this.x = "";
	   for(int i = 0; i < code.length(); i++) {
	      x += "X";
	   }
	}

	public void hide(int p1, int p2) {
	   code = code.substring(0, p1) + x.substring(p1, p2) + code.substring(p2, code.length());
	   System.out.println(code);
	}

	public void recover(int p1, int p2) {
	   code = code.substring(0, p1) + old.substring(p1, p2) + code.substring(p2, code.length());
	   System.out.println(code);
	}
	
	public static void main(String[] args) {
		Code code = new Code("ABCdef123ghi456jklMNO");
		code.hide(2, 7);
		code.recover(5, 9);
		code.hide(3, 14);
		code.hide(6, 10);
		code.recover(5, 6);
		code.recover(0, 14);
		
	}

}
