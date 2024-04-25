package Group.Cats.List.of.cats.controllers;

import Group.Cats.List.of.cats.entitles.PoiskCatsov;
import Group.Cats.List.of.cats.services.PoiskCatsovService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class PoiskController {
    @Autowired
    PoiskCatsovService poiskCatsovService;
    @GetMapping("/spisok")
    public String arrayList(Model model){
        ArrayList<PoiskCatsov> perechn = poiskCatsovService.getPoiskCatsovs();
        model.addAttribute("perechen_catsov", perechn);
        return "spisok";
    }
    @GetMapping("/clickandget")
    public String clickandget(@RequestParam (name="a") String fname, Model model){
        model.addAttribute("a", fname);
        return "clickandget";
    }

}
