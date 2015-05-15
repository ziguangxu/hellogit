Object HelloWorld {
	def main(args: Array[String]) = {
		println("Hello World!")
	}
	def factorial(n: Int): Int = {
		def factorialHelper(x: Int, acc: Int): Int = if (x==0) acc else factorialHelper(x-1, x*acc)	
		factorialHelper(n, 1)			
	}
	def sum(n: Int): Int = {
		def sumHelper(x: Int, acc: Int): Int = if (x==0) acc else sumHelper(x-1, x+acc)	
		sumHelper(n, 0)			
	}
}