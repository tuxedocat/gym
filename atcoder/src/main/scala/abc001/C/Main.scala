package abc001.C

/**
  * Copyright 2018 tuxedocat
  */
object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val deg, meterPerMin = sc.nextInt()
  val eps = 1e-6
  val dist = BigDecimal(meterPerMin / 60.0)
    .setScale(1, math.BigDecimal.RoundingMode.HALF_UP)
    .toDouble
  val directions = Array("N",
                         "NNE",
                         "NE",
                         "ENE",
                         "E",
                         "ESE",
                         "SE",
                         "SSE",
                         "S",
                         "SSW",
                         "SW",
                         "WSW",
                         "W",
                         "WNW",
                         "NW",
                         "NNW")
  val directionMap = {
    for (i <- 0 to 15) yield (i, directions(i))
  }.toMap

  val ranges = Array[(Double, Double)]((0.0, 0.2),
                                       (0.3, 1.5),
                                       (1.6, 3.3),
                                       (3.4, 5.4),
                                       (5.5, 7.9),
                                       (8.0, 10.7),
                                       (10.8, 13.8),
                                       (13.9, 17.1),
                                       (17.2, 20.7),
                                       (20.8, 24.4),
                                       (24.5, 28.4),
                                       (28.5, 32.6),
                                       (32.7, 120000))

  val intensity = getIntensity(dist)
  val dirCode = if (intensity == 0) "C" else getDirection(deg)

  println(s"$dirCode $intensity")

  def getDirection(d: Int): String = {
    val idx = ((d * 10 + 1125) / 2250) % 16
    directionMap.getOrElse(idx, "N")
  }

  def getIntensity(dist: Double): Int = {
    var intensity = -1
    for (((lower, upper), idx) <- ranges.zipWithIndex) {
      if (lower <= dist && dist <= upper) {
        intensity = idx
      }
    }
    intensity
  }
}
