import java.util.List;
import java.util.ArrayList;
enum Animal {Cat, Dog, Rabbit }  // Petクラスの変数kindには、Cat,Dog,Rabbitしか入らないので、不正な値が入ることがない

class Pet {
    private Animal kind;
    private String name;
    public Pet(Animal aml, String nm) {
        kind = aml;
        name = nm;
    }
    public Animal getKind() {
        return kind;
    }
    public String getName() {
        return name;
    }
}

class EnumSample {
    public static void main(String[] args) {
        List<Pet> lst = new ArrayList<Pet>(3);
        lst.add(new Pet(Animal.Dog, "Suzukikun"));
        lst.add(new Pet(Animal.Cat, "Nyaomi"));
        lst.add(new Pet(Animal.Rabbit, "Tigger"));
        for(Pet pt : lst) {
            if(pt.getKind() == Animal.Dog) {
                System.out.println("Dog name: " + pt.getName());
            }
        }
    }
}