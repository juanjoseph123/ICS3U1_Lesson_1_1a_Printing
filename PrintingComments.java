import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

class PrintingComments extends ConsoleProgram {
  /**
  * A printing and comments example
  * @author:
  */
  
  
  public void run() {

    // Say hello
    System.out.println("hi" );
    System.out.println("there");
    // Say hello on the same line
    System.out.print("Hi");
    System.out.print( " There!");
    
    // multiline comment
    /*
     * This is a 
     * multiline
     * comment
     */
    
    // Draw a box
   System.out.println("*************");
   System.out.println("*           *");
   System.out.println("*           *");
   System.out.println("*           *");
  System.out.println("*************");
      
   // Draw another box
   /*
   System.out.println("*************");
   System.out.println("*           *");
   System.out.println("*           *");
   System.out.println("*           *");
   System.out.println("*************");
   */
  }
}
