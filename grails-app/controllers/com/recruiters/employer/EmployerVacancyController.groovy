package com.recruiters.employer

import grails.plugin.springsecurity.annotation.Secured

class EmployerVacancyController {

    @Secured(['ROLE_EMPLOYER'])
    def index() { }
}
