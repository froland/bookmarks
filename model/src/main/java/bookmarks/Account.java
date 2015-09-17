package bookmarks;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Account {
    @OneToMany(mappedBy = "account")
    private Set<Bookmark> bookmarks = new HashSet<>();
    @Id
    @GeneratedValue
    private Long id;
    public String username;
    @JsonIgnore
    public String password;

    public Account(String name, String password) {
        this.username = name;
        this.password = password;
    }

    public Set<Bookmark> getBookmarks() {
        return bookmarks;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    Account() {
        // JPA only
    }
}
