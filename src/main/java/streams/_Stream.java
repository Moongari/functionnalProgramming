package streams;

import Bean.Animal;
import MockData.MockData;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

// Exemple de stream et des differents operateur

public class _Stream {

    public static void main(String[] args) throws IOException {

        List<Animal> animalList = MockData.getListAnimal();

        //ici nous recuperons la liste des animaux qui sont des felins
        List<Animal> animalFelin = animalList.stream()
                .filter(f->f.getRace().equals("felin"))
                .collect(Collectors.toList());
        animalFelin.forEach(System.out::println);

    //ici notre stream nous permet de recuperer les differentes types races des animaux
        animalList.stream().map(animal -> animal.getRace())
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);






    }





}
