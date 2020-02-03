package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String inputName, String inputCategory) {
        this.name = inputName;
        this.category = inputCategory;
    }

    public String returnName() {
        return this.name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String inputCategory) {
        this.category = inputCategory;
    }
}
