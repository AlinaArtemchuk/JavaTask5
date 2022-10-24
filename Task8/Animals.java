import java.util.ArrayList;

public class Animals {

        class Descendants <T extends Number> {
            T[] nums;
            public T[] getNums() {
                return nums;
            }
            public void Descendants(Integer[] AnimalsNums) {
                Integer AnimalsNums1 = 1;
                Integer AnimalsNums2 = 2;
                Integer AnimalsNums3 = 3;
            }}
    public static <InvalidLineNumsException> void  main(String[] args){
                    ArrayList<String> AnimalsName = new ArrayList<String>();
                    AnimalsName.add("cat");
                    AnimalsName.add("dog");
                    AnimalsName.add("hamster");

                    String AnimalsName1 = AnimalsName.get(0);
                    System.out.println("AnimalsName1 = " + AnimalsName1);

                    String AnimalsName2 = AnimalsName.get(1);
                    System.out.println("AnimalsName2 = " + AnimalsName2);

                    String AnimalsName3 = AnimalsName.get(2);
                    System.out.println("AnimalsName3 = " + AnimalsName3);
                    try {
                        String AnimalsName4 = AnimalsName.get(3);
                    } catch (IndexOutOfBoundsException e) {
                System.err.println("Wrong animal`s name");

        }
        class MyExeption {
            class InvalidNumberExeptions extends Exception {
                public InvalidNumberExeptions(String message)
                {
                    super (message);
                }
                public InvalidNumberExeptions() {
                }
                class NumberExeptions{
                    public void checkNumber(int num) throws InvalidNumberExeptions  {
                        if (num >3)
                            throw new InvalidNumberExeptions ("Number is too big");
                        else if (num <1) {
                            throw new InvalidNumberExeptions("Number is too small");
                        }
                        try {
                            checkNumber (4);
                        } catch (InvalidNumberExeptions e) {
                            System.err.println("Number is too big" + e);
                        }
                    }}}

        }}}


