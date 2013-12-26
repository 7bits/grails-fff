package com.recruiters.employer

import grails.plugin.springsecurity.annotation.Secured

class VacancyController {

    @Secured(['ROLE_EMPLOYER'])
    def index() { }
}
