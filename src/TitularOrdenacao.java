import java.util.Comparator;
import java.util.Objects;

public class TitularOrdenacao implements Comparator<Conta> {
    @Override
    public int compare(Conta o1, Conta o2) {
        return o1.getTitular().compareTo(o2.getTitular());
    }
}
