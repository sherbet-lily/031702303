import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class partition1 extends partitionI {
	String province;
	String city;
	String county;
	String town;
	String detail;
	String detailstreet;
	String detailnum;
	public void addressResolution1(String ogdata){
        String regex="(?<province>[^省]+自治区|.*?省|.*?行政区|.*?市)(?<city>[^市]+自治州|.*?地区|.*?行政单位|.+盟|市辖区|.*?市|.*?县)(?<county>[^县]+县|.+区|.+市|.+旗|.+海域|.+岛)?(?<town>[^区]+区|.+镇|.+乡|.+街道)?(?<detail>.*)";
        Matcher m=Pattern.compile(regex).matcher(ogdata);
        while(m.find()) { 
        	province = m.group("province");
        	address.add((province==null?"":province.trim()));
        	city = m.group("city");
        	address.add((city==null?"":city.trim()));
        	county = m.group("county");
        	address.add((county==null?"":county.trim()));
        	town = m.group("town");
        	address.add((town==null?"":town.trim()));
        	detail = m.group("detail");
        	address.add((detail==null?"":detail.trim()));
        }
	}
	
	public void addressResolution2(String ogdata){
        String regex="(?<province>[^省]+自治区|.*?省|.*?行政区|.*?市)(?<city>[^市]+自治州|.*?地区|.*?行政单位|.+盟|市辖区|.*?市|.*?县)(?<county>[^县]+县|.+区|.+市|.+旗|.+海域|.+岛)?(?<town>[^区]+区|.+镇|.+乡|.+街道)?(?<detailstreet>.[^路]+路|.+道|.+街|.+巷|.+胡同|.+里弄|.+弄)?(?<detailnum>.[^号]+号)?(?<detail>.*)";
        Matcher m=Pattern.compile(regex).matcher(ogdata);
        while(m.find()) { 
        	province = m.group("province");
        	address.add((province==null?"":province.trim()));
        	city = m.group("city");
        	address.add((city==null?"":city.trim()));
        	county = m.group("county"); 
        	address.add((county==null?"":county.trim()));
        	town = m.group("town");
        	address.add((town==null?"":town.trim()));
        	detailstreet = m.group("detailstreet");
        	address.add((detailstreet==null?"":detailstreet.trim()));
        	detailnum = m.group("detailnum");
        	address.add((detailnum==null?"":detailnum.trim()));
        	detail = m.group("detail");
        	address.add((detail==null?"":detail.trim()));
        }
	}
	
	public Map<String,Object> show(){
		Map<String,Object> row=null;
		row=new LinkedHashMap<String,Object>();
		row.put("姓名",name);
		row.put("手机",telephone);
		row.put("地址",address);
		return row;
	}
	
	
}
