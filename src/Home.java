/**
 * Created by EdHall on 8/29/16.
 * Describes a home's general design.
 */
public class Home {

    private int stories;
    private int squareFootage;
    private String exteriorComposition;
    private boolean hasGarage;

    public Home(int stories, int squareFootage, String exteriorComposition, boolean hasGarage) {

        this.stories = stories;
        this.squareFootage = squareFootage;
        this.exteriorComposition = exteriorComposition;
        this.hasGarage = hasGarage;


    }

    public int getStories() {
        return stories;
    }

    public void sets(int stories) {
        this.stories = stories;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        if(squareFootage > 3000) {
            this.squareFootage = squareFootage;
        }

    }

    public String getExteriorComposition() {
        return exteriorComposition;
    }

    public void setExteriorComposition(String exteriorComposition) {
        this.exteriorComposition = exteriorComposition;
    }

    public boolean gethasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;

    }

}