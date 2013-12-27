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

        name recruiterDeals: "/deals" {
            controller = 'deal'
            action = 'index'
        }

        name recruiterBids: "/bids" {
            controller = 'bid'
            action = 'index'
        }

        name employerVacancies: "/vacancies" {
            controller = 'vacancy'
            action = 'index'
        }

        name showDeal: "/deals/$id" {
            controller = 'deal'
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
