package demo;

/**
 * Created by zxy on 2017/7/13.
 * 组合模式
 */
public class Demo18 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Wolf wolf = new Wolf(animal);
        wolf.breath();
        wolf.run();
        Bird bird = new Bird(animal);
        bird.breath();
        bird.fly();
    }

    static class Animal{
        private void breath(){
            System.out.println("呼吸");
        }
    }
    static class Bird {
        Animal a;
        public Bird(Animal a){
            this.a = a;
        }
        public void breath(){
            a.breath();
        }
        public void fly(){
            System.out.println("bird fly");
        }
    }
   static class Wolf{
        Animal a;
        public Wolf(Animal a){
            this.a = a;
        }
        public void breath(){
            a.breath();
        }
        public void run(){
            System.out.println("wolf run");
        }
    }
}

