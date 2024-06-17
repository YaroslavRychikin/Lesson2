import java.util.Scanner;
/**
 \brief Класс для математических операций.

 Данный класс предоставляет функционал сложения.
 */
public class Math {
    /**
     \brief Основной метод где запускается программа
     */
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи два числа через пробел: ");
        int a = scanner.nextInt();
        int b =  scanner.nextInt();
        System.out.println("Sum: "+ Sum(a,b));
    }
    /**
     \brief Шаблонная функция суммирования двух объектов

    \tparam T - любой тип, для которого определен оператор суммирования
    и оператор присваивания

    \param [in] a Первый объект, который нужно сложить
    \param [in] b Второй объект, который нужно сложить

    \return Новый объект типа *T*, равный сумме *a* и *b*.

     \warning Только целые числа
            */
    public static int Sum(int a, int b) {
        int x = a+b;
        return x;
    }

}