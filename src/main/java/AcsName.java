import java.util.Comparator;

public class AcsName implements Comparator<MonsterDTO> {

    @Override
    public int compare(MonsterDTO m1, MonsterDTO m2) {

        return m1.getmName().compareTo(m2.getmName());
    }
}