package g1;

import a9.r;
import androidx.media3.exoplayer.offline.u;
import ic.n;
import java.util.Arrays;
import jc.c0;
import x0.o;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f7151a = new u(16, new fa.a(16), new d(1));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final u b(n nVar, ic.k kVar) {
        r rVar = new r(nVar);
        c0.c(1, kVar);
        return new u(16, rVar, kVar);
    }

    public static final Object c(Object[] objArr, u uVar, ic.a aVar, o oVar, int i10) {
        return d(Arrays.copyOf(objArr, objArr.length), uVar, aVar, oVar, 384 | ((i10 << 3) & 7168), 0);
    }

    public static final Object d(Object[] objArr, k kVar, ic.a aVar, o oVar, int i10, int i11) {
        Object[] objArr2;
        Object obj;
        Object objD;
        if ((i11 & 2) != 0) {
            kVar = f7151a;
        }
        k kVar2 = kVar;
        long j10 = oVar.T;
        gh.g.j(36);
        String string = Long.toString(j10, 36);
        jc.l.d(string, "toString(...)");
        jc.l.c(kVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        g gVar = (g) oVar.j(i.f7146a);
        Object objK = oVar.K();
        Object obj2 = x0.k.f24334a;
        if (objK == obj2) {
            Object objY = (gVar == null || (objD = gVar.d(string)) == null) ? null : kVar2.y(objD);
            if (objY == null) {
                objY = aVar.b();
            }
            objArr2 = objArr;
            Object bVar = new b(kVar2, gVar, string, objY, objArr2);
            oVar.h0(bVar);
            objK = bVar;
        } else {
            objArr2 = objArr;
        }
        b bVar2 = (b) objK;
        Object objB = Arrays.equals(objArr2, bVar2.f7134e) ? bVar2.f7133d : null;
        if (objB == null) {
            objB = aVar.b();
        }
        boolean zH = oVar.h(bVar2) | ((((i10 & 112) ^ 48) > 32 && oVar.h(kVar2)) || (i10 & 48) == 32) | oVar.h(gVar) | oVar.f(string) | oVar.h(objB) | oVar.h(objArr2);
        Object objK2 = oVar.K();
        if (zH || objK2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objB;
            Object aVar2 = new a(bVar2, kVar2, gVar, string, obj, objArr3, 0);
            oVar.h0(aVar2);
            objK2 = aVar2;
        } else {
            obj = objB;
        }
        v.h((ic.a) objK2, oVar);
        return obj;
    }

    public static final Object e(Object[] objArr, ic.a aVar, o oVar) {
        return d(Arrays.copyOf(objArr, objArr.length), f7151a, aVar, oVar, 3456, 0);
    }

    public static final e f(o oVar) {
        oVar.W(1967008021);
        Object[] objArr = new Object[0];
        Object objK = oVar.K();
        if (objK == x0.k.f24334a) {
            objK = new e.e(13);
            oVar.h0(objK);
        }
        e eVar = (e) c(objArr, e.f7138e, (ic.a) objK, oVar, 384);
        eVar.f7141c = (g) oVar.j(i.f7146a);
        oVar.p(false);
        return eVar;
    }
}
