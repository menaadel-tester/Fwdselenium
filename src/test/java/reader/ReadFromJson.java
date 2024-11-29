package reader;

import com.google.gson.Gson;
import data.DataModel;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFromJson {

    public DataModel readJsonFile() throws FileNotFoundException {


        FileReader filereader = new FileReader("data/testData.json"); // take the content Path from Directory

        DataModel datamodel = new Gson().fromJson(filereader, DataModel.class); // fromJson take 2 Parameters

        return datamodel;








    }
}
