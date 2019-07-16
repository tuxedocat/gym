package {{pkgname}}

fun main(args: Array<String>) {
    val sc = java.util.Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ss: List<Set<Int>> = (1..m).map {
        val k = sc.nextInt()
        sc.asSequence().take(k).map(String::toInt).map { it - 1 }.toSet()
    }
    val ps = sc.asSequence().take(m).map(String::toInt).toList()    val x = readLine()!!.split(' ').map {String::toInt()}

    val ans = solve(42)
    println(ans)
}

fun solve(x: Int): Int {
    return x + 1
}
