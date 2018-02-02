package com.bisratmk.roboresume.roboresume.Control;
import com.bisratmk.roboresume.roboresume.Container.Edu;
import com.bisratmk.roboresume.roboresume.Container.Exp;
import com.bisratmk.roboresume.roboresume.Container.Person;
import com.bisratmk.roboresume.roboresume.Container.Skill;
import com.bisratmk.roboresume.roboresume.Repositorie.EduRepository;
import com.bisratmk.roboresume.roboresume.Repositorie.ExpRepository;
import com.bisratmk.roboresume.roboresume.Repositorie.PersonRepository;
import com.bisratmk.roboresume.roboresume.Repositorie.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class CodeController {

    @Autowired
    EduRepository eduRepository;

    @Autowired
    ExpRepository expRepository;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    SkillRepository skillRepository;

    @GetMapping("/Rresume")
    public String homePage() {
        return "homepage";
    }


    @GetMapping("/addPerson")
    public String addPerson(Model model){
        if (personRepository.count() >= 1) {
            return "max";
        }

        model.addAttribute("newperson", new Person());
        return "addperson";
    }

    @PostMapping("/addPerson")
    public String postperson(@Valid @ModelAttribute("newperson") Person person, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addperson";
        }

        personRepository.save(person);
        return "showperson";
    }


    @GetMapping("/addEdu" )
    public String addEdu(Model model) {

        if (eduRepository.count() > 8) {
            return "max";
        }

        model.addAttribute("newedu", new Edu());
        return "addedu";
    }

    @PostMapping("/addEdu" )
    public String postEdu(@Valid @ModelAttribute("newedu") Edu edu, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addedu";
        }

        eduRepository.save(edu);
        return "showedu";
    }


    @GetMapping( "/addSkill")
    public String addSkill(Model model) {
        if (skillRepository.count() > 10) {
            return "max";
        }

        model.addAttribute("newskill", new Skill());
        return "addskill";
    }

    @PostMapping("/addSkill")
    public String postSkill(@Valid @ModelAttribute("newskill") Skill skill, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addskill";
        }

        skillRepository.save(skill);
        return "showskill";
    }


    @GetMapping("/addExp")
    public String addExp(Model model) {
        if (expRepository.count() > 10) {
            return "max";
        }
        model.addAttribute("newexp", new Exp());
        return "addexp";
    }

    @PostMapping("/addExp")
    public String postExperience(@Valid @ModelAttribute("newexp") Exp exp, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addexp";
        }

        expRepository.save(exp);
        return "showexp";
    }
    @GetMapping("/showAll")
    public String getAll(Model model) {
        if (personRepository.count() == 0) {
            return "/addperson";
        }

        if (eduRepository.count() == 0) {
            return "/addedu";
        }

        if (skillRepository.count() == 0) {
            return "/addskill";
        }

        if (expRepository.count() == 0) {
            return "/addexp";
        }

        Person person = new Person();
        Iterable<Person> allpersons = personRepository.findAll();
        model.addAttribute("person", allpersons);

        Iterable<Edu> alledu = eduRepository.findAll();
        ArrayList<Edu> educationArrayList = new ArrayList<>();
        educationArrayList = (ArrayList<Edu>) alledu;
        person.setEDU(educationArrayList);
        model.addAttribute("alleducation", person.getEDU());

        Iterable<Exp> allexp = expRepository.findAll();
        ArrayList<Exp> experienceArrayList = new ArrayList<>();
        experienceArrayList = (ArrayList<Exp>) allexp;
        person.setEXP(experienceArrayList);
        model.addAttribute("allexperience", person.getEXP());

        Iterable<Skill> allskills = skillRepository.findAll();
        ArrayList<Skill> skillsArrayList = new ArrayList<>();
        skillsArrayList = (ArrayList<Skill>) allskills;
        person.setSKILL(skillsArrayList);
        model.addAttribute("allskills", person.getSKILL());

        return "showall";


        }


}
