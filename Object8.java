class Demo{
    int Square (int i){
        return i*i;

    }
}
class Object8{
    public static void main(String[] args){
        Demo d=new Demo();
        int res=d.Square(10);
        System.out.println(res);
    }
}