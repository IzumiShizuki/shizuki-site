package e5;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m4.b1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n f6240l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f6242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f6243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f6244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m4.q f6245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f6246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f6247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f6248k;

    static {
        List list = Collections.EMPTY_LIST;
        f6240l = new n("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public n(String str, List list, List list2, List list3, List list4, List list5, List list6, m4.q qVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((m) list2.get(i10)).f6234a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f6241d = Collections.unmodifiableList(arrayList);
        this.f6242e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f6243f = Collections.unmodifiableList(list4);
        this.f6244g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.f6245h = qVar;
        this.f6246i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f6247j = Collections.unmodifiableMap(map);
        this.f6248k = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((l) list.get(i10)).f6231a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i10, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    b1 b1Var = (b1) list2.get(i12);
                    if (b1Var.f14141b == i10 && b1Var.f14142c == i11) {
                        arrayList.add(obj);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.offline.t
    public final Object a(List list) {
        ArrayList arrayListC = c(this.f6242e, 0, list);
        List list2 = Collections.EMPTY_LIST;
        return new n(this.f6249a, this.f6250b, arrayListC, list2, c(this.f6243f, 1, list), c(this.f6244g, 2, list), list2, this.f6245h, this.f6246i, this.f6251c, this.f6247j, this.f6248k);
    }
}
