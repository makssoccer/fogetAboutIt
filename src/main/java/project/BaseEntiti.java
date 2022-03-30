package project;


public class BaseEntiti {
    public Integer id;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntiti that = (BaseEntiti) o;
        return id != null && id.equals(that.id);
    }
}
