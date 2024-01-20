package generic;

public class MainImplementation {
    public static void main(String[] args) {
        Box b1 = new Box("Sandeep");
        Box b2 = new Box(88);
        Box b3 = new Box(78.55);
        System.out.println(b1.getGeneral()); //null    type 
        System.out.println(b2.getGeneral()); //88
        System.out.println(b3.getGeneral()); //78.55
        System.out.println(b1.getName()); //Sandeep
        System.out.println(b2.getName());//null
        System.out.println(b3.getName());//null



        // ----------------  with Genric class   -------------------

        BoxWithGenric<String> bwg1 = new BoxWithGenric<String>("ssandyy with genric class");
        System.out.println(bwg1.getName());
        BoxWithGenric<Integer> bwg2 = new BoxWithGenric<Integer>(99);
        System.out.println(bwg2.getName());
        BoxWithGenric<Double> bwg3 = new BoxWithGenric<Double>(88.55);
        System.out.println(bwg3.getName());
    
    
    }   


}
