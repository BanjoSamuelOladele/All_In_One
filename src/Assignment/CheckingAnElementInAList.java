package Assignment;

public class CheckingAnElementInAList {
    public static void main(String[] args) {
        CheckingAnElementInAList checkElement = new CheckingAnElementInAList();
        String[] arrayElement = new String[]{"Dele", "Tobi", "Esther", "Tayo"};
        System.out.println(checkElement.methodConfirmElement(arrayElement, "Dele"));
    }

    public String methodConfirmElement(String[] arrayElement, String occurredInElement) {
//        String occurredInElement = "Dele";
        String result = null;
//        for (String element: arrayElement){
//            if (element.contains(occurredInElement)) result = arrayElement[element];
//            else result = "Empty";
//        }
        for (int index = 0; index < arrayElement.length; index++) {
            if (arrayElement[index]==occurredInElement) result = arrayElement[index];
            else result = "Empty";
        }
        return result;
    }
}
