
enum Level{
   LOW (1),
    MEDIUM (2),
    HIGH (3);
    private final int levelCode;

    private Level(int levelCode){
        this.levelCode = levelCode;
    }

    public int getLevelCode(){
        return this.levelCode;
    }

}

public class Level{
    public static void main(String[] args){
        Level level = Level.HIGH;
        System.out.println(level.getLevelCode());
    }
}
