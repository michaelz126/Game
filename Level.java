public class Level
{
    private boolean goalReached;
    private int points;

    public Level getLevel(int i)
    {
        if (i == 1) return levelOne;
        if (i == 2) return levelTwo;
        if (i == 3) return levelThree;
        return null;
    }
    public boolean goalReached()
    {
        return goalReached;
    }

    public void reachGoal()
    {
        goalReached = true;
    }

    public int getPoints()
    {
        return points;
    }

    public void setPoints(int p)
    {
        points = p;
    }
}