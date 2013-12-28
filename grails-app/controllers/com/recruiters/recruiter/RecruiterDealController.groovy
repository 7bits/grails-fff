package com.recruiters.recruiter

import com.recruiters.RecruiterService
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_RECRUITER'])
class RecruiterDealController {

    RecruiterService recruiterService

    def index() {
        [deals: recruiterService.findRecruiterDeals()]
    }

    def show() {

    }
}
