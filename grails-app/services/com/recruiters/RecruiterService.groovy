package com.recruiters

import grails.transaction.Transactional

@Transactional
class RecruiterService {

    def findRecruiterDeals(Recruiter recruiter) {
        Deal.findByRecruiter(recruiter)
    }
}
