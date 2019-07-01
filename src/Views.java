
public class Views {
	public static void main(String[] args) throws Exception {
		/*
		//1.Java 图形打印 菱形
		print(5);
		*/
		//2.九九乘法表
		for (int i = 1; i < 10; i ++) {
			for (int j = 1; j <= i; j ++) {
				System.out.printf("%dx%d=%d",j,i,i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
		//XXX:打印图形，就菱形还有点意思，其它的都很无聊
	}
	
	public static void print(int num) {
		if (num%2 == 0) 
			num++;
		for (int i = 1; i <= num*2-1; i ++) {
			int spaceEnd = i>num? i-num : num-i;
			for (int j = 1; j <= spaceEnd; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*num-1-spaceEnd*2; k ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

