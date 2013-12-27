package com.recruiters.recruiter

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_RECRUITER'])
class RecruiterVacancyController {

    def index() { }

    def show() { }
}
