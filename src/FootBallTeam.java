public class FootBallTeam {
    private Integer id;
    private String name;
    private Integer numberOfPlayers;
    private Integer score;

public FootBallTeam(Integer id, String name, Integer numberOfPlayers, Integer score) {
        this.id = id;
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(Integer numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "FootBallTeam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", score=" + score +
                "}\n";
    }
}
