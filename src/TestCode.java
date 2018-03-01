//package default;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.HashMap;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class TestCode {
	
	public static String targetDir = "C:/Users/bommr1/Documents/TOP20/top20com";
	public static File dest = new File(targetDir);
	public static Path target = Paths.get(dest.toString());

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("rakesh", "pega");
		
		System.out.println(hm.get("pega"));
		
		
		/*
		// TODO Auto-generated method stub
		
		String basePath = "C:/Users/bommr1/Documents/TOP20/top20-master/2017-january";
		//File fp = new File(basePath);
		//IterateOverDir(fp);
		List<File> listOfFiles = new ArrayList<File>();
		listf(basePath, listOfFiles);
		System.out.println(listOfFiles);
		
		
		for(File fp:listOfFiles){
			String filePath = fp.toString();
		//	String relativePath = filePath.substring(filePath.indexOf("com"));
			Path sourcePath = Paths.get(filePath);
			Path targetPath = Paths.get(targetDir+File.separator+fp.getName());
			try {
				Files.copy(sourcePath, targetPath, REPLACE_EXISTING);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
	*/}

/*	private static void IterateOverDir(File fp) {
		// TODO Auto-generated method stub
		if(fp.getPath().contains("com\\"+"^[a-zA-Z0-9]*$")){
			return;
		}
		File[] allFiles = fp.listFiles();
		
		
		System.out.println(Arrays.toString(allFiles));
		
		for(File dir: allFiles){
			
			System.out.println(dir.getName());
			if(dir.isDirectory() && dir.getName().equalsIgnoreCase("com")){
				
				dir.
				
				//Path source = Paths.get(dir.toString());
				try {
					//Files.copy(source, target, COPY_ATTRIBUTES);
					DirectoryStream<Path> files = Files.newDirectoryStream(FileSystems.getDefault().getPath(dir.toString()));
					for(Path f : files) {
					    String targetPath = targetDir + System.getProperty("file.separator") + f.getFileName();
					    File target = new File(targetPath);
					    if(!target.exists())
					        Files.copy(f, Paths.get(targetDir).resolve(f.getFileName()));
					}
				
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			IterateOverDir(dir);
			return;
		}
	}*/
	
	
	
	public static void listf(String directoryName, List<File> listOfFiles) {
	    File directory = new File(directoryName);

	    // get all the files from a directory
	    File[] fList = directory.listFiles();
	    for (File file : fList) {
	        if (file.isFile()) {
	            listOfFiles.add(file);
	        } else if (file.isDirectory()) {
	            listf(file.getAbsolutePath(), listOfFiles);
	        }
	    }
	}
	
	
	
	

}
