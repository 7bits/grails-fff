package com.recruiters

import grails.plugin.springsecurity.annotation.Secured

class VacancyController {

    @Secured(['ROLE_RECRUITER'])
    def index() {

    }
}
