package com.twistedevelepment.lanesapp.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiClass;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.twistedevelepment.lanesapp.backend.ChatUsers;

import static com.twistedevelepment.lanesapp.backend.OfyService.ofy;

import java.util.List;

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
public class UsersEndpoint {

    @ApiMethod(httpMethod = "GET")
    public final List<ChatUsers> getUsers() {
        List<ChatUsers> users = null;
        return users;
    }

//    @ApiMethod(httpMethod = "PUT")


    @ApiMethod(name = "addUser")
    public final ChatUsers insertUser(@Named("firstName") String firstName,
                                  @Named("lastName") String lastName) {
        ChatUsers user = new ChatUsers();
        user.setFirstName(firstName);
        user.setName(lastName);
        user.setchatUser(firstName + " " + lastName);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(user);
        ofy().save().entity(user).now();
        System.out.println("Should be in the datastore...");

        return user;
    }
}
