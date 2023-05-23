import java.util.function.Predicate;

public class FiltroPivots_y_Escoltas implements Predicate<JugadorBasket> {

    @Override
    public boolean test(JugadorBasket jugadorBasket) {
        return (jugadorBasket.getPosicion().equalsIgnoreCase("Pivot")||jugadorBasket.getPosicion().equalsIgnoreCase("Escolta"));
    }
}
