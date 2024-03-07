public class Animal {
    private String eat;
    private String name;
    public String getEat(){
        return eat;
    }
    public void setEat(String eat){
        this.eat =eat ;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
class rabbit extends Animal{
    private int chan;
    public int getChan()
    {
        return chan;
    }
    public void setChan(int chan)
    {
        this.chan= chan;
    }
}
class tiger extends Animal{
    private String procreation ;
    public String getProcreation(){
        return procreation;
    }
    public void setProcreation(String procreation){
        this.procreation=procreation;
    }
}
class cow extends Animal{
    private String produce;
    public String getProduce(){
        return produce;
    }
    public void setProduce(String produce){
        this.produce=produce;
    }
}
class Entry{
    public static void main(String[] args){
        rabbit s=new rabbit();
        s.setName("rabbit");
        s.setEat("vegetable");
        s.setChan(4);
        System.out.println("Name: "+s.getName());
        System.out.println("Eat: "+s.getEat());
        System.out.println("legs: "+s.getChan());
    }
}