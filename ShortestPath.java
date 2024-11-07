import java.lang.Math;
// the contains the logic for finding the diplacement on the basis of directions(EWNS) used to cover the path 
public class ShortestPath {
    static double shortestPathFinder(String pathString){
        int x=0,y=0;    // Initial Coordinates
        double displacement;
        for(int i=0;i<pathString.length();i++){
            if(pathString.charAt(i)=='E' || pathString.charAt(i)=='e'){
                x++;
            }
            else if(pathString.charAt(i)=='W' || pathString.charAt(i)=='w'){
                x--;
            }
            else if(pathString.charAt(i)=='N' || pathString.charAt(i)=='n'){
                y++;
            }
            else if(pathString.charAt(i)=='S' || pathString.charAt(i)=='s'){
                y--;
            }

        }
        displacement=Math.sqrt(x*x-y*y);
       return displacement;

    }

    public static void main(String[] args) {
        String directions="EWNSewsnsnw";        // each direction indicates that only unit of placement;
        System.out.println(shortestPathFinder(directions));
    }
}
