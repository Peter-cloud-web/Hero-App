import java.util.ArrayList;
import java.util.List;


public class Squad {
    private String squadName;
    private String cause;
    private boolean isRegisteredHero;
    private List<Hero> heroMembers = new ArrayList<>();
    private static ArrayList<Squad> squadList = new ArrayList<>();
    private int squadId;
    private boolean isSquadFull = false;


    public Squad (String squadName,String cause,Hero hero){
        this.squadName = squadName;
        this.cause = cause;
        this.isRegisteredHero = false;
        squadList.add(this);
        this.squadId=squadList.size();
    }

    public static ArrayList<Squad> getAllSquad(){
        return squadList;
    }
    public  String getSquadName(){
        return squadName;
    }
    public String getCause(){
        return cause;
    }
    public void setHeroMembers(){
        if(squadList.size() >= 4){
            isSquadFull = true;
            System.out.println("The squad is full");
        }else{
            squadList.add(this);
        }

    }
    public void addHeroToSquad(){
        if(isRegisteredHero){
//            squadList.add();
        }
        else{
            System.out.println("Not registered");
        }
    }
    public boolean getSquadFull() {
        return isSquadFull;
    }
    public List<Squad> getHeromembers(){
        return squadList;
    }
}




