import java.io.FileReader;		//1文字ずつ読み込み
import java.io.BufferedReader;	//行単位で読み込み
import java.io.IOException;
import java.io.FileNotFoundException;	

class Yomikomi{
	FileReader fr;	//オブジェクト作成
	BufferedReader br;

	Yomikomi(){	//コンストラクタ：初期設定
		try{
		fr = new FileReader("test.txt");	//インスタンス
		br = new BufferedReader(fr);		//インスタンス

		String moji = "";
		while( (moji = br.readLine() ) != null){
			System.out.println(moji);
		}
		}catch(FileNotFoundException er){
			System.out.println("ファイルがない");
			System.exit(-1);
		}catch(IOException er){
			System.err.print("読み込みエラー");
		}
	}
	public static void main(String args[]){
		new Yomikomi();
	}
}