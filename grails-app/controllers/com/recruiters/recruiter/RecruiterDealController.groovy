package com.recruiters.recruiter

import com.recruiters.RecruiterService
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_RECRUITER'])
class RecruiterDealController {

    def recruiterService
    def springSecurityService

    def index() {
        def user = springSecurityService.currentUser
        [deals: recruiterService.findRecruiterDeals(user)]
    }

    def show() {

    }
}
