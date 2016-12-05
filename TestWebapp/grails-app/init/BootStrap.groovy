class BootStrap {

    def init = { servletContext ->
    	Status status = new Status(name:'Open').save(flush:true)

    	println("in bootstap ${status.id}")
    }
    def destroy = {
    }
}
