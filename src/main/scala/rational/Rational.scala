package rational

class Rational(sourceNumerator:Int, sourceDenominator:Int = 1) {
	require (sourceDenominator != 0);
	
	private def greatestCommonDenominator:Int = 
	  Math.abs(calculateGreatestCommonDenominator(sourceNumerator, sourceDenominator))
	private def denominatorSign:Int = sourceDenominator / Math.abs(sourceDenominator)
	def numerator:Int = sourceNumerator / greatestCommonDenominator * denominatorSign
	def denominator:Int = sourceDenominator / greatestCommonDenominator * denominatorSign
	
	private def calculateGreatestCommonDenominator(p:Int,q:Int):Int = {
	  if (q == 0) { p }
	  else {
		  calculateGreatestCommonDenominator(q, p % q) 
	  }
	}
	
	def +(that:Rational):Rational = {
	  new Rational(
	      ((this.numerator * that.denominator) + 
	       (that.numerator * this.denominator)),
	      (this.denominator * that.denominator))	  
	}
	
	def -(that:Rational):Rational = {
	  this + (new Rational(-1) * that) 
	}
	
	def *(that:Rational):Rational = {
	  new Rational(
	      (this.numerator * that.numerator),
	      (this.denominator * that.denominator))	  
	}
  
	override def toString():String = {
	  if (denominator != 1) {
		numerator + "/" + denominator
	  } else {
		numerator.toString()
	  }
	}
}
