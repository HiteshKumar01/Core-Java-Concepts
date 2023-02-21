package nonstaticmembers;

public class CreateObjectReference {
    int x;
    CreateObjectReference(){

    }
    public static void main(String[] args){
        CreateObjectReference cbr=new CreateObjectReference();
        System.out.println(cbr.x);
    }
}
