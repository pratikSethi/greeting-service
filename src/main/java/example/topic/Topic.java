package example.topic;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Topic {

    @Id
    private int courseId;
    private String courseName;
    private String description;

}
