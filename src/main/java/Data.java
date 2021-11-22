import java.util.List;
import java.util.Optional;

public class Data {
    private static List<Integrante> integrantes;
    static {
        integrantes = List.of(
                new Integrante(1,"Mauricio Sarango", "masarango5@utpl.edu.ec"),
                new Integrante(2, "Antse Caceres", "Acaceres6utpl.edu.ec"),
                new Integrante(3, "Israel Ortiz", "iortiz8@utpl.edu.ec")
        );
    }

    public static List<Integrante> getIntegrantes(){
        return  integrantes;
    }

    public static Optional<Integrante> searchById(int id){
        return integrantes.stream().filter(integrante -> integrante.pos() == id).findFirst();
    }
}
