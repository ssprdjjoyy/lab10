public class testcatanddog {
    public static void main(String[] args) {
        cat cat = new cat();
        dog doge = new dog();
        doge.run(300);
        cat.run(300);
        doge.swim(5);
        cat.swim(5);
        doge.jump(1.5f);
        cat.jump(1.5f);
    }
}