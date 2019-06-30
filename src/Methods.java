import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.List;;

class MyMethod {
	int height;
	MyMethod() {
		System.out.println("无参数构造器");
		height = 4;
	}
	void Info(){
		System.out.println("height:"+height);
	}
	
	MyMethod(int i) {
		System.out.println("height:"+i);
		height = i;
	}
	
	void Info(String str) {
		System.out.format(str + "height:%d", height);
	}
}
class Figure {
	double dim1;
	double dim2;
	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}
	Double area() {
		System.out.println("Inside area for figure.");
		return (dim1*dim2);
	}
}

class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a,b);
	}
	Double area() {
		System.out.println("Inside area for rectangle.");
		return (dim1*dim2);
	}
}

public class Methods {
	public static void main(String[] args) throws Exception {
		/*
		 //1.Java 方法重载
		MyMethod mtd = new MyMethod();
		mtd.Info();
		MyMethod mtd2 = new MyMethod();
		mtd2.Info("康康的房子");
		 
		//2.Java 数组打印
		Integer[] integerArr = {1, 2, 3, 4, 5, 6};
		Double[] doubleArr = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
		Character[] characterArr = {'H','E','L','L','O'};
		System.out.println("输出整型数组：");
		printArray(integerArr);
		System.out.println("输出浮点型数组：");
		printArray(doubleArr);
		System.out.println("输出字符型数组：");
		printArray(characterArr);
		System.out.println("输出泛型数组");
		printAnyArray(integerArr);
		
		//Java 汉诺塔算法
		int nDisk = 6;
		doTowers(nDisk,'A','B','C');
		
		//3.Java 斐波那契数列
		for (int counter = 0; counter <= 10; counter++){
            System.out.printf("Fibonacci of %d is: %d\n",
            counter, fibonacci(counter));
        }
        
		//4.Java 阶乘
		for (int i = 0; i <= 10 ; i++) {
			System.out.printf("%d! = %d\n",i, factorial(i));
		}
		
		//5.Java 类继承&方法覆盖
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Figure figure;
		figure = f;
		System.out.println("Area is :"+figure.area());
		figure = r;
		System.out.println("Area is :"+figure.area());
		
		//6.Java instanceof关键字用法
		Object testObject = new ArrayList();
		displayObjectClass(testObject);
		*/
		//7.Java break 关键字用法
		int[] intArray = {99, 12, 22, 34, 35, 45, 67, 5678, 8990};
		int no = 5678;
		int i = 0;
		boolean found = false;
		for ( ;i < intArray.length; i ++) {
			if (intArray[i] == no) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(no + " 元素的索引位置在：" + i);
		} else {
			System.out.println(no + " 元素不再数组中");
		}
		//TODO:为什么转成了ArrayList之后，查找元素索引就报错呢
		ArrayList mIntArray = (ArrayList) Arrays.asList(intArray);
		System.out.println(no + "元素的索引位置在："+ mIntArray.indexOf(no));
	}
	
	public static void displayObjectClass(Object o) {
		if (o instanceof Vector) 
			System.out.println("对象是java.util.Vector 类的实例");
		else if (o instanceof ArrayList)
			System.out.println("对象是java.util.ArrayList 类的实例");
		else 
			System.out.println("对象是 " + o.getClass() + " 类的实例");
	}
	
	public static long factorial (long num) {
		if (num <= 1) {
			return num;
		} else {
			return num * (factorial(num-1));
		}
	}
	
	public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
	
	public static void printArray(Integer[] arr) {
		for (Integer element : arr) {
			System.out.println(element);
		}
	}
	
	public static void printArray(Double[] doubleArr) {
		for (Double element : doubleArr) {
			System.out.println(element);
		}
	}
	
	public static void printArray(Character[] characterArr) {
		for (Character emelent : characterArr) {
			System.out.println(emelent);
		}
	}
	
	public static <A> void printAnyArray(A[] inputArray) {
		for (A element : inputArray) {
			System.out.printf("%s",element);
		}
		System.out.println();
	}
	
	public static void doTowers(int topN, char from, char inter, char to) {
		if (topN == 1) {
			System.out.println("Disk 1 from " + from + " to " + to);
		} else {
			doTowers(topN - 1, from, to , inter);
			System.out.println("Disk " + topN + " from " + from + " to " + to);
			doTowers(topN-1, inter, from, to);
		}
	}
}
