import java.io.File

fun exportVariable(name: String, value: String) = File(System.getenv("GITHUB_ENV")).appendText("${name}=${value}\n")