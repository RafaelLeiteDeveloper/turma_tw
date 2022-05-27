package aulaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		   
		//FOR
        List<Integer> numbers = Arrays.asList(1,2,3);
        numbers.forEach((Integer number) -> {
            System.out.println(number);
        });
        
        // MAP
        List<String> alpha = Arrays.asList("a", "b", "c", "d");

        //Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for (String s : alpha) {
            alphaUpper.add(s.toUpperCase());
        }

        System.out.println(alpha); //[a, b, c, d]
        System.out.println(alphaUpper); //[A, B, C, D]

        // Java 8
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect); //[A, B, C, D]

        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); //[2, 4, 6, 8, 10]
        
        //FILTER
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        List<Integer> lessThanThreeLambda = numeros.stream()
        .filter(number -> number < 3)
        .collect(Collectors.toList());

        System.out.println(lessThanThreeLambda);
        
        
        // REDUCE
        
        //Identidade - um elemento que é o valor inicial da operação de redução e o resultado padrão se o fluxo estiver vazio;
        //Acumulador - uma função que aceita dois parâmetros: um resultado parcial da operação de redução e o próximo elemento do fluxo;
        //Combinador - uma função usada para combinar o resultado parcial da operação de redução, quando a redução é paralelizada ou quando há uma incompatibilidade entre os tipos de argumentos do acumulador e os tipos de implementação do acumulador;
        
     // iniciamos uma lista com números multiplos de 2
        List<Integer> numbersReducer = Arrays.asList(2, 4, 6, 8, 10);

        // retornar a soma de todos os números da lista
        int result = numbersReducer
        	.stream()
        	.reduce(0, (subtotal, element) -> subtotal + element);
        
        System.out.println(result);
        
        int resultLambda = numbersReducer.stream().reduce(0, Integer::sum);
        
        System.out.println(resultLambda);
        
        
        List<String> words = Arrays.asList("como", " usar", " reduce", " para", " unificar", " string");
        String resultString = words
        		.stream()
        		.reduce("", (partialString , element) -> partialString + element);
       
        System.out.println(resultString);
        
        String resultStringLambda = words.stream().reduce("", String::concat);
        
        System.out.println(resultStringLambda);
        
        // min max
        
        Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        
        Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        
        System.out.println(maxNumber);
        System.out.println(minNumber);
       

	}

}
