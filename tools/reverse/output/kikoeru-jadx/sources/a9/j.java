package a9;

import com.cnl.kikoeru.MainActivity;
import com.tencent.bugly.beta.tinker.TinkerReport;
import e7.a0;
import j2.h0;
import java.lang.ref.WeakReference;
import q2.v;
import vb.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f243b;

    public /* synthetic */ j(int i10, String str) {
        this.f242a = i10;
        this.f243b = str;
    }

    @Override // ic.k
    public final Object a(Object obj) throws Exception {
        a0 a0Var;
        z7.c cVarD0;
        c9.h hVar;
        int i10 = this.f242a;
        ub.a0 a0Var2 = ub.a0.f21526a;
        String str = this.f243b;
        switch (i10) {
            case 0:
                ka.k kVar = (ka.k) obj;
                int i11 = MainActivity.f4292u;
                jc.l.e(kVar, "it");
                ka.n.b(kVar);
                WeakReference weakReference = u.f266d;
                if (weakReference != null && (a0Var = (a0) weakReference.get()) != null) {
                    a0.b(a0Var, "MusicScreen/".concat(str));
                }
                return a0Var2;
            case 1:
                z7.c cVar = (z7.c) obj;
                jc.l.e(cVar, "_stmt");
                cVar.v(1, str);
                return a0Var2;
            case 2:
                z7.a aVar = (z7.a) obj;
                jc.l.e(aVar, "_connection");
                cVarD0 = aVar.d0("SELECT * FROM SearchHistoryBean WHERE content=(?)");
                try {
                    cVarD0.v(1, str);
                    int iJ = w.j(cVarD0, "id");
                    int iJ2 = w.j(cVarD0, "timestamp");
                    int iJ3 = w.j(cVarD0, "content");
                    if (cVarD0.Z()) {
                        hVar = new c9.h(cVarD0.getLong(iJ2), cVarD0.M(iJ3), (int) cVarD0.getLong(iJ));
                        break;
                    } else {
                        hVar = null;
                    }
                    return hVar;
                } finally {
                }
            case 3:
                z7.a aVar2 = (z7.a) obj;
                jc.l.e(aVar2, "_connection");
                cVarD0 = aVar2.d0("DELETE FROM SearchHistoryBean WHERE content=(?)");
                try {
                    cVarD0.v(1, str);
                    cVarD0.Z();
                    return a0Var2;
                } finally {
                }
            case 4:
                String str2 = (String) obj;
                jc.l.e(str2, "it");
                return ef.n.y0(str2) ? str2.length() < str.length() ? str : str2 : h0.j(str, str2);
            case 5:
                oc.d dVar = (oc.d) obj;
                jc.l.e(dVar, "it");
                return ef.n.N0(str, dVar);
            case 6:
                q2.k kVar2 = (q2.k) obj;
                v.d(kVar2, str);
                v.e(kVar2, 5);
                return a0Var2;
            case 7:
                q2.k kVar3 = (q2.k) obj;
                v.d(kVar3, str);
                v.e(kVar3, 5);
                return a0Var2;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                q2.k kVar4 = (q2.k) obj;
                pc.u[] uVarArr = v.f17698a;
                q2.w wVar = q2.t.f17679j;
                pc.u[] uVarArr2 = v.f17698a;
                pc.u uVar = uVarArr2[3];
                wVar.a(kVar4, new q2.e());
                q2.w wVar2 = q2.t.f17673d;
                pc.u uVar2 = uVarArr2[2];
                wVar2.a(kVar4, str);
                v.b(kVar4, new i9.f(15));
                return a0Var2;
            default:
                pc.u[] uVarArr3 = v.f17698a;
                ((q2.k) obj).l(q2.t.K, str);
                return a0Var2;
        }
    }
}
