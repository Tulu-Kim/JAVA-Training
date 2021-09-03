interface EX{}
interface FA extends EX{}
interface G{}
interface HA extends EX,G{}//다중상속의 개념
class I{}
class J implements EX,G{}

//class K extends I{} extends I,J
class K extends I implements EX,G{}

public class EX14 {

}
