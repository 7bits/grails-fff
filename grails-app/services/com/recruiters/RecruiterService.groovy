package com.recruiters

import grails.transaction.Transactional

@Transactional
class RecruiterService {

    def findRecruiterByUser(User user) {
        Recruiter.findByUser(user)
    }


    def findRecruiterDeals(Recruiter recruiter) {
        Deal.findByRecruiter(recruiter)
    }
}
