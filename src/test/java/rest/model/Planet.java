
package rest.model;

import java.util.List;
import javax.annotation.Generated;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Planet {

    @SerializedName("climate")
    private String Climate;
    @SerializedName("created")
    private String Created;
    @SerializedName("diameter")
    private String Diameter;
    @SerializedName("edited")
    private String Edited;
    @SerializedName("films")
    private List<String> Films;
    @SerializedName("gravity")
    private String Gravity;
    @SerializedName("name")
    private String Name;
    @SerializedName("orbital_period")
    private String OrbitalPeriod;
    @SerializedName("population")
    private String Population;
    @SerializedName("residents")
    private List<String> Residents;
    @SerializedName("rotation_period")
    private String RotationPeriod;
    @SerializedName("surface_water")
    private String SurfaceWater;
    @SerializedName("terrain")
    private String Terrain;
    @SerializedName("url")
    private String Url;

    public String getClimate() {
        return Climate;
    }

    public void setClimate(String climate) {
        Climate = climate;
    }

    public String getCreated() {
        return Created;
    }

    public void setCreated(String created) {
        Created = created;
    }

    public String getDiameter() {
        return Diameter;
    }

    public void setDiameter(String diameter) {
        Diameter = diameter;
    }

    public String getEdited() {
        return Edited;
    }

    public void setEdited(String edited) {
        Edited = edited;
    }

    public List<String> getFilms() {
        return Films;
    }

    public void setFilms(List<String> films) {
        Films = films;
    }

    public String getGravity() {
        return Gravity;
    }

    public void setGravity(String gravity) {
        Gravity = gravity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOrbitalPeriod() {
        return OrbitalPeriod;
    }

    public void setOrbitalPeriod(String orbitalPeriod) {
        OrbitalPeriod = orbitalPeriod;
    }

    public String getPopulation() {
        return Population;
    }

    public void setPopulation(String population) {
        Population = population;
    }

    public List<String> getResidents() {
        return Residents;
    }

    public void setResidents(List<String> residents) {
        Residents = residents;
    }

    public String getRotationPeriod() {
        return RotationPeriod;
    }

    public void setRotationPeriod(String rotationPeriod) {
        RotationPeriod = rotationPeriod;
    }

    public String getSurfaceWater() {
        return SurfaceWater;
    }

    public void setSurfaceWater(String surfaceWater) {
        SurfaceWater = surfaceWater;
    }

    public String getTerrain() {
        return Terrain;
    }

    public void setTerrain(String terrain) {
        Terrain = terrain;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
