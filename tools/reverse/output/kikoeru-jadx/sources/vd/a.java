package vd;

import java.util.LinkedHashMap;
import r5.p;
import vb.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public enum a {
    f22932d("UNKNOWN"),
    f22933e("CLASS"),
    f22934f("FILE_FACADE"),
    f22935g("SYNTHETIC_CLASS"),
    f22936h("MULTIFILE_CLASS"),
    f22937i("MULTIFILE_CLASS_PART");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f22930b = new p(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f22931c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22939a;

    static {
        a[] aVarArrValues = values();
        int iT = w.t(aVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iT < 16 ? 16 : iT);
        for (a aVar : aVarArrValues) {
            linkedHashMap.put(Integer.valueOf(aVar.f22939a), aVar);
        }
        f22931c = linkedHashMap;
    }

    a(String str) {
        this.f22939a = i;
    }
}
