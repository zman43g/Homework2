//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println();
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println();
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        var friend = 19;
        System.out.println();
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        var frog = 3.5;
        System.out.println();
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
        System.out.println();

        var massBoxer1 = 78.2;
        var massBoxer2 = 82.7;
        var massSummary = massBoxer1 + massBoxer2;
        System.out.println("Общая масса бойцов = " + massSummary);
        var massDiff = massBoxer2 - massBoxer1;
        System.out.println("Разница между массами бойцов = " + massDiff);
        var divRem = massBoxer2 % massBoxer1;
        System.out.println("Отстаток от деления  = " + divRem);
        System.out.println();
        var hours = 640;
        var hoursPerUnit = 8;
        var units = hours / hoursPerUnit;
        System.out.println("Всего работников в компании — " + units + " человек.");
        units = 94 + units;
        var totalHours = 8 * units;

        System.out.println(" Если в компании работает " + units + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");

    }
}