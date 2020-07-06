interface Cry {
    void cry();
}

class Cat implements Cry {
    public void cry() {
        System.out.println("にゃー");
    }
}

class Dog {
    public void cry() {
        System.out.println("わん");
    }
}

class CheckCry {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        if(cat instanceof Cry) {
            cat.cry();
        }
        if(dog instanceof Cry) {
            dog.cry();
        }
    }
}