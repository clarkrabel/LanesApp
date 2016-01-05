package com.twistedevelepment.lanesapp.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiClass;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.twistedevelepment.lanesapp.backend.Posts;

import java.util.List;

import static com.twistedevelepment.lanesapp.backend.OfyService.ofy;

/**
 * Created by clarkrabel on 1/3/16.
 */

@Api(
        name = "coolStuff",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.lanesapp.twistedevelepment.com",
                ownerName = "backend.lanesapp.twistedevelepment.com",
                packagePath=""
        )
)
public class PostsEndpoint {

    @ApiMethod(httpMethod = "GET")
    public final List<Posts> getPosts(@Named("post") final String post) {
        List<Posts> posts = null;
        return posts;
    }

    @ApiMethod(name = "sendPost")
    public final Posts insertUser(@Named("post") String content,
                                  @Named("poster") String posterName) {
        Posts newPost = new Posts();
        newPost.setPost(content);
        newPost.setPoster(posterName);
        ofy().save().entity(newPost).now();

        return newPost;
    }
}
