//package streams;
//
//import java.io.*;
//import java.nio.*;
//import java.nio.channels.*; import java.nio.file.*;
//
//public class ExplicitChannelRead {
//    public static void main(String args[]) {
//        int count;
//        Path filepath = null;
//// сначала получить путь к файлу
//        try {filepath = Paths.get("notes.txt"); } catch(InvalidPathException e) {
//            System.out.println("Path Error " + e);
//            return; }
//// затем получить канал к этому файлу в
//// блоке оператора try с ресурсами
//        try (SeekableByteChannel fChan = Files.newByteChannel(filepath)) {
//// выделить память под буфер
//            ByteBuffer mBuf = ByteBuffer.allocate(128);
//            do {// читать данные из файла в буфер count = fChan.read(mBuf);
//// прекратить чтение по достижении конца файла if(count != -1) {
//// подготовить буфер к чтению из него данных mBuf.rewind();
//// читать байты данных из буфера и // выводить их на экран как символы for(int i=0; i < count; i++)
//                System.out.print((char)mBuf.get()); }
//        } while(count != -1);
//        System.out.println(); } catch (IOException e) {
//        System.out.println("Ошибка ввода-вывода " + e); }
//} }