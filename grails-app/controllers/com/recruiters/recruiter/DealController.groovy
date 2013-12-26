package com.recruiters.recruiter

import grails.plugin.springsecurity.annotation.Secured

class DealController {

    @Secured(['ROLE_RECRUITER'])
    def index() {

    }
}
