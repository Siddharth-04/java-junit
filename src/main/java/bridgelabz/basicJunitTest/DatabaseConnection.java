package bridgelabz.basicJunitTest;

public class DatabaseConnection {

    String databseName;

    public DatabaseConnection(String s){
        this.databseName =  s;
    }

    public void connect(){
        System.out.println("Connecting to the database server" + " " + databseName);
    }

    public void disconnect(){
        System.out.println("Disconnecting from the database server");
        this.databseName = null;
    }
}
