package name.dmitrym

import org.specs2.mutable.Specification

class SolutionTest extends Specification {

  "SolutionTest" should {
    "averageWaitingTime is 9" in {
      val input = IndexedSeq((0, 3), (1, 9), (2, 6))
      new Solution(3, input).averageWaitingTime() must be_==(9)
    }

    "averageWaitingTime is 8" in {
      val input = IndexedSeq((0, 3), (1, 9), (2, 5))
      new Solution(3, input).averageWaitingTime() must be_==(8)
    }

    "averageWaitingTime is 1418670047" in {
      val input = IndexedSeq(
        (961148050, 385599125),
        (951133776, 376367013),
        (283280121, 782916802),
        (317664929, 898415172),
        (980913391, 847912645)
      )
      new Solution(5, input).averageWaitingTime() must be_==(1418670047)
    }

    "averageWaitingTime is 8485548331" in {
      val input = IndexedSeq(
        (137857688, 413115088),
        (679783990, 171274023),
        (783725811, 742261681),
        (238387441, 531682046),
        (683427743, 559301752),
        (843391076, 398722857),
        (593760457, 2628387),
        (441381803, 788912528),
        (771854880, 916901718),
        (976015955, 978145894),
        (235492265, 264125858),
        (866638949, 551120745),
        (238176883, 201620672),
        (254029772, 950305054),
        (356294983, 203393748),
        (291672611, 722032663),
        (560013448, 126478507),
        (929678215, 321924654),
        (737812220, 884493567),
        (388266395, 252551113),
        (79292652, 229453232),
        (367753702, 242882326),
        (930211560, 461283594),
        (955372388, 594944846),
        (506995906, 872449795),
        (538015463, 457419763),
        (950540066, 820099707),
        (823860276, 896193555),
        (538832788, 47584891),
        (88242680, 700680580),
        (196842555, 623621497),
        (700528228, 610051112),
        (668066226, 170226832),
        (522278872, 914689320),
        (375621149, 336628938),
        (418416931, 270027322),
        (179882058, 480538711),
        (540671906, 215602397),
        (201411561, 930064341),
        (36616963, 35887002),
        (772894889, 944088968),
        (891134170, 633761602),
        (975099001, 434725536),
        (926070958, 326905396),
        (727328509, 867529847),
        (340789259, 890185621),
        (923620442, 986091986),
        (747688776, 107231383),
        (38070714, 495529501),
        (610348800, 235616181)
      )
      new Solution(50, input).averageWaitingTime() must be_==(8485548331l)
    }

  }
}
