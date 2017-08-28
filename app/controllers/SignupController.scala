package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class SignupController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def signup() = Action { implicit req =>
    // signup formを出す
    Ok(views.html.signup())
  }
}
