public class cat extends catanddog {
    @Override
    public void run(float distance) {
        System.out.println("run: " + ((distance > 0) && (distance <= 200) ? "true" : "false"));
    }
    @Override
    public void swim(float distance) {
        System.out.println("swim: false");
    }
    @Override
    public void jump(float height) {
        System.out.println("run: " + ((height > 0) && (height <= 2) ? "true" : "false"));
    }
}