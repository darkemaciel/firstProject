package secao17;

import java.io.File;
import java.util.Scanner;

public class Aula179 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o caminho da pasta: ");
		String strPath = sc.nextLine();
		
		
		File path = new File(strPath);
		
		// exibindo lista de pastas
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		
		// exibindo cada pasta
		for (File folder : folders) {
			System.out.println(folder);
		}
	
		System.out.println();
		
		// criando lista de arquivos
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		
		// exibindo cada arquivo
		for (File file : files) {
			System.out.println(file);
		}
		
		// criando uma subpasta
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Diretorio criado com sucesso: " + success);
		
		sc.close();
	}

}
