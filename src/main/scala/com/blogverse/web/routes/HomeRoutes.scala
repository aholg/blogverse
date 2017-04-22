package com.blogverse.web.routes

import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.model.ContentTypes.`text/html(UTF-8)`
import akka.http.scaladsl.model.HttpEntity

trait HomeRoutes {
  lazy val homeRoutes: Route = {
    (pathPrefix("home") | pathEndOrSingleSlash) {

      complete(
        HttpEntity(`text/html(UTF-8)`, "<p>Hello World</p>")
      )
    }
  }
}
