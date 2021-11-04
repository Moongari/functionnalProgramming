package MockData;

import Bean.Animal;
import com.google.common.io.Resources;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MockData {




    public static List<Animal> getListAnimal() throws IOException {

        InputStream inputstream = Resources.getResource("animal.json").openStream();
        String json = IOUtils.toString(inputstream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<Animal>>() {
        }.getType();
        return new Gson().fromJson(json, listType);


    }


}