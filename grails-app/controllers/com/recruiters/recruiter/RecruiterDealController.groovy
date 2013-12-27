package com.recruiters.recruiter

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_RECRUITER'])
class RecruiterDealController {

    def index() {

    }

    def show() {

    }
}
