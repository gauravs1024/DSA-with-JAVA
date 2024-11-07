
// lexicographically comparing and finding largest string
public class LexicoGraph_largeString {
     static String largestString(String inpArray[]){
        String largest=inpArray[0];
        for(int i=0; i<inpArray.length;i++){
            if(largest.compareToIgnoreCase(inpArray[i])<0){
                largest=inpArray[i];
            }
        }
        return largest;
     }
    public static void main(String[] args) {
        String arr[]={"aaa","aac","aab"};
        System.out.println("Lexicographically largest string is ..."+largestString(arr));
    }
}
