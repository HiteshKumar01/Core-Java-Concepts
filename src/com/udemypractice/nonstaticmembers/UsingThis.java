package nonstaticmembers;

public class UsingThis {
    int a=10;
    UsingThis(){
        System.out.println(this);
        System.out.println(this.a);
    }
    public static void main(String[] args){
        new UsingThis();
        new UsingThis();
    }
}
