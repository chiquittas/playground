
package rest.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Films {

    @SerializedName("characters")
    private List<String> mCharacters;
    @SerializedName("created")
    private String mCreated;
    @SerializedName("director")
    private String mDirector;
    @SerializedName("edited")
    private String mEdited;
    @SerializedName("episode_id")
    private Long mEpisodeId;
    @SerializedName("opening_crawl")
    private String mOpeningCrawl;
    @SerializedName("planets")
    private List<String> mPlanets;
    @SerializedName("producer")
    private String mProducer;
    @SerializedName("release_date")
    private String mReleaseDate;
    @SerializedName("species")
    private List<String> mSpecies;
    @SerializedName("starships")
    private List<String> mStarships;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("vehicles")
    private List<String> mVehicles;

    public List<String> getCharacters() {
        return mCharacters;
    }

    public void setCharacters(List<String> characters) {
        mCharacters = characters;
    }

    public String getCreated() {
        return mCreated;
    }

    public void setCreated(String created) {
        mCreated = created;
    }

    public String getDirector() {
        return mDirector;
    }

    public void setDirector(String director) {
        mDirector = director;
    }

    public String getEdited() {
        return mEdited;
    }

    public void setEdited(String edited) {
        mEdited = edited;
    }

    public Long getEpisodeId() {
        return mEpisodeId;
    }

    public void setEpisodeId(Long episodeId) {
        mEpisodeId = episodeId;
    }

    public String getOpeningCrawl() {
        return mOpeningCrawl;
    }

    public void setOpeningCrawl(String openingCrawl) {
        mOpeningCrawl = openingCrawl;
    }

    public List<String> getPlanets() {
        return mPlanets;
    }

    public void setPlanets(List<String> planets) {
        mPlanets = planets;
    }

    public String getProducer() {
        return mProducer;
    }

    public void setProducer(String producer) {
        mProducer = producer;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        mReleaseDate = releaseDate;
    }

    public List<String> getSpecies() {
        return mSpecies;
    }

    public void setSpecies(List<String> species) {
        mSpecies = species;
    }

    public List<String> getStarships() {
        return mStarships;
    }

    public void setStarships(List<String> starships) {
        mStarships = starships;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public List<String> getVehicles() {
        return mVehicles;
    }

    public void setVehicles(List<String> vehicles) {
        mVehicles = vehicles;
    }

}
