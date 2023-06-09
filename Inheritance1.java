class Player{
  String designation;
  void does(){
    System.out.println("playing");
  }
}
class CricketPlayer extends Player{
  String designation="player";
  String  sport="cricket";
  String role="bowler";
}
class HockeyPlayer extends Player{
  String designation="player";
  String sport="hockey";
  String role="captain";
}
class Inheritance1{
  public static void main(String args[]){
    CricketPlayer p1=new CricketPlayer();
    System.out.println(p1.designation);
    System.out.println(p1.sport+" "+p1.role);
    

    HockeyPlayer p2=new HockeyPlayer();
    System.out.println(p2.designation);
    System.out.println(p2.sport+" "+p2.role);
  }
}
