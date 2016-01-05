package com.twistedevelepment.lanesapp.backend;

import com.google.appengine.api.users.User;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * UserAccount entity.
 */
@Entity
public class ChatUsers {

    /**
     * Unique identifier of this Entity in the database.
     */
    @Id
    private Long Id;

    public String getchatUser() {
        return chatUser;
    }

    public void setchatUser(final String chatUser) {
        this.chatUser = chatUser;
    }

    @Index
    private String chatUser;

    /**
     * The user first name.
     */
    private String firstName;

    /**
     * The user last name.
     */
    private String lastName;

    /**
     * Returns a boolean indicating if the user is an admin or not.
     * @param user to check.
     * @return the user authorization level.
     */
    public static boolean isAdmin(final User user) {
        return false;
    }

    /**
     * Returns the user first name.
     * @return the user first name
     */
    public final String getFirstName() {
        return firstName;
    }

    /**
     * Sets the user first name.
     * @param pFirstName the first name to set for this user.
     */
    public final void setFirstName(final String pFirstName) {
        this.firstName = pFirstName;
    }

    /**
     * Returns the user last name.
     * @return the user last name.
     */
    public final String getName() {
        return lastName;
    }

    /**
     * Sets the user last name.
     * @param pLastName the user last name to set.
     */
    public final void setName(final String pLastName) {
        this.lastName = pLastName;
    }
}

