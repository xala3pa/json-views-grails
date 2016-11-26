package json.views.app

import grails.rest.Resource

@Resource(uri = "/purchases", formats = ['json', 'xml'])
class Purchase {
    Long id
    static hasMany = [product: Product]

    static constraints = {
    }
}
