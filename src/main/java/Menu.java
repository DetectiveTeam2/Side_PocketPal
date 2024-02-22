import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<MonsterDTO> catchMonster = new ArrayList<>();
    Manager gm = new Manager();
    Scanner sc = new Scanner(System.in);
    int map;

    public void mainMenu(){
        while (true){
            System.out.println("행동을 선택해주세요.");
            System.out.println("1. 모험");
            System.out.println("2. 도감");
            System.out.println("3. 일 시키기");
            int action = sc.nextInt();
            switch (action){
                case 1: adventure();break;
                case 2: cheak();break;
                case 3: work();break;
            }
        }
    }
    public void adventure(){
        if(catchMonster.size() > 6){
            System.out.println("몬스터를 더 이상 들고있을 수 없습니다. 일을 시켜주세요.");
            return;
        }
        this.map = gm.moveMap();
        String monsterName = gm.encounter(this.map);
        MonsterDTO monster = gm.searchMonster(monsterName);
        boolean result = gm.catchMonster(monster);
        if(result){
            catchMonster.add(monster);
            System.out.println(monster.getmName() + "를 포획했다!");
//            gm.getMonsterList().get(gm.getMonsterList().indexOf(monster)).setCatchHistory(gm.getMonsterList().get(gm.getMonsterList().indexOf(monster)).getCatchHistory()+1);
            /*최종 목적
            * 지금 몬스터랑 같은 몬스터를 도감에서 찾는다
            * 그리고 도감에서 그 몬스터 항목의 잡힌 횟수를 1 추가한다.
            * gm.getMonsterList().get(index)
            * index = 몬스터가 같은곳
            * index = gm.getMonsterList().indexOf(monster)
            * set(gm.getMonsterList().get
            * */

        }
    }
    public void cheak(){
        System.out.println("정렬 방식을 선택해주세요.");
        System.out.println("1. 이름순");
        System.out.println("2. 속성별");
        System.out.println("3. 등급별");
        System.out.println("4. 잡은 횟수");
        int sortStandard = sc.nextInt();
        gm.setMonsterList(gm.sorted(gm.getMonsterList(), sortStandard));
        for(MonsterDTO mon : gm.getMonsterList()){
            if(mon.getCatchHistory() == 0){
                System.out.println("알 수 없는 몬스터입니다.");
            } else {
                System.out.println(mon);
            }
        }
    }
    public void work(){
        for(MonsterDTO mon : catchMonster){
            System.out.println(mon);
        }
        gm.release(catchMonster);
    }
}
