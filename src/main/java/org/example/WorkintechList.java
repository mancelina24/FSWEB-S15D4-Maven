package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList <T extends Comparable<T>> extends ArrayList<T> {
    //WorkintechList<T> artık bir ArrayList<T> gibi davranabilir (eleman ekleme, silme, sıralama vb.).

    // 1️⃣ Override add metodu (Tekrar eden elemanları engelle)
    //u metot, ArrayList sınıfındaki add() metodunu override ediyor. Yani ArrayList'te zaten bir add() metodu var, ancak biz onu değiştiriyoruz.
    @Override
    public boolean add(T element) {
        if (!this.contains(element)) {
            super.add(element);
            return true;
        }
        return false; // Tekrar eden öğe eklenmez
    }

    // 2️⃣ Sıralama metodu
    public void sort() {
        Collections.sort(this);
    }

    // 3️⃣ Silme metodu (sil ve sıralama yap)
    @Override
    public boolean remove(Object element) {
        boolean removed = super.remove(element);
        if (removed) {
            this.sort(); // Silme sonrası sıralama yap
        }
        return removed;
    }
}