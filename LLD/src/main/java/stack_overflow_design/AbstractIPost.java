package stack_overflow_design;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractIPost implements IPost {

    String desc;
    String id;
    List<IPost> posts;

    public AbstractIPost(String desc, String id) {
        this.desc = desc;
        this.id = id;
        posts = new ArrayList<>();
    }

    @Override
    public void add(IPost p) {
        posts.add(p);
    }
}
