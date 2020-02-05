

import java.util.ArrayList;
public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private String squad;
    private static ArrayList<Hero> heroRegistry = new ArrayList<>();
    private int id;

    public Hero (String name,int age,String power,String weakness){
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        heroRegistry.add(this);
        this.id = heroRegistry.size();
    }



    public static ArrayList<Hero> getAllHeroes(){
        return heroRegistry;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPower() {
        return power;
    }
    public String getWeakness() {
        return weakness;
    }
    public int getId() {
        return id;
    }
    public static Hero findById(int id) {
        return heroRegistry.get(id - 1);

    }

}
