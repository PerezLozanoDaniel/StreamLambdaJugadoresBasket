import java.util.function.Predicate;

public class FiltroPesoMayor100kg implements Predicate<JugadorBasket> {

    @Override
    public boolean test(JugadorBasket jugadorBasket) {
        return jugadorBasket.getKg()>100;
    }
}
