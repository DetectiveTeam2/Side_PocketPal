import java.util.Comparator;

public class AcsCatchHistory implements Comparator<MonsterDTO> {

    @Override
    public int compare(MonsterDTO c1, MonsterDTO c2) {
        return Integer.compare(c1.getCatchHistory(), c2.getCatchHistory());
    }
}