package notepad;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.Document;

public class FileChooser {
	
	String myFile = "";
	JFileChooser chooser = new JFileChooser("C:\\Users\\Dan Good\\workspace\\WriterToolKit");
	
	
	FileChooser(){
		
	}
	

	
	
	public void resetName(){
		myFile="";
	}
	
	
	public void open(){
		
		Document doc = NotePad.editorPane.getDocument();
		
		FileReader inputStream = null;
		try{
			
			
			 FileNameExtensionFilter filter = new FileNameExtensionFilter(
				        "Text Documnet","txt");
				    chooser.setFileFilter(filter);
			 
			 int returnVal = chooser.showOpenDialog(null);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			       myFile= chooser.getSelectedFile().getPath();
			    }
			

			inputStream = new FileReader(myFile);
			NotePad.editorPane.read(inputStream, doc);
			
			inputStream.close();
		}
		catch(IOException exception){
			
			System.out.println("Io exception");
			
		}
		
	}
	
	public void save(){

		
		FileWriter outputStream = null;
		try{
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "Text Documnet","txt");
			    chooser.setFileFilter(filter);
			if(myFile==""){    
					int returnVal = chooser.showSaveDialog(null);
					  if(returnVal == JFileChooser.APPROVE_OPTION) {
					       myFile=chooser.getSelectedFile().getPath();
					       myFile = myFile + ".txt";
					    }
			}
			outputStream = new FileWriter(myFile);
			NotePad.editorPane.write(outputStream);
			
			outputStream.close();
		}
		catch(IOException exception){
			
			System.out.println("Io exception");
			
		}
		
	}
	
	public void saveAs(){
		

		
		FileWriter outputStream = null;
		try{
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "Text Documnet","txt");
			    chooser.setFileFilter(filter);
			int returnVal = chooser.showSaveDialog(null);
			  if(returnVal == JFileChooser.APPROVE_OPTION) {
			       myFile=chooser.getSelectedFile().getPath();
			       myFile = myFile + ".txt";
			    }
			outputStream = new FileWriter(myFile);
			NotePad.editorPane.write(outputStream);
			
			outputStream.close();
		}
		catch(IOException exception){
			
			System.out.println("Io exception");
			
		}
		
	}
	
	

}
