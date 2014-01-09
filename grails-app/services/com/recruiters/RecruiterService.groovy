package com.recruiters

import grails.transaction.Transactional
import groovy.sql.Sql

@Transactional
class RecruiterService {

    def dataSource

    def findRecruiterByUserId(userId) {
        def sqlQuery = """
            select u.username as username
            from
                user u inner join recruiter r on r.user_id = u.id
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

    def findRecruiterByUser(User user) {
        Recruiter.findByUser(user)
    }


    def findRecruiterDeals(Recruiter recruiter) {
        Deal.findByRecruiter(recruiter)
    }
}
