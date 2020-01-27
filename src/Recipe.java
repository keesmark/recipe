public class Recipe {
    private String name;
    private double cal;

    public Recipe(String name, double cal) {
        this.name = name;
        this.cal = cal;
    }

    public static void main(String[] args) {
        Recipe recipe = new Recipe("aaa", 120);
        System.out.println(recipe.name + ":" + recipe.cal);
    }

    public String getName() {
        return name;
    }

    public double getCal() {
        return cal;
    }
}