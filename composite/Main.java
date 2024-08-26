package composite;

public class Main {
    public static void main(String[] args) {
        Group group_1 = new Group();
        group_1.add(new Shape());
        group_1.add(new Shape());
        group_1.add(new Shape());

        Group group_2 = new Group();
        group_2.add(new Shape());
        group_2.add(new Shape());

        Group group_3 = new Group();
        group_3.add(group_1);
        group_3.add(group_2);

        group_3.render();

        group_2.move();
    }
}
