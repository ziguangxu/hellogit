Object HelloWorld {
	def main(args: Array[String]) = {
		println("Hello World!")
	}
	def factorial(n: Int): Int = {
		def factorialHelper(x: Int, acc: Int): Int = if (x==0) acc else factorialHelper(x-1, x*acc)	
		factorialHelper(n, 1)			
	}
}