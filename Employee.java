public class Employee{
    int empid;
    String empname;
    double empsal;
    void initilizeMembers(int x,String y,double z){
        empid=x;
        empname=y;
        empsal=z;
    }
    void displayEmployee(){
        System.out.println(empid+"..."+empname+"..."+empsal);
    }
}