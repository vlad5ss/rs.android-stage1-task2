package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        //https://stackoverflow.com/questions/54532309/product-of-two-consecutive-fibonacci-numbers-code-times-out
        //https://www.codewars.com/kata/product-of-consecutive-fib-numbers
        //    public static long[] productFib(long prod) {
        //
        //        long prev = 0;
        //        long curr = 1;
        //        long multiplied = prev * curr;
        //
        //        while (multiplied < prod) {
        //            long temp = curr;
        //            curr += prev;
        //            prev = temp;
        //            multiplied = prev * curr;
        //        }
        //
        //        return new long[] { prev, curr, multiplied == prod ? 1 : 0 };
        //
        //    }
        var prev: Int = 0
        var curr: Int = 1
        var multiplied = prev * curr
        while (multiplied < n) {
            val temp = curr
            curr += prev
            prev = temp
            multiplied = prev * curr
        }
        return intArrayOf(prev, curr, if (multiplied == n) 1 else 0)
    }
}
