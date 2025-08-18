
fun main(args: Array<String>){
    var temp: Int
    val simpleArray = arrayOf(8,5,7,5,6,4)

    for (i in 0 until simpleArray.size-1) {

        for(j in 0 until simpleArray.size-i-1){
            if(simpleArray.get(j) > simpleArray[j+1]){
                temp = simpleArray[j+1]
                simpleArray[j+1] = simpleArray.get(j)
                simpleArray[j] = temp
            }
        }
    }

    println(simpleArray.contentToString())


}