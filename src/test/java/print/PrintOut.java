package print;

import org.testng.annotations.Test;
import reader.ReadFromJson;

import java.io.FileNotFoundException;

public class PrintOut {


    ReadFromJson readFromJson ;


    @Test

    public void t1() throws FileNotFoundException {

        readFromJson = new ReadFromJson();
        System.out.println(readFromJson.readJsonFile().URL);



    }

    @Test

    public void t2() throws FileNotFoundException {

        readFromJson =  new ReadFromJson();
        System.out.println(readFromJson.readJsonFile().Login.ValidCredentials.Username);
        System.out.println(readFromJson.readJsonFile().Login.ValidCredentials.Password);

    }

    @Test

    public void t3() throws FileNotFoundException {

        readFromJson =  new ReadFromJson();

        System.out.println(readFromJson.readJsonFile().Login.InvalidCredentials.InvalidUsername.Username);
        System.out.println(readFromJson.readJsonFile().Login.InvalidCredentials.InvalidUsername.Password);
    }

    @Test

    public void t4() throws FileNotFoundException {

        readFromJson = new ReadFromJson();

        System.out.println(readFromJson.readJsonFile().Login.InvalidCredentials.InvalidPassword.Username);
        System.out.println(readFromJson.readJsonFile().Login.InvalidCredentials.InvalidPassword.Password);
    }

}
