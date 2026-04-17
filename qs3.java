package workshop5;



interface LivingBeing {
    void specialFeature();
}

class Fish implements LivingBeing {
    public void specialFeature() {
        System.out.println("Fish: I can breathe underwater using gills.");
    }
}

class Bird implements LivingBeing {
    public void specialFeature() {
        System.out.println("Bird: I have wings to fly in the sky.");
    }
}

public class qs3 {
    public static void main(String[] args) {
        Fish nemo = new Fish();
        Bird zazu = new Bird();
        
        nemo.specialFeature();
        zazu.specialFeature();
    }
}
