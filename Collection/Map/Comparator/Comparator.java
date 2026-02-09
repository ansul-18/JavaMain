package Collection.Map.Comparator;

import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

class Employee {
    int id;
    String name;
    int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
}
class MyCamparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id-o2.id;
    }
}
class ComparatorDemo<E> {
    public static void main(String[] args) {
        Map<Employee,String> map = new TreeMap<>(new MyCamparator());

        System.out.println(map.put(new Employee(3,"Ans",10000),"Ans"));
        System.out.println(map.put(new Employee(5,"raju",235230),"rAJY"));
        System.out.println(map.put(new Employee(1,"kaju",12345),"Dfafev"));
        System.out.println(map.put(new Employee(12,"hero",72360),"Dafev"));

        System.out.println(map);

    }
}
