package InterfacesAndInheritance;

public interface Relatable {
    final int a = 0;
    // this (object calling isLargerThan)
    // and other must be instances of
    // the same class returns 1, 0, -1
    // if this is greater than,
    // equal to, or less than other
    default int isLargerThan(Relatable other){
        return 1;
    };

}
