public class Main
{
    public static void main(String[] args) {

        //Test Case 1
        Game one = new Game();
        one.getLevel(1).reachGoal();
        one.getLevel(1).setPoints(200);
        one.getLevel(2).reachGoal();
        one.getLevel(2).setPoints(100);
        one.getLevel(3).reachGoal();
        one.getLevel(3).setPoints(500);
        one.makeBonus();
        System.out.println(one.getScore());

        //Test Case 2
        Game two = new Game();
        two.getLevel(1).reachGoal();
        two.getLevel(1).setPoints(200);
        two.getLevel(2).reachGoal();
        two.getLevel(2).setPoints(100);
        two.getLevel(3).setPoints(500);
        System.out.println(two.getScore());
    }
}
