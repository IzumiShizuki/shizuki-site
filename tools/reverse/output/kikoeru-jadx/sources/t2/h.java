package t2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f20325a = new g("");

    public static final List a(g gVar, int i10, int i11, sf.i iVar) {
        List list;
        if (i10 == i11 || (list = gVar.f20319a) == null) {
            return null;
        }
        if (i10 != 0 || i11 < gVar.f20320b.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                e eVar = (e) list.get(i12);
                if ((iVar != null ? ((Boolean) iVar.a(eVar.f20309a)).booleanValue() : true) && b(i10, i11, eVar.f20310b, eVar.f20311c)) {
                    arrayList.add(new e((b) eVar.f20309a, nh.b.k(eVar.f20310b, i10, i11) - i10, nh.b.k(eVar.f20311c, i10, i11) - i10, eVar.f20312d));
                }
            }
            return arrayList;
        }
        if (iVar == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Object obj = list.get(i13);
            if (((Boolean) iVar.a(((e) obj).f20309a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i10, int i11, int i12, int i13) {
        return ((i10 < i13) & (i12 < i11)) | (((i10 == i11) | (i12 == i13)) & (i10 == i12));
    }
}
