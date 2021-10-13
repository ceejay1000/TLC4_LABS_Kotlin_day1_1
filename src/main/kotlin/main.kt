fun main(args: Array<String>) {
//    println("Hello World!")
    var y1 = 0
    var y2 = 0
    var greet = "Hello Emmanuel"
    println(greet)

//     y = 3x - 1

//    for (x in -5..5 step 1){
//        println(calculateY(3,x,-1))
//    }


//    for (x in 0..20){
//        y1 = 3 * x + 5
//        y2 = 4 * x + 2
//
//        println(checkIntersection(y1, y2))
//    }

    for (x in 0..100)
      //  intersection(3,5,4,2,x)
       // intersection(2,1,3,3,x)
        intersection(-2,3,3,-2,x)

}


fun calculateY(m : Int, x : Int, c : Int) : Int {
    // y = mx + c - formula for a straight line
    return m * x + c
}

fun checkIntersection(y1: Int, y2: Int): Int {
    if (y1 == y2){
        return y1
    }
    return 0;
}

fun intersection(mOne: Int, cOne : Int, mTwo : Int, cTwo : Int, x: Int): Unit{

    var yOne = mOne * x + cOne
    var yTwo = mTwo * x + cTwo

    if (yOne != yTwo)
        println("Don't Intersect")
    else
        println(yOne)

}