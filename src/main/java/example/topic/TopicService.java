package example.topic;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

@Service
public class TopicService {

    private List<Topic> topics = new LinkedList<>(Arrays.asList(
            new Topic(1, "Data Structures", "The most important course"),
            new Topic(2, "Algorithms", "Another important course"),
            new Topic(3, "Mathematics", "The ultimate truth"),
            new Topic(4, "Science", "The study of truth")

    ));

    public List<Topic> getAllTopics(){
        return this.topics;
    }

    public Topic getTopic(int id){
        return topics
                .stream()
                .filter(topic -> topic.getCourseId() == id)
                .findFirst()
                .get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }
}
