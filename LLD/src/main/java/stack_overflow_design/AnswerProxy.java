package stack_overflow_design;

public class AnswerProxy extends AbstractIPost {

    IPost iPost;

    public AnswerProxy(IPost iPost) {
        this.iPost = iPost;
    }

    @Override
    public void add(IPost p) {
        if (p instanceof Comment) {
            iPost.add(p);
        }
    }
}
