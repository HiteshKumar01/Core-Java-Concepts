package nonstaticmembers;

public class CreateObjectReferenceInStaticBlock {
    static{
        CreateObjectReferenceInStaticBlock obj=new CreateObjectReferenceInStaticBlock();
        System.out.println(obj);
    }
    public static void main(String[] args){

    }
}
