import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;

public class Main {
	public static void main(String[] args) {
		 if (args.length<2){
	            return;
	        }
	        try {
	            String pathname = args[0];
	            File filename = new File(pathname);
	            InputStreamReader reader = new InputStreamReader(
	                    new FileInputStream(filename));
	            BufferedReader br = new BufferedReader(reader);
	            File writename = new File(args[1]);
	            writename.createNewFile();
	            BufferedWriter out = new BufferedWriter(new FileWriter(writename));
	            String line = "";
	            line = br.readLine();
	            while (line != null) {
	                int function=0;
	        		partition1 person = new partition1();
	        		 int ch = line.indexOf(",");
	        		 if(line.charAt(0)=='1') function=1;
	        		 else function=2;
	        		 person.name =person.getName(ch,line); 
	        		 
	        		 line = line.substring(ch+1); //trimname
	        		 int num = 0;
	        		 int i;
	        		 for(i = 0;i<line.length();i++)
	        		 {
	        			 if(num==11)
	        			 {
	        				break;
	        			 }
	        			 if(line.charAt(i)<=57 && line.charAt(i)>=48)
	        			 {
	        				 num++;
	        			 }
	        			 else if (num!=0)
	        			 {
	        				 num=0;
	        			 }
	        			 else continue;
	        		 }
	        		 person.telephone = person.getTelephone(i,line);
	        		
	        		 line = line.replaceAll(person.telephone,""); //trimtelephone
	        		 if(function == 1) person.addressResolution1(line);
	        		 else person.addressResolution2(line);
	        		List<Map<String,Object>> table=new ArrayList<Map<String,Object>>();
	        		table.add(person.show());
	        		JSONArray json = new JSONArray(table);
	        		line = json.toString();
	        	     out.write(line);
	        	     line = br.readLine();
	            }
	            out.flush();

	            out.close();
	            br.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
}
