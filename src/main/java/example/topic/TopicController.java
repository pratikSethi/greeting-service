package example.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return new LinkedList<>(Arrays.asList(
                new Topic(1, "Data Structures", "The most important course"),
                new Topic(2, "Algorithms", "Another important course"),
                new Topic(3, "Mathematics", "The ultimate truth")
        ));
    }
}
