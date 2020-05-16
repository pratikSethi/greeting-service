package example.topic;

public class Topic {

    private int courseId;
    private String courseName;
    private String description;

    public Topic(){

    }

    public Topic(int courseId, String courseName, String description) {
        super();
        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("courseId: %d, courseName: %s, description: %s",
                courseId,
                courseName,
                description
        );
    }
}
