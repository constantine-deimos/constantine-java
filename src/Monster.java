public class Monster {
    private String MonsterName;

    //constructor that gets what the monster is called
    public Monster (String monster){
        this.MonsterName = monster;
    }
    // returns the person's name
    public String getMonsterName(){
        return this.MonsterName;
    }

    // changes the name property to the passed value
    public void setMonsterName(String name){
        this.MonsterName = name;
    }
}
