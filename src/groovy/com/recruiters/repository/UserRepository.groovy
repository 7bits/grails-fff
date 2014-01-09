package com.recruiters.repository

import com.recruiters.User
import groovy.sql.Sql

class UserRepository {

    User findUserByUsername(username){
        def sqlQuery = """
            select u.*
            from
                user u
            where
                u.username = ?
            limit 1
        """;
        def db = new Sql(sqlQuery);
        def rows = db.rows(sqlQuery, [username]);
        def u = new User()
        rows?.each() {
            u.username = it.username
        }
        db.close()
        u
    }
}
