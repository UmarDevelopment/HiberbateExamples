package me.umar.dbclasses;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "auto")
public class Auto {

    @Id
    private Integer id;
    private String model;
    @OneToOne
    @JoinColumn(name = "color")
    private Color color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Auto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public Auto(Integer id, String model, Integer user_id) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
