package Spring.pattern;

interface Image{
    void display();
}

class RealImage implements Image{
    private String filename;
    public RealImage(String filename){
        this.filename = filename;
        loadFromDisk(filename);
    }
    @Override
    public void display(){
        System.out.println("Displaying "+filename);
    }
    private void loadFromDisk(String filename){
        System.out.println("Loading "+filename);
    }
}

class ProxyImage implements Image{
    private RealImage realImage;
    private String filename;
    public ProxyImage(String filename){
        this.filename = filename;
    }
    @Override
    public void display(){
        if(realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}


public class ProxyPatternDemo {
    public static void main(String[] args) {
            Image image = new ProxyImage("test_10mb.jpg");
        image.display();
    }
}
