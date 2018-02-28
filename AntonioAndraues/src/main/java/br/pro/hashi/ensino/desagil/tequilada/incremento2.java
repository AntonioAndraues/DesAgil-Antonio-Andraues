package br.pro.hashi.ensino.desagil.tequilada;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class incremento2 {

public static void main(String[] args) {} String readFile(String filename) throws IOException{
			String content = null;
			File file = new File(labirinto.txt); //for ex foo.txt
			FileReader reader = null;
			try {
	        reader = new FileReader(file);
	        char[] chars = new char[(int) file.length()];
	        reader.read(chars);
	        content = new String(chars);
	        reader.close();
			} catch (IOException e) {
				e.printStackTrace();
		} finally {
	        if(reader !=null){reader.close();}
	    }
	    return content;
	    System.out.println(content);	
}
	
	}