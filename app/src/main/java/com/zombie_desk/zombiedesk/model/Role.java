package com.zombie_desk.zombiedesk.model;

/**
 * Created by Lab. Desenvolvimento on 23/03/2017.
 */

public class Role {
    private int id;
    private String description;

    public Role() {
    }

    public Role(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
