package boot.entity;

/**
 * Created by dzeihs on 31.10.16.
 */

import javax.persistence.*;

@Entity
public class FirstEntity {

    @Id @GeneratedValue
    private Long id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "[id=" + id + ", name=" + name + "]";
    }
}
