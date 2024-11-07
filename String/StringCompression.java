import java.util.Scanner;
//  aabbccc the code will give the output as a2b2c3
public class StringCompression {
    static String stringCompression(String inpString){
        //using string
        String newString="";
        for(int i=0;i<inpString.length();i++){
            int count=0;
            newString=newString+inpString.charAt(i);
          while(i<(inpString.length()-1)&&inpString.charAt(i)==inpString.charAt(i+1)
          ){
            count++;
            i++;
          }
          if(count>1){
            newString+=count+1;
          }
            
            
        }
        return newString;
    }
    static StringBuilder stringCompression2(StringBuilder inpString){
        // using string builder
        StringBuilder newString=new StringBuilder("");
        for(int i=0;i<inpString.length();i++){
            int count=0;
            newString.append(inpString.charAt(i));
          while(i<(inpString.length()-1)&&inpString.charAt(i)==inpString.charAt(i+1)
          ){
            count++;
            i++;
          }
          if(count>1){
            newString.append(count+1);
          }
            
            
        }
        return newString;
    }

    public static void main(String[] args) {
        //the main method have two objects one of string and other of string builder 
        String inpString;
         Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string value for compression like aabbccss");
        inpString=scan.nextLine();
        System.out.println(stringCompression(inpString));      
        StringBuilder inpString2=new StringBuilder(inpString);
        StringBuilder strBuilder;
        strBuilder=stringCompression2(inpString2);
        System.out.println(strBuilder);
        scan.close();
    }
    
}
