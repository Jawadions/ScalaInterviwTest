package com.particeep.test.basic

/**
 * This is basic language questions so don't use external library or build in function
 */
object BasicScala {

  /**
   * Encode parameter in url format
   *
   * Example:
   *
   * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
   * output : "?sort_by=name&order_by=asc&user_id=12"
   *
   * input  : Map()
   * output : ""
   */
  def encodeParamsInUrl(params: Map[String, String]): String = {
	params.foreach((e: (String, String)) => println("?"+ e._1 + "=" + e._2 + "&"))

  /**
   * Test if a String is an email
   */

   
object EMail {
		def apply(user: String, domain: String) = user +"@"+ domain

		def unapply(str: String): Option[(String, String)] = {
			val parts = str split "@"
			if (parts.length == 2) Some(parts(0), parts(1)) else None
		}
	}
	def isEmail(maybeEmail: String): Boolean = {
		s match {
		  case EMail(user, domain) => println(user +" AT "+ domain)
		  case _ => println("not an email address")
		}
	}

  /**
   * Compute i ^ n
   *
   * Example:
   *
   * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
   * output : 8
   *
   * input : (i = 99, n = 38997)
   * output : 1723793299
   */
def power(i: Int, n: Int): Int = {
        var ans = scala.math.pow(i,n)
        println("The value of "+i+" to the power of "+p+" is "+ ans)
    }

}
