class main {
    int data;
    void display(int data){
        data=data+100;
        System.out.println(data);
    }
    void main1(){
    System.out.println();
    }
    public static void main(String [] args){
        main m = new main();
        m.display(100);
        m.main1();
    }
}
