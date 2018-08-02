package pl.KamilF.miniSelfProject.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequestMapping
@RestController
public class Auto {


    @OneToMany(cascade = CascadeType.ALL)
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
