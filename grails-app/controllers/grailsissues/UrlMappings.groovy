package grailsissues

class UrlMappings {

    static mappings = {
        "/demo"(controller: 'demo', action: 'index', method:'POST')

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
