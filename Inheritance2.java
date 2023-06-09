//multi-level inheritance
class Professor{
  String designation="professor";
  String clg_name="OU";
  String does(){
    String does="teaching";
    return does;
  }
}
class PhysicsProfessor extends Professor{
  //String designation;
  //String clg_name;
  String Subject="Physics";
}
class ChemistryProfessor extends Professor{
  //String designation;
  //String clg_name;
  String Subject="Chemistry";
}
class Inheritance2{
  public static void main(String args[]){
    PhysicsProfessor p=new PhysicsProfessor();
    System.out.println("details of physics professor:");
    System.out.println("designation:"+p.designation);
    System.out.println("clg_name:"+p.clg_name);
     System.out.println(p.does()+" "+p.Subject);

    ChemistryProfessor c=new ChemistryProfessor();
    System.out.println("details of chemistry professor:");
    System.out.println("designation:"+c.designation);
    System.out.println("clg_name:"+c.clg_name);
     System.out.println(c.does()+" "+c.Subject);
    
  }
}