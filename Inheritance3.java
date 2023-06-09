//progrm using super keyword
class Employees{
  String name;
  String company_name;
  String addr;
  Employees(String n,String com_name,String ad){
    name=n;
    company_name=com_name;
    addr=ad;
  }
  public void getDetails(){
    System.out.println("Emloyee name:"+name);
     System.out.println("company name:"+company_name);
     System.out.println("address:"+addr);
  }
}
class Manager extends Employees{
  int id;
  Manager(String n,String com_name,String ad,int id1){
    super(n,com_name,ad);
    id=id1;
  }
  public void getDetails(){
     System.out.println("manager details:");
    super.getDetails();
     System.out.println("manager id:"+id);
  }
}

class Inheritance3{
  public static void main(String args[]){
    Manager m=new Manager("AAA","XYZ","Hyd",1);
    m.getDetails();
  }
}