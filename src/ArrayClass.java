import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayClass {
	public static void main (String args[]) throws Exception {
		/*
		 //1.Java 数组排升序及元素查找
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(array);
		printArray("数组排序结果为",array);
		int index = Arrays.binarySearch(array, 2);
		System.out.println("元素 2 在第 " + index + "个位置");
		 
		//2.Java 数组添加元素
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4, 2};
		Arrays.sort(array);
		printArray("数组排序结果为",array);
		int index = Arrays.binarySearch(array, 1);
		System.out.println("元素 2 所在的位置 （负数不存在）："+index);
		int newIndex = -index - 1;
		array = insertElement(array, 1, newIndex);
		printArray("数组添加元素 1", array);
		
		//3.Java 数组长度
		String[][] data = new String[2][5];
		System.out.println("第一维数组长度"+data.length);
		System.out.println("第二维数组长度"+data[0].length);
		
		//4.Java 数组反转
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		System.out.println("反转前排序："+arrayList);
		Collections.reverse(arrayList);
		System.out.println("反转后排序"+arrayList);
		
		//5.Java 数组获取最大和最小值
		Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};//基本类型不可直接作为泛型参数传入，需要转为包装类型
		int min = Collections.min(Arrays.asList(numbers));
		int max = Collections.max(Arrays.asList(numbers));
		System.out.println("最小值："+min);
		System.out.println("最大值："+max);
		
		//6.Java 数组填充
		int array[] = new int[6];
		Arrays.fill(array, 100);
		printArray("", array);
		System.out.println("");
		Arrays.fill(array, 3, 6, 50);
		printArray("", array);
		
		//7.Java 数组扩容
		String[] names = new String[] {"A","B","C"};
		String[] extended = new String[5];
		extended[3] = "D";
		extended[4] = "E";
		System.arraycopy(names, 0, extended, 0, names.length);
		for (int i = 0; i < extended.length; i ++) {
			System.out.println(extended[i]);
		}
		
		//8.Java 数组查重
		int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2, 9, 2, 2, 2, 5, 5, 6};
		findDuplicateInArray(my_array);
		
		//9.Java 数组删除元素
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		System.out.println("删除元素前"+arrayList);
		arrayList.remove(3);
		arrayList.remove("E");
		System.out.println("删除元素后"+arrayList);
		
		//10.Java 数组差集,交集
		ArrayList objArray = new ArrayList(Arrays.asList("common1","common2","common3","common4"));
		ArrayList objArray2 = new ArrayList(Arrays.asList("common1","common2","common3","common4","common5","common6"));
		System.out.println("objArray " + objArray);
		System.out.println("objArray2" + objArray2);
		objArray2.removeAll(objArray);
		System.out.println("objArray 与 objArray2 的差集是 ："+objArray2);
		objArray2.retainAll(objArray);
		System.out.println("objArray 与 objArray2 的交集是 ："+objArray);
		System.out.println(objArray.indexOf("common4"));
		
		//11.Java 判断数组是否相等
		int[] ary = {1,2,3,4,5,6};
		int[] ary2 = {1,2,3,4,5,6};
		int[] ary3 = {1,2,3,4};
		System.out.println("ary 与 ary2 是否相等：" + Arrays.equals(ary, ary2));
		System.out.println("ary2 与 ary3 是否相等：" + Arrays.equals(ary2, ary3));
		
		//12.Java 数组并集
		String[] arg1 = {"1", "2", "3"};
		String[] arg2 = {"4", "5", "6"};
		String[] result_union = union(arg1, arg2);
		System.out.println("并集的结果如下：");
		for (String str : result_union) {
			System.out.println(str);
		}
		*/
	}
	private static String[] union(String[] arg1, String[] arg2) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		for(String str : arg1) {
			set.add(str);
		}
		for(String str : arg2) {
			set.add(str);
		}
		String[] result = {};
		return set.toArray(result);
	}
	//数组查重
	public static void findDuplicateInArray(int[] a) {
		int count = 0;
		for (int j = 0; j < a.length; j++) {
			for(int k =j+1; k < a.length; k++) {
				if (a[j]==a[k]) {
					count++;
				}
			}
			if (count == 1) {
				String fs;
				fs = String.format("重复元素" + "%d", a[j]);
				System.out.println(fs);
			}
			count = 0;
		}
	}
	
	//打印 int[] 数组元素
	private static void printArray(String message, int array[]) {
		System.out.println(message + ": [length:" + array.length + "]");
		for (int i = 0 ; i < array.length ; i ++) {
			if (i != 0) {
				System.out.print(",");
			}
			System.out.print(array[i]);
		}
		System.out.println("");
	}
	//向 int[] 数组的指定位置添加元素
	private static int[] insertElement(int original[], int element, int index) {
		int length = original.length;
		int destination[] = new int[length + 1];
		System.arraycopy(original, 0, destination, 0, index);
		destination[index] = element;
		System.arraycopy(original, index, destination, index + 1, length - index);
		return destination;
	}
}
