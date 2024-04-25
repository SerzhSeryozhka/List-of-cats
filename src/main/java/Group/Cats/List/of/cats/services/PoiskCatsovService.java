package Group.Cats.List.of.cats.services;

import Group.Cats.List.of.cats.entitles.PoiskCatsov;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

@Service
public class PoiskCatsovService {
    ArrayList<PoiskCatsov> poiskCatsovs = new ArrayList<>();

    @PostConstruct
    public void fill(String fname) {
        try {
            Scanner scanner = new Scanner(new File(fname));
            while (scanner.hasNextLine()) {
                String[] strings = scanner.nextLine().split(" ");
                int id = Integer.parseInt(strings[0]);
                String name = strings[1];
                String color = strings[2];
                int age = Integer.parseInt(strings[3]);
                try {
                    PoiskCatsov psv = new PoiskCatsov(id, age, color, name);
                    poiskCatsovs.add(psv);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<PoiskCatsov> getPoiskCatsovs() {
        return poiskCatsovs;
    }

    @Override
    public String toString() {
        return "PoiskCatsovService{" +
                "poiskCatsovs=" + poiskCatsovs +
                '}';
    }
}
