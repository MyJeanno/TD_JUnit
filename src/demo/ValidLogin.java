package demo;

public class ValidLogin {
	
	private int cpt = 0;
	
	public ValidLogin() {
		// TODO Auto-generated constructor stub
	}
	
	 public boolean isValid(String username, String pass, String confirm)
             throws Exception {
	  if(username.length()==0) throw new EmptyLoginException();
	  if(pass.equals("")|| confirm.equals("")) throw new EmptyPassWordException();
	  if(username.length()< 3) return false;
	  if(pass != confirm) return false;
	  cpt++;
	  return true;       
	}

	public int getCpt() {
	  return cpt;
	}

}
