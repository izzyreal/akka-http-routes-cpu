import akka.http.scaladsl.server.Directives.{path, reject}
import akka.http.scaladsl.server.Route

object OneRoute {
  val routes: Route = path("hello") {
    reject
  }
}
