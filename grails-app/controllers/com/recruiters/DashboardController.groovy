package com.recruiters

import grails.plugin.springsecurity.annotation.Secured
import static grails.plugin.springsecurity.SpringSecurityUtils.ifAnyGranted

class DashboardController {

    def springSecurityService

    @Secured("hasAnyRole('ROLE_EMPLOYER', 'ROLE_RECRUITER')")
    def index() {
        if (ifAnyGranted("ROLE_EMPLOYER")) {
            redirect(mapping: "employerVacancies")
        } else if (ifAnyGranted("ROLE_RECRUITER")){
            redirect(mapping: "recruiterDeals")
        }

    }
}
