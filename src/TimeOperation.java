import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeOperation {
	public static void main(String args[]) throws Exception {
		/*
		//Java 格式化时间
		Date date = new Date();
		String strDateFormat = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		System.out.println(sdf.format(date));
		
		//Java 获取当前时间
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记  
		Date date = new Date();
		System.out.println(sdf.format(date));
		
		//Java 获取年份、月份等
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		int dom = cal.get(Calendar.DAY_OF_MONTH);
		int doy = cal.get(Calendar.DAY_OF_YEAR);
		
		System.out.println("当前日期"+cal.getTime());
		System.out.println("日期："+day);
		System.out.println("月份："+month);
		System.out.println("年份："+year);
		System.out.println("一周的第几天："+dow);
		System.out.println("一月的第几天："+dom);
		System.out.println("一年的第几天"+doy);
		
		//Java 时间戳转时间
		Long timeStamp = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
		String sdd = sdf.format(new Date(timeStamp));
		System.out.println("格式化结果："+sdd);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒");
		String sd2 = sdf2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
		String sdd2 = sdf2.format(new Date(timeStamp));
		System.out.println("格式化结果："+sdd2);
		*/
	}
}
