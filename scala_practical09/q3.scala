object StringFormatter {
    def toUpper(name: String): String = {
        name.toUpperCase()
    }
    def toLower(name: String): String = {
        name.toLowerCase()
    }
    def formatNames(name: String)(format: String => String): String = {
        format(name)
    }
    def main(args: Array[String]): Unit = {
        val name1 = formatNames("Benny")(toUpper)
        val name2 = formatNames("Niroshan")(name => name.substring(0,2).toUpperCase + name.substring(2).toLowerCase)
        val name3 = formatNames("Saman")(toLower)
        val name4 = formatNames("Kumara")(name => name.substring(0,1).toUpperCase + name.substring(1,5).toLowerCase + name.substring(5).toUpperCase)
        println(name1) 
        println(name2) 
        println(name3) 
        println(name4)
    }
}