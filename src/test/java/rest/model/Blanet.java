
package rest.model;

import java.util.List;
import javax.annotation.Generated;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Blanet {

    @SerializedName("climate")
    private String mClimate;
    @SerializedName("created")
    private String mCreated;
    @SerializedName("diameter")
    private String mDiameter;
    @SerializedName("edited")
    private String mEdited;
    @SerializedName("films")
    private List<String> mFilms;
    @SerializedName("gravity")
    private String mGravity;
    @SerializedName("name")
    private String mName;
    @SerializedName("orbital_period")
    private String mOrbitalPeriod;
    @SerializedName("population")
    private String mPopulation;
    @SerializedName("residents")
    private List<String> mResidents;
    @SerializedName("rotation_period")
    private String mRotationPeriod;
    @SerializedName("surface_water")
    private String mSurfaceWater;
    @SerializedName("terrain")
    private String mTerrain;
    @SerializedName("url")
    private String mUrl;

    public String getClimate() {
        return mClimate;
    }

    public void setClimate(String climate) {
        mClimate = climate;
    }

    public String getCreated() {
        return mCreated;
    }

    public void setCreated(String created) {
        mCreated = created;
    }

    public String getDiameter() {
        return mDiameter;
    }

    public void setDiameter(String diameter) {
        mDiameter = diameter;
    }

    public String getEdited() {
        return mEdited;
    }

    public void setEdited(String edited) {
        mEdited = edited;
    }

    public List<String> getFilms() {
        return mFilms;
    }

    public void setFilms(List<String> films) {
        mFilms = films;
    }

    public String getGravity() {
        return mGravity;
    }

    public void setGravity(String gravity) {
        mGravity = gravity;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getOrbitalPeriod() {
        return mOrbitalPeriod;
    }

    public void setOrbitalPeriod(String orbitalPeriod) {
        mOrbitalPeriod = orbitalPeriod;
    }

    public String getPopulation() {
        return mPopulation;
    }

    public void setPopulation(String population) {
        mPopulation = population;
    }

    public List<String> getResidents() {
        return mResidents;
    }

    public void setResidents(List<String> residents) {
        mResidents = residents;
    }

    public String getRotationPeriod() {
        return mRotationPeriod;
    }

    public void setRotationPeriod(String rotationPeriod) {
        mRotationPeriod = rotationPeriod;
    }

    public String getSurfaceWater() {
        return mSurfaceWater;
    }

    public void setSurfaceWater(String surfaceWater) {
        mSurfaceWater = surfaceWater;
    }

    public String getTerrain() {
        return mTerrain;
    }

    public void setTerrain(String terrain) {
        mTerrain = terrain;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }
}
