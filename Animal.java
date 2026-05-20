public abstract class Animal {
    
    // ERROR: default no existe en clases abstractas
    default void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}
/*
modifier default not allowed here
hacerSonido is never used
Default methods are allowed only in interfaces.

La diferencia es que default existe en interfaces precisamente porque las interfaces normalmente 
no tienen métodos con cuerpo, entonces fue necesario crear una palabra especial para indicarlo.
 */