object InterestCalculator{
    def main(args:Array[String]):Unit={
        println("Enter the deposit amount: ")
        val depositAmount= scala.io.StdIn.readDouble()

        val interest:Double =>Double= (deposit:Double)=>deposit match{
            case d if d<=20000 =>d*0.02
            case d if d<=200000 =>d*0.04
            case d if d<=2000000 =>d*0.035
            case d =>d*0.065
        }

        val interestAmount= interest(depositAmount)
        println(f"The interest earned in a year is Rs. $interestAmount%.2f")
    }
}