package com.recruiters

import grails.transaction.Transactional

@Transactional
class RecruiterService {

    def findRecruiterDeals(User user) {
        def recruiter = Recruiter.findByUser(user)
        Deal.findByRecruiter(recruiter)
    }
}
