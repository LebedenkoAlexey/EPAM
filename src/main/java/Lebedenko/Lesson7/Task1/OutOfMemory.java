package Lebedenko.Lesson7.Task1;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Slf4j
public class OutOfMemory {

    public static void main(String[] args) {
        Random random = new Random ();
        List<String> list = new ArrayList<>();
        try {
            for (int i = 0; ; i++) {
                list.add(Integer.toString (random.nextInt (100)));
                System.out.println(i);
            }
        } catch (OutOfMemoryError e) {
            log.error("!Ошибка " + e.toString());
            System.exit(-1);
        }
    }
}