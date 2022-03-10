
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.request.*
import io.ktor.http.content.*


fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        routing {
            get("/ola.txt") {
                call.respondText("Hello, world!")
            }
            static("/") {
                files("static/")
            }
        }

    }.start(wait = true)
}
