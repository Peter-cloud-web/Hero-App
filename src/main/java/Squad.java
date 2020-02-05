import java.util.ArrayList;
import java.util.List;


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

//    public void setHeroMembers(){
//        if(squadList.size() >= 4){
//            isSquadFull = true;
//            System.out.println("The squad is full");
//        }else{
//            squadList.add(this);
//        }
//
//    }
//    public void addHeroToSquad(){
//        if(isRegisteredHero){
////            squadList.add();
//        }
//        else{
//            System.out.println("Not registered");
//        }
//    public boolean getSquadFull() {
//        return isSquadFull;
//    }
//    public List<Squad> getHeromembers(){
//        return squadList;
//    }
    public int getid() {return id;}
    public static Squad findById(int id) {
        return squadList.get(id - 1);

    }
}




