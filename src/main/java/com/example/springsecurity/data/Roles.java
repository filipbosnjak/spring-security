package com.example.springsecurity.data;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.springsecurity.data.Permissions.*;

public enum Roles {


    //No permissions
    STUDENT(Sets.newHashSet()),

    //Permission to read and write courses and students
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE)),

    //Permission only to read courses and students
    TRAINEE(Sets.newHashSet(COURSE_READ, STUDENT_READ));

    private final Set<Permissions> permissions;

    Roles(Set<Permissions> permissions) {
        this.permissions = permissions;
    }

    public Set<Permissions> getPermissions() {
        return permissions;
    }
}
