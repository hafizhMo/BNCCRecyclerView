package com.hafizhmo.bnccrecyclerview;

public class MemberModel {
    private final String name;
    private final int photo;

    public MemberModel(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }
}
