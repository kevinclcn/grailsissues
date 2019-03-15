package grailsissues

import grails.converters.JSON

class DemoController {

    def index() {
        def data = request.JSON

        render data as JSON
    }
}
