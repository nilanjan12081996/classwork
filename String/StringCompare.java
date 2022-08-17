package string;

public class StringCompare {

	public static void main(String[] args) {
		/*String s1="hello";
		String s2="hello";
		String s3="meklo";
		String s4="hemlo";
		String s5="flag";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		String str5=s1.concat(s2).concat(s3).concat(s4).concat(s5);
		System.out.println(str5);*/
//		String name="good morning";
//		System.out.println(name.isEmpty());
//		System.out.println(name.startsWith("good"));
//		System.out.println(name.indexOf('o'));
//		String str=new String("wrlcome");
//		String str1=new String("wrlcome");
//		System.out.println(str==str1);
		StringBuilder builder=new StringBuilder("Hello World");
		System.out.println(builder);
		builder.append(" I am learning string ");
		System.out.println(builder);
		//builder.reverse();
		System.out.println(builder);
		builder.insert(25, " java");
		System.out.println(builder);
		builder.insert(0, "hi ");
		System.out.println(builder);
		builder.replace(29, 33, "Python");
		System.out.println(builder);
		builder.delete(36,42);
		System.out.println(builder);
		StringBuffer buffer=new StringBuffer("Hello Java");
		buffer.append(" World");
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		System.out.println(buffer.charAt(4));
		System.out.println(buffer.indexOf("ello"));
		System.out.println(buffer.substring(6));
		System.out.println(buffer.substring(6,10));
		System.out.println(buffer.delete(6, 10));
		System.out.println(buffer.deleteCharAt(5));

	}

}
