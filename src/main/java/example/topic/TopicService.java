package example.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.LinkedList;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        List<Topic> topics = new LinkedList<>();
        topicRepository.findAll()
                .forEach(topics::add);

        return topics;
    }

    public Topic getTopic(int id){
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(int id, Topic topic){
        topicRepository.save(topic);
    }

    public void deleteTopic(int id){
        topicRepository.deleteById(id);
    }
}
