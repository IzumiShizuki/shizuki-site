package vb;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends o {
    public static void L(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void M(List list, Comparator comparator) {
        jc.l.e(list, "<this>");
        jc.l.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
