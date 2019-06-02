package {{pkgname}}

fun main(args: Array<String>) {
    val x = readLine()!!.split(' ').map {String::toInt()}
    val ans = solve(42)
    println(ans)
}

fun solve(x: Int): Int {
    return x + 1
}
