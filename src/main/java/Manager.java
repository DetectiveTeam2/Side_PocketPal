

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    Scanner sc = new Scanner(System.in);

    public ArrayList<MonsterDTO> monsterList = new ArrayList<>();
    {
        monsterList.add(new MonsterDTO(1, "치커리타", "풀", "일반", 70, 0));
        monsterList.add(new MonsterDTO(4, "모달피", "풀", "일반", 70, 0));
        monsterList.add(new MonsterDTO(7, "이상해싹", "풀", "일반", 70, 0));
        monsterList.add(new MonsterDTO(10, "초롱이", "풀", "일반", 70, 0));
        monsterList.add(new MonsterDTO(2, "펭키", "물", "일반", 70, 0));
        monsterList.add(new MonsterDTO(5, "물짱이", "물", "일반", 70, 0));
        monsterList.add(new MonsterDTO(8, "미룡", "물", "일반", 70, 0));
        monsterList.add(new MonsterDTO(11, "마릴링", "물", "일반", 70, 0));
        monsterList.add(new MonsterDTO(3, "불꽃숭이", "불", "일반", 70, 0));
        monsterList.add(new MonsterDTO(6, "앗차!모", "불", "일반", 70, 0));
        monsterList.add(new MonsterDTO(9, "불켜마", "불", "일반", 70, 0));
        monsterList.add(new MonsterDTO(12, "파이리", "불", "일반", 70, 0));
        monsterList.add(new MonsterDTO(13, "리자몽", "불", "희귀", 50, 0));
        monsterList.add(new MonsterDTO(14, "홍토조", "불", "희귀", 50, 0));
        monsterList.add(new MonsterDTO(15, "리프라스", "물", "희귀", 50, 0));
        monsterList.add(new MonsterDTO(16, "흰수염고래", "물", "희귀", 50, 0));
        monsterList.add(new MonsterDTO(17, "그린모스", "풀", "희귀", 50, 0));
        monsterList.add(new MonsterDTO(18, "쉐이미", "풀", "희귀", 50, 0));
        monsterList.add(new MonsterDTO(19, "아르세우스", "전설", "전설", 20, 0));
    }

    public ArrayList<MonsterDTO> sorted(ArrayList<MonsterDTO> monster, int sortStandard) {
            switch (sortStandard) {
                case 1: monster.sort(new AcsName()); break;
                case 2: monster.sort(new AcsType()); break;
                case 3: monster.sort(new AcsRank()); break;
                case 4: monster.sort(new AcsCatchHistory()); break;
            }
        return monster;
    }

    public ArrayList<MonsterDTO> getMonsterList() {
        return monsterList;
    }

    public void setMonsterList(ArrayList<MonsterDTO> monsterList) {
        this.monsterList = monsterList;
    }
    public String encounter(int thisMap) {

        String[] grassM = {"치커리타","모달피","이상해싹","초롱이","그린모스","쉐이미","아르세우스"} ;
        String[] waterM = {"펭키","물짱이","미룡","마릴링","리프라스","흰수염고래","아르세우스"} ;
        String[] fireM = {"불꽃숭이","앗차!모","불켜마","파이리","리쟈몽","홍토조","아르세우스"} ;

        int ap = (int)(Math.random() * 100) + 1;
        String eM = null;

        switch (thisMap) {
            case 1 :
                if (ap >= 1 && ap <= 15) {
                    eM = grassM[0];
                }else if(ap >= 16 && ap <= 30){
                    eM = grassM[1];
                }else if(ap >= 31 && ap <= 45){
                    eM = grassM[2];
                }else if(ap >= 46 && ap <= 60){
                    eM = grassM[3];
                }else if(ap >= 61 && ap <= 77){
                    eM = grassM[4];
                }else if (ap >= 78 && ap <= 94){
                    eM = grassM[5];
                }else {
                    eM = grassM[6];
                }
                break;

            case 2 :
                if (ap >= 1 && ap <= 15) {
                    eM = waterM[0];
                }else if(ap >= 16 && ap <= 30){
                    eM = waterM[1];
                }else if(ap >= 31 && ap <= 45){
                    eM = waterM[2];
                }else if(ap >= 46 && ap <= 60){
                    eM = waterM[3];
                }else if(ap >= 61 && ap <= 77){
                    eM = waterM[4];
                }else if(ap >= 78 && ap <= 94){
                    eM = waterM[5];
                }else {
                    eM = waterM[6];
                }
                break;

            case 3 :
                if (ap >= 1 && ap <= 15) {
                    eM = fireM[0];
                }else if(ap >= 16 && ap <= 30){
                    eM = fireM[1];
                }else if(ap >= 31 && ap <= 45){
                    eM = fireM[2];
                }else if(ap >= 46 && ap <= 60){
                    eM = fireM[3];
                }else if(ap >= 61 && ap <= 77){
                    eM = fireM[4];
                }else if(ap >= 78 && ap <= 94){
                    eM = fireM[5];
                }else {
                    eM = fireM[6];
                }
                break;

            default:
                System.out.println("숫자를 다시 입력해주세요.");
        }
        return eM;
    }
    public MonsterDTO searchMonster (String monster){
        int index = 0;
        for(MonsterDTO mon : monsterList){
            if(mon.getmName().equals(monster)){
                index = monsterList.indexOf(mon);
            }
        }
        return monsterList.get(index);
    }
    public void release(ArrayList<MonsterDTO> monlist) {

        Scanner sc = new Scanner(System.in);

        // 일을 시킬 포켓펠의 이름을 입력 받음
        System.out.print("일을 시킬 포켓펠 이름을 입력하세요 : ");
        String monsterName = sc.nextLine();

        // 입력 받은 이름의 인덱스를 검색 후 monlist 에 저장하고 반복문 빠져나옴
        int index = -1; // -> 아무것도 찾지못한 경우에 대한 관용적 표현
        for (int i = 0; i < monlist.size(); i++) {
            if (monlist.get(i).getmName().equals(monsterName)) {
                index = i;
                break;
            }
        }


        if (monlist.get(index).getmType().equals("풀")) {
            System.out.println(monlist.get(index).getmName() + " 는 집짓는 일을 도와주기로 했다!");
        } else if (monlist.get(index).getmType().equals("불")) {
            System.out.println(monlist.get(index).getmName() + " 는 요리를 도와주기로 했다!");
        } else if (monlist.get(index).getmType().equals("물")) {
            System.out.println(monlist.get(index).getmName() + " 는 농사를 하기로 했다!");
        }

        monlist.remove(index);
        // 검색된 인덱스 번호를 배열에서 제거 후 리턴
//        System.out.print("입력한 " + monlist + " 이(가) work 리스트에 추가됨");
//
//        return monlist;

        // 입력한 포켓펠의 속성을 구분하여 그에 맞는 일을 시키기 (출력하기)
    }
    public boolean catchMonster(MonsterDTO monster){

        System.out.println(monster.getmName() + "가 나타났다!");
        System.out.println("무엇을 할까 ? ");
        System.out.println("1.포획한다. 2.도망간다.");
        System.out.print(":");
        int act = sc.nextInt();

        boolean isTrue = false;


        while (true){
            switch (act) {
                case 1 :
                    int FP = (int)(Math.random() * 100) + 1;
                    if (FP >= 1 && FP <= monster.getCatchProbability()) {
                        isTrue = true;
                    } else {
                        System.out.println("잡지 못했다!");
                        isTrue = false;
                    }
                    break;

                case 2 :
                    isTrue = false;
                    System.out.println("도망쳤다!");
                    break;

                default:
                    isTrue = false;
                    System.out.println("잘못입력하셨습니다.");
                    continue;
            }
            break;
        }
        return isTrue;
    }
    public int moveMap(){
        System.out.println("맵을 선택해주세요");
        System.out.println("1. 숲");
        System.out.println("2. 바다");
        System.out.println("3. 화산");

        return sc.nextInt();
    }
}
