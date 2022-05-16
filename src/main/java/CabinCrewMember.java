public class CabinCrewMember {

    private String name;
    private String rank;

    public CabinCrewMember(String name, RankType rank){
        this.name = name;
        this.rank = rank.getRank();
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }
}
