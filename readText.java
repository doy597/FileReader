import java.io.*;	//�@java��io�@�\��ǂݍ���
import java.util.*;	//�@java��util�@�\��ǂݍ���

class readText{
	BufferedReader br;
	FileReader fr;
	File f;
	String moji;

	readText(){
		try{
			f = new File("meibo.txt");
			fr = new FileReader(f);
			br = new BufferedReader(fr);
		System.out.println("-----------------------");
		System.out.println("name  area  age");
		System.out.println("-----------------------");

		while( (moji=br.readLine())!=null){
			System.out.println(moji);
		}
		br.close();
		}catch(FileNotFoundException er){
			System.out.println(er);
		}catch(IOException er){
			System.out.println(er);
		}
	}
	public static void main(String args[]){
		readText r;
		r = new readText();
	}
}