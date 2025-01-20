public interface Animals {
    void voice();
}
    class Dog implements Animals {
        @Override
        public void voice() {
            System.out.println("Dog says: Woof!");
        }
        public void fetchBall() {
            System.out.println("Dog fetches the ball!");
        }
    }
    class Cat implements Animals {
        @Override
        public void voice() {
            System.out.println("Cat says: Meow!");
        }
        public void scratch() {
            System.out.println("Cat scratches the post!");
        }
    }
    class Main{
        public static void main(String[] args) {
            Animals dog = new Dog();
            dog.voice();
            ((Dog) dog).fetchBall();

            Animals cat = new Cat();
            cat.voice();
            ((Cat) cat).scratch();
        }
    }



