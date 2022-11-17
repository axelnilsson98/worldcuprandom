object vmSlump:
    
    def calc(matches: Int): Unit =
        val rand = scala.util.Random()

        val results = for i <- 0 until matches yield
            var home = rand.nextInt(128)
            var away = rand.nextInt(128)
            (convert(home), convert(away))
        
        println("results:")
        results.map(i  => println(s"${i._1}\t-\t${i._2}"))

        println("tiebreakers")
        for(i <- 0 until 10 )do
            
            if(rand.nextInt > 0.5) then println("home")
            else println("away")
        
        
        
        
    def convert(value: Int): Int =    
        if(value < 33) then
            0
        else if( value < 75) then
            1
        else if( value < 112) then
            2
        else if(value < 123) then
            3
        else if (value < 125) then
            4
        else if(value < 127) then
            5
        else
            6