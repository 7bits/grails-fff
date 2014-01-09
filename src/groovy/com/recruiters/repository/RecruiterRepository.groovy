package com.recruiters.repository

import com.recruiters.Deal
import com.recruiters.Recruiter
import com.recruiters.User
import groovy.sql.Sql

class RecruiterRepository {

    def dataSource

    def findRecruiterByUserId(userId) {
        def sqlQuery = """
            select u.username as username,
            from
                users u inner join recruiter r on r.user_id = u.id
            where
                u.id = ?
            limit 1
        """;
        def db = new Sql(dataSource)
        def rows = db.rows(sqlQuery, [userId]);
        db.close()
        def u = new User()
        rows?.each() {
            u.username = it.username
        }
        def r = new Recruiter(user: u)
        r
    }

    def findRecruiterDeals(recruiterId) {
        Deal.findByRecruiter(recruiter)
    }
}
