import java.util.List;

public class Menu {
    private String menuName;
    private String menuKind;
    private List<Recipe> recipesLists;


    public static void main(String[] args) {


    }

    public void setMenuKinds(String menuType) {
        switch (menuType) {
            case "wa":
                this.menuKind = "wa";
            case "yo":
                this.menuKind = "yo";
            case "chu":
                this.menuKind = "chu";
            default:
                System.out.println("invalid type. choose in wa or yo or chu");
        }
    }

    public List<Recipe> getRecipesLists() {
        return recipesLists;
    }

    public String getMenuKind() {
        return menuKind;
    }

    public void setRecipesLists(List<Recipe> recipesLists) {
        this.recipesLists = recipesLists;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public static Double cal(List<Recipe> recipesLists) {
        Double result = 0.0;
        for (Recipe recipesList : recipesLists
        ) {
            result = result + recipesList.getCal();
        }
        return result;
    }
}