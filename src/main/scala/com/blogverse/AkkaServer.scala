package com.blogverse

import akka.http.scaladsl.server.{HttpApp, Route}
import com.blogverse.web.routes.HomeRoutes

class AkkaServer extends HttpApp with HomeRoutes {
  override protected def route: Route = homeRoutes
}
