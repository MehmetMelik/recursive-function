package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
    if (r==0 || c==0 || c==r) {
      1
    } else {
      pascal(c-1, r-1) + pascal(c, r-1)
    }
  }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

      def findClosing(chars: List[Char]): Boolean = {
        if(chars.isEmpty)
          false
        else {
          true
        }
      }
      if (chars.isEmpty)
        true
      else {
        if(chars.head.equals('(')) {
          findClosing(chars.tail)
        }
      }
  }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
