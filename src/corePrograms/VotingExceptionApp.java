package corePrograms;


class VoterHandler extends ArithmeticException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getErrorMessage() {
		return "You are not Eligible";
	}
	
}
 class VotingMachine{
	void verifyAge(int age) {
		if(age<18) {
			VoterHandler vh=new VoterHandler();
			throw vh;
		}
		else {
			System.out.println("Congrats...U done");
		}
	}
}


public class VotingExceptionApp {

	public static void main(String[] args) {
		
		
		try {
			VotingMachine v=new VotingMachine();
			v.verifyAge(11);
		}
		catch(VoterHandler ex) {
			System.out.println("Error is "+ex.getErrorMessage());
		}
		
	
		

	}

}
