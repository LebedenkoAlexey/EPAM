package Lebedenko.Lesson7.Task2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StackOverFlow {

        public static void recursivePrint(int num) {
            System.out.println("Number: " + num);

            if(num == 0)
                return;
            else
                recursivePrint(++num);
        }

        public static void main(String[] args) {
            try {
                StackOverFlow.recursivePrint (1);
            } catch (StackOverflowError e){
                log.error("!Ошибка " + e.toString());
                System.exit(-1);
            }
        }
    }