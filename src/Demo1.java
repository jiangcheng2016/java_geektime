package jiangrzc.cn;

import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// 自动关机程序
		//Runtime.getRuntime().exec("shutdown -s -t 1000");
		
		//取消自动关机程序
		Runtime.getRuntime().exec("shutdown -a");
	}

}
