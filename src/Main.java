import com.enigma.model.Mobil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in) );
        System.out.print("Input coordinate x,y : ");
        String coordinate= reader.readLine();
        String[] posts = coordinate.split(",");

        Mobil rush = new Mobil(Integer.parseInt(posts[0]), Integer.parseInt(posts[1]) );

        System.out.print("Input Fuel : ");
        String fuel= reader.readLine();
        rush.fillFuel(Integer.parseInt(fuel));

        System.out.print("Input Commends : ");
        String commends = reader.readLine();
        rush.setCommends(commends);
        rush.run();
        System.out.println(rush.print());

    }
}