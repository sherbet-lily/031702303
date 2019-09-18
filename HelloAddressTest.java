import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class HelloAddressTest {

	@Test
	public void test1() {
		partition1 person = new partition1();
		assertTrue(person.getName(4,"1!李四,福建省福州13756899511市鼓楼区鼓西街道湖滨路110号湖滨大厦一层").equals("李四"));
	}


	@Test
	public void test2() {
		partition1 person = new partition1();
		assertTrue(person.getTelephone(16,"福建省福州13756899511市鼓楼区鼓西街道湖滨路110号湖滨大厦一层").equals("13756899511"));
	}

	@Test
	public void test3() {
		partition1 person = new partition1();
		person.addressResolution1("福建省福州市鼓楼区鼓西街道湖滨路110号湖滨大厦一层");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("福建省");answer.add("福州市");answer.add("鼓楼区");answer.add("鼓西街道");answer.add("湖滨路110号湖滨大厦一层");
		boolean test = true;
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}
	
	@Test
	public void test4() {
		partition1 person = new partition1();
		person.addressResolution1("福建省福州市鼓楼区五一北路123号福州鼓楼医院");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("福建省");answer.add("福州市");answer.add("鼓楼区");answer.add("");answer.add("五一北路123号福州鼓楼医院");
		boolean test = true;
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}
	
	@Test
	public void test5() {
		partition1 person = new partition1();
		person.addressResolution2("广东省东莞市凤岗镇凤平路13号");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("广东省");answer.add("东莞市");answer.add("");answer.add("凤岗镇");answer.add("凤平路");answer.add("13号");
		boolean test = true;
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}

	@Test
	public void test6() {
		partition1 person = new partition1();
		person.addressResolution1("北京市东城区交道口东大街1号北京市东城区人民法院");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("北京");answer.add("北京市");answer.add("东城区");answer.add("");answer.add("交道口东大街1号北京市东城区人民法院");
		boolean test = true;
		System.out.println(person.address);
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}
	
	@Test
	public void test7() {
		partition1 person = new partition1();
		person.addressResolution2("福建省福州市鼓楼区鼓西街道湖滨路110号湖滨大厦一层");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("福建省");answer.add("福州市");answer.add("鼓楼区");answer.add("鼓西街道");answer.add("湖滨路");answer.add("110号");answer.add("湖滨大厦一层");
		boolean test = true;
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}

	@Test
	public void test8() {
		partition1 person = new partition1();
		person.addressResolution2("江苏省苏州市姑苏区寒山寺弄24号");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("江苏省");answer.add("苏州市");answer.add("姑苏区");answer.add("");answer.add("寒山寺弄");answer.add("24号");answer.add("");
		boolean test = true;
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}
	
	@Test
	public void test9() {
		partition1 person = new partition1();
		person.addressResolution2("福建省宁德市东侨经济开发区东湖路19号");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("福建省");answer.add("宁德市");answer.add("东侨经济开发区");answer.add("");answer.add("东湖路");answer.add("19号");answer.add("");
		System.out.println(person.address);
		boolean test = true;
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}
	
	@Test
	public void test10() {
		partition1 person = new partition1();
		person.addressResolution1("福建福州闽侯县上街镇福州大学10#111");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("福建省");answer.add("福州市");answer.add("闽侯县");answer.add("上街镇");answer.add("福州大学10#111");
		System.out.println(person.address);
		boolean test = true;
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}

}
