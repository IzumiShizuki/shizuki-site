package x5;

import androidx.lifecycle.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p4.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f24774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f24775d;

    public static Serializable B1(int i10, s sVar) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(sVar.o()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(sVar.u() == 1);
        }
        if (i10 == 2) {
            return D1(sVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return C1(sVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(sVar.o()));
                sVar.H(2);
                return date;
            }
            int iY = sVar.y();
            ArrayList arrayList = new ArrayList(iY);
            for (int i11 = 0; i11 < iY; i11++) {
                Serializable serializableB1 = B1(sVar.u(), sVar);
                if (serializableB1 != null) {
                    arrayList.add(serializableB1);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strD1 = D1(sVar);
            int iU = sVar.u();
            if (iU == 9) {
                return map;
            }
            Serializable serializableB12 = B1(iU, sVar);
            if (serializableB12 != null) {
                map.put(strD1, serializableB12);
            }
        }
    }

    public static HashMap C1(s sVar) {
        int iY = sVar.y();
        HashMap map = new HashMap(iY);
        for (int i10 = 0; i10 < iY; i10++) {
            String strD1 = D1(sVar);
            Serializable serializableB1 = B1(sVar.u(), sVar);
            if (serializableB1 != null) {
                map.put(strD1, serializableB1);
            }
        }
        return map;
    }

    public static String D1(s sVar) {
        int iA = sVar.A();
        int i10 = sVar.f16612b;
        sVar.H(iA);
        return new String(sVar.f16611a, i10, iA);
    }
}
