package nonstaticmembers;

public class CreateStaticReferenceDirectly {

    static CreateStaticReferenceDirectly obj;

    static{
        System.out.println(CreateStaticReferenceDirectly.obj);
        CreateStaticReferenceDirectly.obj=new CreateStaticReferenceDirectly();
    }
    public static void main(String[] args){
        System.out.println(CreateStaticReferenceDirectly.obj);
    }
}
