package pack3;

class A {
    private int data =40;
    private void messenge(){
        System.out.println("Hello Java");
    }

    public static class Simple {
        public  static void main(String args[]){
            A obj =new A();
            System.out.println(obj.data);
            obj.messenge();

        }
    }
}
