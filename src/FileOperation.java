import java.io.*;
import java.util.Date;
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
		
		//5.Java 向文件中追加数据
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("filename"));
			out.write("aString1\n");
			out.close();
			out = new BufferedWriter(new FileWriter("filename",true));
			out.write("aString2\n");
			out.close();
			BufferedReader in = new BufferedReader(new FileReader("filename"));
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
			in.close();
			
		} catch (IOException e) {
			System.out.println("exception occoured"+e);
		}
		
		//6.Java 创建临时文件
		File temp = File.createTempFile("testrunoobtmp", ".txt");
		System.out.println("文件路径："+temp.getAbsolutePath());
		temp.deleteOnExit();
		BufferedWriter out = new BufferedWriter(new FileWriter(temp));
		out.write("aString");
		System.out.println("临时文件已创建");
		out.close();
		
		//7.Java 修改文件最后的修改日期
		File fileToChange = new File("/Users/zhejianglijuwangluoyouxiangongsi/Desktop/Test/Java/JavaLearning/destnfile");
		fileToChange.createNewFile();
		Date fileTime = new Date(fileToChange.lastModified());
		System.out.println(fileTime.toString());
		System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
		fileTime = new Date(fileToChange.lastModified());
		System.out.println(fileTime.toString());
		
		//8.Java 获取文件大小
		long size = getFileSize("/Users/zhejianglijuwangluoyouxiangongsi/Desktop/Test/Java/JavaLearning/destnfile");
		System.out.println("destnfile.txt 文件大小为:"+size);
		
		//9.Java 文件重命名
		File oldName = new File("/Users/zhejianglijuwangluoyouxiangongsi/Desktop/Test/Java/JavaLearning/destnfile");
		File newName = new File("/Users/zhejianglijuwangluoyouxiangongsi/Desktop/Test/Java/JavaLearning/destinationFile");
		if (oldName.renameTo(newName)) {
			System.out.println("重命名成功");
		} else {
			System.out.println("命名失败");
		}
		
		//10.Java 设置文件只读，文件是否存在
		File file = new File("/Users/zhejianglijuwangluoyouxiangongsi/Desktop/Test/Java/JavaLearning/destinationFile");
		if (file.exists()) {
			file.setReadOnly();
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
		} else {
			System.out.println("文件不存在");
		}
		
		//11.Java 创建文件
		try {
			File file = new File("/Users/zhejianglijuwangluoyouxiangongsi/Desktop/Test/Java/JavaLearning/targetFile");
			if (file.createNewFile()) {
				System.out.println("文件创建成功");
			} else {
				System.out.println("文件已存在");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		*/
		
		
	}
	/*
	 * 获取文件size，需要传入文件了路径
	 */
	public static long getFileSize(String fileName) {
		File file = new File(fileName);
		if (!file.exists() || !file.isFile()) {
			System.out.println("文件不存在");
			return -1;
		}
		return file.length();
	}
}
