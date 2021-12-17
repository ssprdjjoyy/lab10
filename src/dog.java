public class dog extends catanddog {
    @Override
    public void run(float distance) {
        System.out.println("run: " + ((distance > 0) && (distance <= 500) ? "true" : "false"));
    }
    @Override
    public void swim(float distance) {
        System.out.println("swim: " + ((distance > 0) && (distance <= 10) ? "true" : "false"));
    }
    @Override
    public void jump(float height) {
        System.out.println("run: " + ((height > 0) && (height <= 0.5) ? "true" : "false"));
    }
}