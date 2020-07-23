package com.kateluckerman.discovereats.models;

import com.parse.ParseFile;
import com.parse.ParseUser;

import java.io.File;

public class User {

    public static final String KEY_NAME = "name";
    public static final String KEY_PROFILE_IMAGE = "profileImage";
    public static final String KEY_LIST = "list";
    public static final String KEY_SEARCHES = "searches";

    public ParseUser user;

    public class Search {
        public static final String CLASS_NAME = "Search";
        public static final String KEY_LOCATION = "location";
        public static final String KEY_SEARCH_INDEX = "searchIndex";
    }

    public User(ParseUser user) {
        this.user = user;
    }

    public ParseUser getUser() {
        return user;
    }

    public String getName() {
        return user.getString(KEY_NAME);
    }

    public void setName(String name) {
        user.put(KEY_NAME, name);
        user.saveInBackground();
    }

    public String getUsername() {
        return user.getUsername();
    }

    public ParseFile getProfileImage() {
        return user.getParseFile(KEY_PROFILE_IMAGE);
    }

    public void setProfileImage(File photoFile) {
        user.put(KEY_PROFILE_IMAGE, new ParseFile(photoFile));
    }

    public void addToList(Business business) {
//        user.getRelation(KEY_LIST).add(business.getParseBusiness());
    }
}
