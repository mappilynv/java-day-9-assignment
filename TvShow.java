public class TvShow {
    public String tvShowName;
    public int episodesNum;
    public String genre;

    public TvShow (String tvShowName){
        this.tvShowName = tvShowName;
        this.episodesNum = 1;
        this.genre = "happy";
    }

    public TvShow (int episodesNum){
        this.tvShowName = "Silicon Valley";
        this.episodesNum = episodesNum;
        this.genre = "happy";
    }


    public TvShow (String tvShowName, int episodesNum){
        this.tvShowName = tvShowName;
        this.episodesNum = episodesNum;
        this.genre = "happy";
    }

    public TvShow (String tvShowName, int episodesNum, String genre){
        this.tvShowName = tvShowName;
        this.episodesNum = episodesNum;
        this.genre = genre;
    }

    public String getTvShowName(){
        return this.tvShowName;
    }

    public int getEpisodesNum(){
        return this.episodesNum;
    }

    public String getGenre(){
        return this.genre;
    }

    @Override
    public String toString(){
        return "The name of the show is "+getTvShowName()+" with "+getEpisodesNum()+" number of episodes. The genre is "+getGenre()+".";
    }





}
