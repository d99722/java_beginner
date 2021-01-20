package exception;

public class PWFormatTest {
	private String userPW;
	
	public String getUserPW() {
		return userPW;
	}
	
	public void setUserPW(String userPW) throws IDFormatException{
		
		if(userPW == null) {
			throw new IDFormatException("비밀번호는 null이 아니어야 합니다.");
		} else if (userPW.matches("[a-zA-Z]+")) {
			throw new IDFormatException("비밀번호는 문자열로만 이루어지면 안됩니다.");
		} else if (userPW.length()<=5) {
			throw new IDFormatException("비밀번호는 6자 이상이어야 합니다.");
		}
		this.userPW = userPW;
		
	}
	
	public static void main(String[] args) {
		PWFormatTest test = new PWFormatTest();
		String[] pws = new String[4];
		pws[0] = null;
		pws[1] = "onlyString";
		pws[2] = "12345";
		pws[3] = "rightPWshift66";
		
		for(int i=0; i<pws.length; i++) {
			try {
				test.setUserPW(pws[i]);
				System.out.println("pws["+i+"]의 pw가 정상적으로 생성되었습니다.");
			} catch(IDFormatException e) {
				System.out.println("error : pws["+i+"] - "+e.getMessage());
			}
		}
		
		
			
		
		
		
	}

}
