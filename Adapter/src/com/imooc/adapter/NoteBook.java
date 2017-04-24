package com.imooc.adapter;

/**
 * Created by pp on 2017/4/24.
 */
public class NoteBook {

    private ThreePlugIf plug;

    public NoteBook(ThreePlugIf plug) {
        this.plug = plug;
    }

    public void charge(){
        plug.powerWithThree();
    }

    public static void main(String[] args){
        GBTowPlug gbTowPlug = new GBTowPlug();
        ThreePlugIf threePlugIf = new TwoPulgAdapter(gbTowPlug);
        NoteBook noteBook = new NoteBook(threePlugIf);
        noteBook.charge();

        threePlugIf = new TwoPulgAdapterExtends();
        noteBook = new NoteBook(threePlugIf);
        noteBook.charge();
    }
}
