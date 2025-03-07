class InnerUsingThis {
    private String name;
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getName(){
        return this.name;
    }
}
class UsingThis {
    public static void main(String[] args) {
        InnerUsingThis obj = new InnerUsingThis();
        obj.setName("Toshiba");
        System.out.println("obj.name: " + obj.getName());
    }
 }