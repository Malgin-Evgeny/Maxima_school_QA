public class Request{

    public Request(){}

    static public Request buildReuest(){
        return new Request();
    }

    public Request addCoocies(String a){
        System.out.println("Параметры " + a);
        return this;
    }
    public Request addUserOptions(String a){
        System.out.println("Параметры " + a);
        return this;
    }
    public Request addBrowserOptions(String a){
        System.out.println("Параметры " + a);
        return this;
    }
    public Request addPCOptions(String a){
        System.out.println("Параметры " + a);
        return this;
    }
    public Request addNetworkOptions(String a){
        System.out.println("Параметры " + a);
        return this;
    }
}

