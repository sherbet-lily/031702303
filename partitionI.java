import java.util.ArrayList;

public class partitionI {
	String name;
	String telephone;
	ArrayList<String> address = new ArrayList<String>();
	public String getName(int ch,String ogdata) {
		return ogdata.substring(2,ch);
	}
	public String getTelephone(int i,String ogdata) {
		return ogdata.substring(i-11, i);
	}
}
