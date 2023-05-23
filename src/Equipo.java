import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Equipo {

    SimpleDateFormat patronFecha =new SimpleDateFormat("dd/MM/yyyy");

    ArrayList<JugadorBasket> equipo=new ArrayList<>();
        public void altaDeJugadores() throws ParseException {

        JugadorBasket jugador21 = new JugadorBasket("21", "Alejandro Barines Redondo", patronFecha.parse("01/08/1993"), "Escolta", 1.98F, 86);
            equipo.add(jugador21);
        JugadorBasket jugador22 = new JugadorBasket("22", "Cory Higgins", patronFecha.parse("14/06/1989"), "Ala", 1.96F, 82);
            equipo.add(jugador22);
        JugadorBasket jugador55 = new JugadorBasket("55", "Dame Sarr", patronFecha.parse("04/06/2006"), "Ala", 1.98F, 89);
            equipo.add(jugador55);
        JugadorBasket jugador46 = new JugadorBasket("46", "James Nnaji", patronFecha.parse("14/04/2004"), "Pivot", 2.08F, 106);
            equipo.add(jugador46);
        JugadorBasket jugador6  = new JugadorBasket("6", "Jan Vesely", patronFecha.parse("24/04/1990"), "Pivot", 2.13F, 109);
            equipo.add(jugador6);
        JugadorBasket jugador54 = new JugadorBasket("54", "Kasparas Jakucionis", patronFecha.parse("29/05/2006"), "Base", 1.91F, 85);
            equipo.add(jugador54);
        JugadorBasket jugador24 = new JugadorBasket("24", "Kyle Kuric", patronFecha.parse("25/08/1989"), "Escolta", 1.93F, 88);
            equipo.add(jugador24);
        JugadorBasket jugador23 = new JugadorBasket("23", "Mike Tobey", patronFecha.parse("10/10/1994"), "Pivot", 2.13F, 118);
            equipo.add(jugador23);
        JugadorBasket jugador20 = new JugadorBasket("20", "Nicolás Laprovittola", patronFecha.parse("31/01/1990"), "Base", 1.88F, 82);
            equipo.add(jugador20);
    }

    public Equipo() throws ParseException {
    }


    public void mostrarTodoEquipo(){
        System.out.println("\nTODOS LOS JUGADORES:\n");
        equipo.stream().forEach(cadaJugador -> System.out.println(cadaJugador.mostrarDatos()));

    }
    public void FiltroPivotEscolta(){
        System.out.println("\nPIVOTS Y ESCOLTAS:\n");
        equipo.stream().filter(new FiltroPivots_y_Escoltas()).forEach(cadaJugador -> System.out.println(cadaJugador.mostrarDatos()));
    }

    public void FiltroBasesMas190(){
        System.out.println("\nBASES CON ALTURA SUPERIOR A 1`90:\n");
        equipo.stream().filter(new FiltroBasesMasde190()).forEach(cadaJugador -> System.out.println(cadaJugador.mostrarDatos()));
    }
    public void FiltroPesoMayor100kg(){
        System.out.println("\nJUGADORES CON PESO SUPERIOR A 100kg:\n");
        equipo.stream().filter(new FiltroPesoMayor100kg()).forEach(cadaJugador -> System.out.println(cadaJugador.mostrarDatos()));

    }
}
