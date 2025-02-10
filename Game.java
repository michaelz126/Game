public class Game
{
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;


    public Game()
    {
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();
    }

    public boolean isBonus()
    {
        return bonus;
    }
    
    public void makeBonus()
    {
        bonus = true;
    }

    public void play()
    {}
    public int getScore()
    {}
    public int playManyTimes(int num)
    {}

}