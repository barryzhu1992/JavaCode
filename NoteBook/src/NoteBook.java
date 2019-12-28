import sun.applet.Main;

import java.util.ArrayList;

/**
 * @author : zhuyuesong
 * create at:  2019-12-05  09:56
 * @description:
 */
public class NoteBook {
    private ArrayList<String> notes = new ArrayList<String>();

    public void addString(String note){
        notes.add(note);
    }

    public int getSize(){
        return notes.size();
    }

    public String getNote(int index){
        return notes.get(index);
    }

    public void removeNote(int index){
        notes.remove(index);
    }

    public void list(){
        System.out.println(notes);
    }

    public static void main(String[] args) {

        NoteBook noteBook = new NoteBook();
        noteBook.addString("first");
        noteBook.addString("hello");
        System.out.println(noteBook.getSize());
        noteBook.list();
        noteBook.removeNote(1);
        noteBook.list();


    }

}
