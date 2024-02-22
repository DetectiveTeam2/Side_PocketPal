import java.util.Comparator;

public class AcsType implements Comparator<MonsterDTO> {

    @Override
    public int compare(MonsterDTO m1, MonsterDTO m2) {
        return m1.getmType().compareTo(m2.getmType());
    }
}