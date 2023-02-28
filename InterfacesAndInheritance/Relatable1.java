package InterfacesAndInheritance;

public interface Relatable1 {
    default int isLargerThan(Relatable other){
        return 2;
    };
}
