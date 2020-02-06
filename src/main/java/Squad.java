import java.util.ArrayList;
public class Squad {
    private String name;
    private String cause;
    private static ArrayList<Squad> squadList = new ArrayList<>();
    private int id;
    private boolean isSquadFull = false;


    public Squad (String name,String cause){
        this.name = name;
        this.cause = cause;
        squadList.add(this);
        this.id=squadList.size();
    }

    public static ArrayList<Squad> getAllSquad(){
        return squadList;
    }
    public  String getSquadName(){
        return name;
    }
    public String getCause(){
        return cause;
    }
    public int getid() {return id;}
    public static Squad findById(int id) {
        return squadList.get(id - 1);

    }
}




