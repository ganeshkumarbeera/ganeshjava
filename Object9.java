class Demo {
    int x;
    int y;
    void storeData(int num1, int num2){
        x=num1;
        y=num2;
    }
    void getData(){
        System.out.println(x+"...."+y);
    }
}
class Object9{
    public static void main(String[] args){
        Demo d=new Demo();
        d.storeData(10,20);
        d.getData();
    }
}