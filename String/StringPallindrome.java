import java.util.Scanner;
class StringPallindrome{
     
   static boolean strPallindrome(String inpString){
        // Using for loop
        char []charArray;
        int j;
        boolean flag=true;
       
        charArray=inpString.toCharArray();
        j=inpString.length()-1;
        for(int i=0; i<(inpString.length()/2);i++){
            if(charArray[i]!=charArray[j--]){
                flag=false;
            }
           
        }
        return flag;
       
    }
    static boolean strPallindrome2(String inpString){
        char []charArray;
        int i=0;
        charArray=inpString.toCharArray();
        while( i<=((inpString.length())/2) && charArray[i]==charArray[inpString.length()-i-1]
         ){
            // System.out.println(i);  
             System.out.println(charArray[i]+"==" +charArray[inpString.length()-1-i]);
            i++;
        }
       
       
        if(i==(inpString.length()/2)+1){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String [] args){
        String inpString;
         Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string to Check is pallindrome or not");
        inpString=scan.nextLine();
        if(strPallindrome2(inpString)){
            System.out.println(inpString+" Is a Pallindrome string");
        }
        else{
            System.out.println(inpString+" Is  not a Pallindrome string");
        }
        scan.close();
    }
}