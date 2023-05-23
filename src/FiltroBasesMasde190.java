import java.util.function.Predicate;

public class FiltroBasesMasde190 implements Predicate<JugadorBasket> {


    @Override
    public boolean test(JugadorBasket jugadorBasket) {
        return ((jugadorBasket.getAltura()>1.90F)&&jugadorBasket.getPosicion().equalsIgnoreCase("Base"));
    }
}
