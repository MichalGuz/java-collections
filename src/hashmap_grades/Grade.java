package hashmap_grades;

public class Grade {
    int math;
    int biology;
    int physics;
    int computerScience;
    int economics;
    int english;
    int german;
    int french;
    int chemistry;
    int geography;
    int history;
    int logic;
    int art;
    int music;
    int games;

    public Grade(int math, int biology, int physics, int computerScience, int economics, int english, int german, int french, int chemistry, int geography, int history, int logic, int art, int music, int games) {
        this.math = math;
        this.biology = biology;
        this.physics = physics;
        this.computerScience= computerScience;
        this.economics = economics;
        this.english = english;
        this.german = german;
        this.french = french;
        this.chemistry = chemistry;
        this.geography = geography;
        this.history = history;
        this.logic = logic;
        this.art = art;
        this.music = music;
        this.games = games;
    }

    public String toString() {
        return "list of grades: \n math [" + math + "], biology [" + biology + "], physics [" + physics + "],\n computer science [" + computerScience + "], economics [" + economics + "], english [" + english + "], \n german [" + german + "], french [" + french + "], chemistry [" + chemistry + "], \n geography [" + geography + "], history [" + history + "], logic [" + logic
        + "], art [" + art + "], \n music [" + music + "], games [" + games + "]. \n Average of grades: ";
    }
}
