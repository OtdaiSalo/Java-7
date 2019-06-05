package textsearcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


import java.io.IOException;

public class Main {

    public static void main(final String[] args) throws IOException {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Input your text here -> ");
        String text = reader.readLine(); 
        StringProcessor inputText = new StringProcessor(text);

        inputText.findExclSentences();
        
        
    }
}

 /*
Порахувати і вивести кількість приголосних букв у всіх словах окличних речень. 
Текст  можна ввести з консолі


Також реалізувати можливість вичитки тексту з консолі з-за допомогою Scanner використавши main метод 


main метод має викликати метод вичитування даних з консолі, а також створювати об’єкт, 
метод якого має виконувати роботу з текстом а також метод виводу результату на консоль (showResults)


Виконання операцій над текстом слід робити з-за допомогою об'єктів 
(використання статичних методів заборонено, окрім main методу та readInputText)




 */

