class ObjectLife{
    public int area(int l, int w){
        int result = l * w;
        return result;
    }

}

public class Exercise3{
    public static void main(String args[]){
        ObjectLife ol = new ObjectLife();
        int i = ol.area(3,5);
        System.out.println("Area is= "+i);
        ol = null; //explicitly dereferences the variable
        // garbage collection happens under the covers, and classes are destroyed
    }
}