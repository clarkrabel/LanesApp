package com.twistedevelepment.lanesapp.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.twistedevelepment.lanesapp.backend.ChatUsers;

import java.util.ArrayList;

/**
 * Created by clarkrabel on 1/3/16.
 */
@Entity
public class Posts {

    @Id
    private long key;

    private String poster;
    private String post;
    private ArrayList comments;

    public final String getPost() {
        return post;
    }

    /**
     * Sets the post made by user.
     * @param post the first name to set for this user.
     */
    public final void setPost(final String post) {
        this.post = post;
    }

    public final void setPoster(final String posterName){
        this.poster = posterName;
    }

    public void setComment(String comment){
        comments.add(comment);
    }

}
