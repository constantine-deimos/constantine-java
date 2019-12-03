public class MonsterIdenity extends Monster{
    private  String monster;

    public MonsterIdenity (String name, String monsterType){
        super(name);
        this.monster = monsterType;
    }
    @Override
    //override the getMonsterName from Monster class
    public String getMonsterName() {
        //it will return the monsterType (ghost,werewolf)
        return monster;
    }
    public String getMonsterIdenity() {
        //this will return who the monster actually is
        return super.getMonsterName();
    }

}
