package notepad;
import java.util.Scanner;


public class Count {

	private String text;
	
	private int wordCount =0;
	private int charSpaceCount =0;
	private int lineCount=0;
	private int charCount=0;
	
  Count(String myText){
    	
		text=myText;
		charSpaceCount=text.length();
		
		for(char c: text.toCharArray()){
			
			if(c!=' ')
				charCount++;
					
		}
		
		
		
		
		Scanner s = new Scanner(text);
		 
		 while(s.hasNextLine())
		 {
			 s.nextLine();
			 lineCount++;
		 }
      s.close();
		
      Scanner s1 = new Scanner(text);
		  
		 while(s1.hasNext())
		 {
			 s1.next();
			 wordCount++;
		 }
      s1.close();
		     
      
      
      
	}
		
		
	public String getText(){
		return text;
	}
		
	public void setText(String myText){
		text=myText;
	}
		
    
  
  
  
  
  public int getWordCount(){
		return wordCount;
	}
  
  
  public int getCharSpaceCount(){
		return charSpaceCount;
	}
 
  public int getCharCount(){
		return charCount;
	}
  
  
  public int getLineCount(){
	  return lineCount;
  }
 
}
