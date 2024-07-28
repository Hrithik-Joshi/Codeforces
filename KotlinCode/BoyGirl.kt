fun main(args: Array<String>) {
    val inputString = readLine() ?: ""
    var charArrayList = ArrayList<Char>()
    var count = 0
    for (char in inputString) {
        if(!charArrayList.contains(char)){
          count+=1
        }
        charArrayList.add(char)
    }
    if(count%2==0){
      println("CHAT WITH HER!")
    }
    else{
      println("IGNORE HIM!")
    }
}