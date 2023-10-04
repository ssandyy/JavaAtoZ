public class InstanceAndStaticBlock {
    static {
            System.out.println("Static block");
        }

    {
        System.out.println("instance block");
    }
        InstanceAndStaticBlock(){
            System.out.println("Hello");
        }
        public static void main(String[] args) {
            InstanceAndStaticBlock Obj = new InstanceAndStaticBlock();
        }
    }
