import java.lang.module.ModuleDescriptor.Builder;

public class main{

    public static void main(String[] args){
        BuilderAutos b = new BuilderAutosMadMax();
        
        Director d = new Director(b);
        
        d.theRipper();
    }
}