package tryScala
import scala.io.Source

case class Person(firstname: String, lastname: String, age: Int) 
   

object Assign {
  def main(args: Array[String]): Unit = {
    
   /* val filename = "C:\\Users\\Anusha\\Desktop\\persons.txt"
     for (line <- Source.fromFile(filename).getLines()) 
    
    val fileLines = io.Source.fromFile(filename).getLines.toList
    println(fileLines) */
    
    var persons = new scala.collection.mutable.ListBuffer[Person]() 
    var minors = new scala.collection.mutable.ListBuffer[Person]() 
    var majors = new scala.collection.mutable.ListBuffer[Person]() 
    
    persons += new Person("ANUSHA","MIRIYALA",23)
    persons += new Person("MANISHA","MIRIYALA",18)
    persons += new Person("SREEJA","MANTRI",12)
    persons += new Person("BUNNY","MANTRI",14)
    persons += new Person("VAMSHIKA","MITRA",4)
    persons += new Person("RAMU","MIRIYALA",46)
    persons += new Person("SARITHA","MIRIYALA",42)
    persons += new Person("SAMATHA","DEVUNOORI",33)
    
    
    
    persons.foreach {x => if (x.age <= 18) {minors += x}
                          else majors += x
                   }
    println("People under age 18: "+ minors)
    print("People aboove age 18: "+ majors)
  }
}