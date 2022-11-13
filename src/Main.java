public class Main {
    public static void main(String[] args) {
        //task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("task 1 dog: "+dog);
        System.out.println("task 1 cat: "+cat);
        System.out.println("task 1 paper: "+paper+"\n");

        //task 2
        dog+=4;
        cat+=4;
        paper+=4;

        System.out.println("task 2 dog: "+dog);
        System.out.println("task 2 cat: "+cat);
        System.out.println("task 2 paper: "+paper+"\n");

        //task 3
        dog-=3.5;
        cat-=1.6;
        paper-=7639;

        System.out.println("task 3 dog: "+dog);
        System.out.println("task 3 cat: "+cat);
        System.out.println("task 3 paper: "+paper+"\n");

        //task 4
        var friend = 19;
        System.out.println("task 4 friend: "+friend);

        friend+=2;
        System.out.println("task 4 friend: "+friend);

        friend/=7;
        System.out.println("task 4 friend: "+friend+"\n");

        //task 5
        var frog = 3.5;
        System.out.println("task 5 frog: "+frog);

        frog*=10;
        System.out.println("task 5 frog: "+frog);

        frog/=3.5;
        System.out.println("task 5 frog: "+frog);

        frog+=4;
        System.out.println("task 5 frog: "+frog+"\n");

        //task 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Total weight: "+(boxer1+boxer2));
        System.out.println("Weight difference: "+Math.abs(boxer1-boxer2)+"\n");

        //task 7
        System.out.println("Weight difference: "+(boxer2-boxer1));
        System.out.println("Weight difference: "+(boxer2%boxer1)+"\n");

        //task 8
        System.out.println("Всего работников в компании – "+(640/8)+" человек");
        System.out.println("Если в компании работает "+(640/8+94)+" человек, то всего "+(640.0/(640/8+94))+" часов работы может быть поделено между сотрудниками.");
    }
}