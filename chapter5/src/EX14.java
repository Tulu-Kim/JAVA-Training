interface EX{}
interface FA extends EX{}
interface G{}
interface HA extends EX,G{}//���߻���� ����
class I{}
class J implements EX,G{}

//class K extends I{} extends I,J
class K extends I implements EX,G{}

public class EX14 {

}
