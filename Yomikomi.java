import java.io.FileReader;		//1�������ǂݍ���
import java.io.BufferedReader;	//�s�P�ʂœǂݍ���
import java.io.IOException;
import java.io.FileNotFoundException;	

class Yomikomi{
	FileReader fr;	//�I�u�W�F�N�g�쐬
	BufferedReader br;

	Yomikomi(){	//�R���X�g���N�^�F�����ݒ�
		try{
		fr = new FileReader("test.txt");	//�C���X�^���X
		br = new BufferedReader(fr);		//�C���X�^���X

		String moji = "";
		while( (moji = br.readLine() ) != null){
			System.out.println(moji);
		}
		}catch(FileNotFoundException er){
			System.out.println("�t�@�C�����Ȃ�");
			System.exit(-1);
		}catch(IOException er){
			System.err.print("�ǂݍ��݃G���[");
		}
	}
	public static void main(String args[]){
		new Yomikomi();
	}
}