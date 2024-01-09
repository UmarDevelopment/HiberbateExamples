package me.umar.dbclasses;

import javax.persistence.*;

@Entity
@Table(name = "color")
public class Color {
    @Id
    @Column(name = "colorr")
    private String color;

    @Column(name = "description")
    private String description;

    public Color() {
    }

    public Color(String color, String description) {
        this.color = color;
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
