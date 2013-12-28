class UrlMappings {

	static mappings = {

        name login: "/login" {
            controller = 'login'
            action = 'auth'
        }

        name logout: "/logout" {
            controller = 'logout'
            action = 'index'
        }

        name recruiterDeals: "/recruiter/deals" {
            controller = 'recruiterDeal'
            action = 'index'
        }

        name showRecruiterDeal: "/recruiter/deals/$id" {
            controller = 'recruiterDeal'
            action = 'show'
        }

        name recruiterBids: "/bids" {
            controller = 'recruiterBid'
            action = 'index'
        }

        name recruiterVacancies: "/vacancies" {
            controller = 'recruiterVacancy'
            action = 'index'
        }

        name showRecruiterVacancies: "/vacancies/$id" {
            controller = 'recruiterVacancy'
            action = 'show'
        }

        name recruiterNewApplicant: "/applicants/new" {
            controller = 'recruiterApplicant'
            action = 'create'
        }

        name employerVacancies: "/my-vacancies" {
            controller = 'employerVacancy'
            action = 'index'
        }

        name employerDeals: "/employer/deals" {
            controller = 'employerDeal'
            action = 'index'
        }

        name employerVacancyBids: "/employer/vacancy/$id/bids" {
            controller = 'employerBid'
            action = 'vacancyBids'
        }

        name employerShowRecruiter: "/employer/recruiter/$id" {
            controller = 'employerRecruiter'
            action = 'show'
        }

        name employerShowDeal: "/employer/deals/$id" {
            controller = 'employerDeal'
            action = 'show'
        }

        name employerShowApplicant: "/employer/applicants/$id" {
            controller = 'employerApplicant'
            action = 'show'
        }

        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

        name root: "/" {
            controller = 'dashboard'
            action = 'index'
        }
        "500"(view:'/error')
	}
}
