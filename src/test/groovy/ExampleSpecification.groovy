import spock.lang.Specification;

/*class ExampleSpecification extends Specification {
    def "should be a simple assertion"() {
        expect:
        1 == 2
    }
}*/
class Test {
static class Inner extends Specification {
    def testcase1() {
        expect:
        2 == 3
    }
    def testcase2() {
        expect:
        2 == 2
    }
}
}