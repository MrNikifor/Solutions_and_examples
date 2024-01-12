package condition;
/*Широкоротая лягушка особенно интересуется пищевыми привычками других существ.

Он просто не может перестать спрашивать встречающихся ему существ, что они любят есть. Но затем он встречает аллигатора,
 который просто ОБОЖАЕТ есть лягушек с широкой пастью!
Когда он встречает аллигатора, тот делает крошечный рот.
Ваша цель в этом ката — создать завершенный метод Mouth_size. Этот метод принимает один аргумент — животное,
соответствующее животному, с которым столкнулась лягушка. Если это аллигатор (без учета регистра),
верните маленький размер, в противном случае верните широкий.*/
public class WideMouthedFrog {
    public static String anm = "alligator";
    public static void main(String[] args) {
        System.out.println(mouthSize("alligator"));

    }
    public static String mouthSize(String animal){
        String condition = "small";
        if (animal.equals("alligator") || animal.equals("ALLIGATOR")){
            System.out.println(condition);
        }else {
            condition = "wide";
            System.out.println(condition);
        }
        return condition;

        //return animal.equalsIgnoreCase("alligator") ? "small" : "wide";
    }
}
