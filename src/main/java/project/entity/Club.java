package project.entity;

import project.BaseEntiti;

public class Club extends BaseEntiti {

   private String name;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
