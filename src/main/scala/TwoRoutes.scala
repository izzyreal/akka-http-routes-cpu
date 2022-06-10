import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

object TwoRoutes {
  val routes: Route = path("hello") {
    get {
      complete(StatusCodes.OK)
    }
  } ~ path("hello") {
    get {
      complete(StatusCodes.OK)
    }
  }
}
