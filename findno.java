package stringlab;

public class findno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java programming";
		int totalcount=s.length();
		int totalcount_aftrRemove=s.replace("a", "--").length();
		int count=totalcount-totalcount_afterRemove;
		System.out.println(number of occurence of a is:"+count");

	}

}
