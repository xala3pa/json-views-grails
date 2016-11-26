package json.views.app

class BootStrap {

    def init = { servletContext ->
        def purchase = new Purchase(id: 1)
        purchase.addToProduct(id: 1, name: "IPhone 7", amount: 900D)
        purchase.addToProduct(id: 2, name: "Pixel", amount: 600D)
        purchase.save()
    }

    def destroy = {
    }
}
