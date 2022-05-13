import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tvShows = new ArrayList<>();
        TvShow theLastKingdom = new TvShow("The Last Kingdom");
        tvShows.add(theLastKingdom);
        TvShow southPark = new TvShow("South Park", 3000);
        tvShows.add(southPark);
        TvShow curbYoutEnthusiasm = new TvShow("Curb Your Enthusiasm", 300, "Comedy");
        tvShows.add(curbYoutEnthusiasm);



        System.out.println("Please enter your favorite TV show, number of episodes, and its genre");
        System.out.println("Entering nothing will stop the loop");
        while(true){
            System.out.println("Name of the tv show:");
            String tvShowName = scanner.nextLine();
            if(tvShowName.isEmpty()){
                break;
            }
            System.out.println("How many episodes?");
            Integer episodesNum = Integer.valueOf(scanner.nextLine());
            System.out.println("What is the genre?");
            String genre = scanner.nextLine();

            tvShows.add(new TvShow(tvShowName, episodesNum, genre));
        }

        for(TvShow tvShow: tvShows){
            System.out.println(tvShow);
        }
    }
}
