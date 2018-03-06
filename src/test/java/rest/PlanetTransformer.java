package rest;

import cucumber.api.DataTable;
import cucumber.api.Transformer;
import rest.model.Blanet;

/**
 * Created by yulia on 3/4/18.
 */
public class PlanetTransformer extends Transformer<Blanet> {
//    public class UserTransformer extends Transformer<User> {


        public Blanet transform(DataTable data) {
            return new Blanet();
        }

    @Override
    public Blanet transform(String s) {
        return null;
    }
}
