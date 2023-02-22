import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        City city = new City(random.nextInt(1,10),"Ош");
        City city2 = new City(random.nextInt(1,10),"Бишкек");
        City city3 = new City(random.nextInt(1,10),"Каракол");
        City city4 = new City(random.nextInt(1,10),"Озгон");
        City city5 = new City(random.nextInt(1,10),"Ноокат");

        ArrayList<City> arrayList = new ArrayList<>();
        arrayList.add(city);
        arrayList.add(city2);
        arrayList.add(city3);
        arrayList.add(city4);
        arrayList.add(city5);

        Set<City> treeSet = new TreeSet<>();
        for(City c: arrayList){
            if(c.getCode() % 2 != 0){
                treeSet.add(c);
            }
        }
        System.out.println("arrayList: " +arrayList);
        System.out.println("treeSet: "+ treeSet);
    }
}