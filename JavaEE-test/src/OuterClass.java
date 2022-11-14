
public class OuterClass {
    private int x = 100;
    public class InnerClass{
        int y = 200;
        public int sum(){
            return x+y;
        }
    }
    public void makeInnner(){
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.sum());
    }
    public static void main(String[] args) {
        OuterClass.InnerClass innererClass = new OuterClass().new InnerClass();
        System.out.println(innererClass.sum());

    }

}
