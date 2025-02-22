package stack_overflow_design;

public class QuestionProxy implements IPost {

    IPost iPost;

    public QuestionProxy(IPost iPost) {
        this.iPost = iPost;
    }

    @Override
    public void add(IPost p) {
        if (p instanceof Answer) {
            iPost.add(p);
        }
    }
}
