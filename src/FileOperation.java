import java.io.*;
public class FileOperation {
	public static void main(String args[]) throws Exception {
		/*
		 //XXX:Java 读写操作（输入输出) 用流来表示；Java 的读写操作分为：字符流和字节流；
		  * 数据流可以是文件，内存或者网络等。
		//1.Java 文件写入;写入字符串了之后，需要关闭，否侧写入不成功
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("Runoob.txt"));
			out.write("菜鸟教程");
			out.close();
			System.out.println("文件创建成功");
		} catch (IOException e) {
			
		}
		
		//2.Java 文件内容读取
		try {
			BufferedReader in = new BufferedReader(new FileReader("Runoob.txt"));
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
			System.out.println(str);
			in.close();
		} catch (IOException e) {
			
		}
		
		//3.Java 删除文件
		try {
			File file = new File("/Users/zhejianglijuwangluoyouxiangongsi/Desktop/Test/Java/JavaLearning/Runoob.txt");
			if (file.delete()) {
				System.out.println(file.getName()+"文件已被删除");
			} else {
				System.out.println("文件删除失败");
			}
		} catch (Exception e) {
			
		}
		*/
		//4.Java 将文件内容复制到另一个文件
		BufferedWriter out1 = new BufferedWriter(new FileWriter("srcfile"));
		out1.write("string to be copied\n");
		out1.close();
		//InputStream 输入流 执行读入操作（将程序外的文件，内存或者网络等读到程序中来。即从磁盘读入到内存）
		InputStream in = new FileInputStream(new File("srcfile"));
		//OutputStream 输出流 执行写出操作 (将程序中的创建的内容写入到程序外的文件，内存或者网络中去。即从内存写出到磁盘)
		OutputStream out = new FileOutputStream(new File("destnfile"));
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
		BufferedReader in1 = new BufferedReader(new FileReader("destnfile"));
		String str;
		while ((str = in1.readLine()) != null) {
			System.out.println(str);
		}
		in1.close();
	}
}
