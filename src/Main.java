import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static Double calAveraged(
            List<Menu> ms,
            String menuKind
    ) {
        double result = 0.0;
        int recipeSize = 0;

        for (int i = 0; i < ms.size(); i++) {
            if (ms.get(i).getMenuKind().equals(menuKind)) {
                recipeSize = recipeSize + ms.get(i).getRecipesLists().size();
                result = result + ms.get(i).getRecipesLists().get(i).getCal();
                result = result / recipeSize;
            }
        }
        return result;
    }
}
