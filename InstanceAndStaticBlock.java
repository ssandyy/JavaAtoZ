public class InstanceAndStaticBlock {
        {
            System.out.println("instance block");
        }
        static {
            System.out.println("Static block");
        }
        InstanceAndStaticBlock(){
            System.out.println("Hello");
        }

        public static void main(String[] args) {
            InstanceAndStaticBlock Obj = new InstanceAndStaticBlock();
        }
    }

}
