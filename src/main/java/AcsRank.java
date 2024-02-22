import java.util.Comparator;

public class AcsRank implements Comparator<MonsterDTO> {

    @Override
    public int compare(MonsterDTO m1, MonsterDTO m2) {
        return m1.getRank().compareTo(m2.getRank());
    }
}