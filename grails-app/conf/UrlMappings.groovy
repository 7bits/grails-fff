class UrlMappings {

	static mappings = {
        name logout: "/logout" {
            controller = 'logout'
            action = 'index'
        }
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
