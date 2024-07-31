package bank;

public class Account{
    public String name;

    public Account(String str){
        this.name = str;
    }

    public void printInfo(){
        System.out.println("Name = "+this.name);
    }

}