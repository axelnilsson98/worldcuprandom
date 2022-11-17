object vmSlump:
    
    def calc(matches: Int): Unit =
        val rand = scala.util.Random()
                
        println("results:")
        for i <- 0 until matches do
            if(i%5 == 0) then println()
            var home = rand.nextInt(128)
            var away = rand.nextInt(128)
            println(s"${convert(home)}\t-\t${convert(away)}")

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