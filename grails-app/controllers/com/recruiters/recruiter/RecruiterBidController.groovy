package com.recruiters.recruiter

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_RECRUITER'])
class RecruiterBidController {

    def index() { }
}
