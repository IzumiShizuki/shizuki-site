package d5;

import android.net.Uri;
import androidx.media3.exoplayer.offline.b0;
import androidx.media3.exoplayer.offline.t;
import androidx.media3.exoplayer.offline.x;
import androidx.media3.exoplayer.offline.z;
import e5.h;
import e5.k;
import e5.n;
import e5.o;
import e5.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import m4.i0;
import p4.c;
import s4.m;
import t4.e;
import t4.f;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b0 {
    public a(i0 i0Var, e eVar, Executor executor) {
        super(i0Var, new q(), eVar, executor);
    }

    public static void i(k kVar, h hVar, HashSet hashSet, ArrayList arrayList) {
        String str = kVar.f6249a;
        long j10 = kVar.f6215h + hVar.f6199e;
        String str2 = hVar.f6201g;
        if (str2 != null) {
            Uri uriY = c.y(str, str2);
            if (hashSet.add(uriY)) {
                arrayList.add(new z(j10, b0.d(uriY)));
            }
        }
        arrayList.add(new z(j10, new m(c.y(str, hVar.f6195a), 0L, 1, null, Collections.EMPTY_MAP, hVar.f6203i, hVar.f6204j, null, 0)));
    }

    @Override // androidx.media3.exoplayer.offline.b0
    public final ArrayList e(f fVar, t tVar, boolean z10) throws IOException {
        o oVar = (o) tVar;
        ArrayList<m> arrayList = new ArrayList();
        if (oVar instanceof n) {
            List list = ((n) oVar).f6241d;
            for (int i10 = 0; i10 < list.size(); i10++) {
                arrayList.add(b0.d((Uri) list.get(i10)));
            }
        } else {
            arrayList.add(b0.d(Uri.parse(oVar.f6249a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        for (m mVar : arrayList) {
            arrayList2.add(new z(0L, mVar));
            try {
                k kVar = (k) ((t) c(new x(this, fVar, mVar), z10));
                ya.i0 i0Var = kVar.f6225r;
                h hVar = null;
                for (int i11 = 0; i11 < i0Var.size(); i11++) {
                    h hVar2 = (h) i0Var.get(i11);
                    h hVar3 = hVar2.f6196b;
                    if (hVar3 != null && hVar3 != hVar) {
                        i(kVar, hVar3, hashSet, arrayList2);
                        hVar = hVar3;
                    }
                    i(kVar, hVar2, hashSet, arrayList2);
                }
            } catch (IOException e10) {
                if (!z10) {
                    throw e10;
                }
            }
        }
        return arrayList2;
    }
}
