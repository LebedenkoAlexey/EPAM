package Lebedenko.Lesson7.Task3;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class ClassLoader extends java.lang.ClassLoader {
    private String classPath;

    public ClassLoader(String path) {
        super();
        classPath = path;
    }

    @Override
    public Class<?> findClass(String className) throws ClassNotFoundException {
        try {
            byte[] bytes = fetchClassFromFS(classPath + className + ".class");
            return defineClass(className, bytes, 0, bytes.length);
        } catch (IOException e) {
//            log.error(e.getMessage());
            return super.findClass(className);
        }
    }

    private byte[] fetchClassFromFS(String path) throws IOException {
        InputStream inputStream = new FileInputStream(new File(path));
        long length = new File(path).length();
        if (length > Integer.MAX_VALUE) {
            throw new IOException("Слишком большой файл");
        }
        byte[] bytes = new byte[(int) length];
        int offset = 0;
        int numRead;
        while (offset < bytes.length
                && (numRead = inputStream.read(bytes, offset, bytes.length - offset)) >= 0) {
            offset += numRead;
        }
        if (offset < bytes.length) {
            throw new IOException("Файл не может быть прочитан " + path);
        }
        inputStream.close();
        return bytes;
    }
}