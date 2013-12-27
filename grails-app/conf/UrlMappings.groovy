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
            controller = 'deal'
            action = 'index'
        }

        name recruiterBids: "/bids" {
            controller = 'bid'
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

        name employerVacancies: "/my-vacancies" {
            controller = 'employerVacancy'
            action = 'index'
        }

        name employerDeals: "/employer/deals" {
            controller = 'employerDeal'
            action = 'index'
        }

        name showRecruiterDeal: "/recruiter/deals/$id" {
            controller = 'recruiterDeal'
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
