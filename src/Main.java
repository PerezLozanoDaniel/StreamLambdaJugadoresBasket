import java.text.ParseException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ParseException {

        Equipo equipo=new Equipo();
        equipo.altaDeJugadores();


        equipo.mostrarTodoEquipo();

        equipo.FiltroPivotEscolta();

        equipo.FiltroBasesMas190();

        equipo.FiltroPesoMayor100kg();
    }
}