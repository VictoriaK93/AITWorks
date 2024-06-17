package classwork_29;

public class OuterClass {
    private static String staticField = "Статистическое поле";
    private String field = "Нестатическое поле";

    static class StaticNestedClass {
        private static String nestedStaticField = "Вложенное статическое поле";
        private String nestedField = "Вложенное поле";

        void display() {
            //Обращение к статическому поле внешнего класса
            System.out.println(staticField);
            //Обращение к нестатическому поле внешнего класса
            //System.out.println(field);// ошибка, т.к. нельзя

            // Обращение к полям самого StaticNestedClass
            // происходит обычном образом
            System.out.println(nestedStaticField);
            System.out.println(nestedField);
            // вывести статистическое поле внутреннего класса
            // допустимое поведение только в последних версиях джавы
            //System.out.println(OuterClass.InnerClass.innerStaticField);
            //вывести поле внутреннего класса
            // нереализуемо
            //System.out.println(OuterClass.innerClassObject.innerField);
        }

        class InnerClass {
            private String innerField = "Внутреннее поле";
            //  private static String innerStaticField = "Внутреннее статическое поле";

            void display() {
                //Обращение к статическому поле внешнего класса
                System.out.println(staticField);
                //Обращение к нестатическому поле внешнего класса
                //System.out.println(field);
                // Обращение к нестатическому полю экзэмпляра класса InnerClass
                System.out.println(this.innerField);
                //Обращение к статическому полю внешнего класса в полной форме
                System.out.println(OuterClass.staticField);
                // Обращение к нестатическому полю экзэмпляра внешнего класса в полной форме
                //System.out.println(OuterClass.this.field);
                //вывести статистическое поле вложенного статистического класса
                System.out.println(StaticNestedClass.nestedStaticField);
                // вывести поле вложенного статистического класса
                System.out.println();
                //
            }
        }
    }
}
