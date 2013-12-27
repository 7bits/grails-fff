package com.recruiters.employer

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_EMPLOYER'])
class EmployerDealController {

    def index() { }
}
