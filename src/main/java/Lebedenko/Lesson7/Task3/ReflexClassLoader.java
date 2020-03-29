package Lebedenko.Lesson7.Task3;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class ReflexClassLoader {

    public void myClassLoaderWork(){
        ClassLoader classLoader = new ClassLoader ("D:\\Modules\\");
        Class<?> clazz;
        try {
            clazz = classLoader.loadClass("MyClass");
            log.info("Loaded " + clazz.getName() + ".class");
            Object obj = clazz.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            log.error(e.getMessage());

        }
    }
}