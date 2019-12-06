public class MonsterIdentity extends Monster{
    private  String monster;

    public MonsterIdentity(String name, String monsterType){
        super(name);
        this.monster = monsterType;
    }
    //
    @Override
    //override the getMonsterName from Monster class
    public String getMonsterName() {
        //it will return the monsterType (ghost,werewolf)
        return monster;
    }
    public String getMonsterIdentity() {
        //this will return who the monster actually is
        return super.getMonsterName();
    }

}
