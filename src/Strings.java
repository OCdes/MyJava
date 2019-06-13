import java.util.Locale;
import java.util.StringTokenizer;

public class Strings {
    public static void main(String []args) {
    	/*
    	//1. Java 字符串比较
    	String str = "Hello World";
    	String anotherStr = "hello world";
    	Object objStr = str;
    	System.out.println(str.compareTo(anotherStr));
    	System.out.println(str.compareToIgnoreCase(anotherStr));
    	System.out.println(str.compareTo(objStr.toString()));
    	
    	//2. Java 查找字符串最后一次出现的位置
    	String strOrig = "Hello World,Hello Java";
    	int lastIndex = strOrig.lastIndexOf("Java");
    	if(lastIndex == -1) {
    		System.out.println("没有找到字符串 Java");
    	} else {
    		System.out.println("Java 字符串最后出现的位置："+lastIndex);
    	}
    	
    	//3.Java 删除字符串中某个字符
    	String str = "this is Java";
    	System.out.println(removeCharAt(str, 3));
    	
    	//4.Java 字符串替换：***
    	（1）replace（）对所有字符/或者字符序列进行替换；
    	（2）对第一次出现的字符/或者字符序列替换；
    	（3）对所有字符串进行替换，也可根据对应的替换规则去替换eg:replaceAll("\\d", "*")将所有数字替换为*
    	String str = "Hello World, Hello World";
    	System.out.println(str.replace('H', 'W'));
    	System.out.println(str.replaceFirst("He", "Wa"));
    	System.out.println(str.replaceAll("He", "Ha"));
    	
    	//5.Java 字符串反转
    	String str = "Java";
    	String reverse = new StringBuffer(str).reverse().toString();
    	System.out.println("字符串反转前："+str);
    	System.out.println("字符串反转后："+reverse);
    	
    	//6.Java 字符串查找
    	String strOrig = "Google Baidu Taobao";
    	int intIndex = strOrig.indexOf("Baidu");
    	if (intIndex == -1) {
    		System.out.println("没有找到字符串 Baidu");
    	} else {
    		System.out.println("Baidu 字符串的位置" + intIndex);
    	}
    	
    	//7.Java 字符串分割
    	String str = "www.baidu.com";
    	String[] temp;
    	String delimeter = "\\.";//***'.'需要转义，****
    	temp = str.split(delimeter);
    	String tempStr = temp.toString();
    	System.out.println(tempStr);
    	// 普通 for 循环
    	for (int i = 0; i < temp.length; i ++) {
    		System.out.println(temp[i]);
    		System.out.println("");
    	}
    	//遍历 for each
    	for (String x : temp) {
    		System.out.println(x);
    		System.out.println("");
    	}
    	
    	//8.Java 字符串分隔（StringTokenizer）
    	String str = "This is String , split by StringTokenizer , creat by Jason";
    	StringTokenizer st = new StringTokenizer(str);
    	System.out.println("----- 通过空格分隔 -----");
    	while (st.hasMoreElements()) {
    		System.out.println(st.nextElement());
    	}
    	
    	System.out.println("----- 通过逗号分隔 -----");
    	StringTokenizer st2 = new StringTokenizer(str,",");
    	while (st2.hasMoreElements()) {
    		System.out.println(st2.nextElement());
    	}
    	
    	//9.Java 字符串小写转大写
    	String str = "baidu taobao";
    	String strUpper = str.toUpperCase();
    	String strLower = strUpper.toLowerCase();
    	System.out.println("原始字符串" + str);
    	System.out.println("转换为大写" + strUpper);
    	System.out.println("再转换为小写" + strLower);
    	
    	//10.Java 判断两个字符串区域是否相等
    	String first_str = "Welcom to NewYork";
    	String second_str = "I work in newYork";
    	boolean match1 = first_str.regionMatches(10, second_str, 10, 7);
    	boolean match2 = second_str.regionMatches(true, 10, second_str, 10, 7);
    	System.out.println("区分大小写返回值：" + match1);
    	System.out.println("不区分大小写返回值：" + match2);
    	
    	//11.Java 字符串格式化 %a->十六进制浮点型。%e指数型，%g通用浮点类型，%%百分比类型，%n换行符，%tx日期与时间类型
    	//Java 格式化字符串 类型：https://www.cnblogs.com/Dhouse/p/7776780.html 
    	double e = Math.E;
    	System.out.format("%+10f%n", e);
    	System.out.format(Locale.CHINA, "%-10.4f%n%n", e);
    	
    	//12.Java 连接字符串
    	// 一下演示通过“+”和 StringBuffer.append() 方法来连接字符串
    	String str = "s";
    	for(int i = 0; i < 50; i++) {
    		str += i;
    	}
    	System.out.println("连接符“+”连的字符串:");
    	System.out.println(str);
    	
    	StringBuffer result = new StringBuffer();
    	for(int i = 0; i < 50; i++) {
    		result.append(i);
    	}
    	System.out.println("连接符“StringBuffer.append()”连的字符串:");
    	System.out.println(result.toString());
    	*/
    }
    //删除字符串中的某个字符
    /*substring(int beginIndex, int endIndex)==>截取从beginIndex到endIndex位置的字符串；
     * substring(int beginIndex)==>截取从beginIndex到末尾的字符串
    */
    public static String removeCharAt(String s, int location) {
    	return s.substring(0, location) + s.substring(location + 1);
    }
}