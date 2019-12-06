import org.scalatest.FunSuite
import  com.mmk.caststring.project.CastingString
class CastingStringTest extends FunSuite {
   test("Test Should Failed"){
     assert(CastingString.castStringToInteger("hello")=== None)
   }

  test("passed test "){
    assert(CastingString.castStringToInteger("12")=== Some(12))
  }
}
