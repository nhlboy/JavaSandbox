package streams;

import java.io.*;
import java.io.BufferedInputStream;

public class Stream {

    public static void main(String[] args) throws FileNotFoundException {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("file.dat")))
        {
        Person person = new Person("Kirill", 36, 178, true);
            objectOutputStream.writeObject(person);
        }
        catch(IOException ex) {

        }


        try(ObjectInputStream objectInputStream = new ObjectInputStream((new FileInputStream("file.dat"))))
        {
            Person p=(Person)objectInputStream.readObject();
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }


        String text = "Hello world!"; // строка для записи

        try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("notes.txt")))
        {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            bufferedOutputStream.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }



        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("notes.txt")))
        {
          int i = -1;
          while((i = bufferedInputStream.read()) != -1) {
              System.out.println((char)i);
          }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}