object NumberPatternMatching {
    def main(args: Array[String]): Unit = {
        if (args.length != 1) {
            println("Please provide a single integer input.")
            sys.exit(1)
        }

        val input = try {
            args(0).toInt
        } catch {
            case _: NumberFormatException =>
                println("Please provide a valid integer input.")
                sys.exit(1)
        }

        val checkNumber: Int => String = (num: Int) => num match {
            case n if n <= 0 => "Negative/Zero is input"
            case n if n % 2 == 0 => "Even number is given"
            case _ => "Odd number is given"
        }

        val result = checkNumber(input)
        println(result)
    }
}
