 class SuperUser {
    public void login(){
        System.out.println("Login with credintials");
    }
}

class User extends SuperUser{
    public  void dataentry(){
        System.out.println("Enter cashier data");
    }
}

class SubUser extends User{
    public void reporting(){
        System.out.println("Income report genarate!");
    }
}

class Test1{
    public static void main(String[] args) {
        SubUser su=new SubUser();
        su.login();
        su.dataentry();
        su.reporting();
    }
}