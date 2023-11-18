public class Main {
    public static void main(String[] args) {

        System.out.println("Привет мир!");
        System.out.println("Helo World!");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        var Sam = 78.2;
        var Bill = 82.7;
        var Total = Sam + Bill;
        System.out.println(Total);

        var massa = Sam - Bill;
        System.out.println(massa);

        var differans = (Bill - Sam) % Total;
        System.out.println(differans);

        var time = 640;
        var warClock = 640/8;
        System.out.println(warClock);
        System.out.println("Всего работников в компании - " + warClock + " человек");

        var people = warClock + 94;
        System.out.println(people);

        var plan = time / people;
        System.out.println("Если в компании работает " + people + ", то всего " + plan + " часа работы может быть поделено между сотрудниками");



    }
}