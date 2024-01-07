package me.umar.dbclasses;

import javax.persistence.*;

@Entity
@Table(name = "auto")
public class Auto {

    @Id
    private Integer id;
    private String model;
    private String color;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Auto(Integer id, String model, String color, Integer user_id) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
