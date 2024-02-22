public class MonsterDTO {
    int mNum;
    String mName;
    String mType;
    String rank;
    int catchProbability;
    int catchHistory;

    public MonsterDTO(int mNum, String mName, String mType, String rank, int catchProbability, int catchHistory) {
        this.mNum = mNum;
        this.mName = mName;
        this.mType = mType;
        this.catchProbability = catchProbability;
        this.catchHistory = catchHistory;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "[No." + mNum +
                "] [이름 : " + mName +
                "] [등급 : " + rank +
                "] [속성 : " + mType +
                "] [잡은 횟수 : " + catchHistory +
                "]";
    }

    public int getmNum() {
        return mNum;
    }

    public String getmName() {
        return mName;
    }

    public String getmType() {
        return mType;
    }

    public String getRank() {
        return rank;
    }

    public int getCatchProbability() {
        return catchProbability;
    }

    public int getCatchHistory() {
        return catchHistory;
    }

    public void setmNum(int mNum) {
        this.mNum = mNum;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setCatchProbability(int catchProbability) {
        this.catchProbability = catchProbability;
    }

    public void setCatchHistory(int catchHistory) {
        this.catchHistory = catchHistory;
    }
}
