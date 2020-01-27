import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static Double calAveraged(
            List<Menu> ms,
            String menuKind
    ) {
        double result = 0.0;

        for (int i = 0; i < ms.size(); i++) {
            if (ms.get(i).getMenuKind().equals(menuKind)) {
                result = result + ms.get(i).getRecipesLists().get(i).getCal();
            }
        }
        return result;
    }
}
