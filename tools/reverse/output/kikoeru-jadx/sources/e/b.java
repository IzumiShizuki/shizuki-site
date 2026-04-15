package e;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import b0.h0;
import bg.e1;
import bg.f1;
import bg.t;
import d.m;
import h0.e0;
import hf.l0;
import hf.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import jc.u;
import jc.w;
import ub.a0;
import vb.r;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6019f;

    public /* synthetic */ b(t tVar, y yVar, w0 w0Var, w0 w0Var2, ic.a aVar) {
        this.f6014a = 2;
        this.f6015b = tVar;
        this.f6016c = yVar;
        this.f6019f = w0Var;
        this.f6017d = w0Var2;
        this.f6018e = aVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        List listSubList;
        int i10 = this.f6014a;
        Object objB = null;
        a0 a0Var = a0.f21526a;
        Object obj2 = this.f6019f;
        Object obj3 = this.f6018e;
        Object obj4 = this.f6017d;
        Object obj5 = this.f6016c;
        Object obj6 = this.f6015b;
        switch (i10) {
            case 0:
                a aVar = (a) obj6;
                m mVar = (m) obj5;
                String str = (String) obj4;
                a.a aVar2 = (a.a) obj3;
                androidx.media3.exoplayer.offline.g gVar = new androidx.media3.exoplayer.offline.g(11, (w0) obj2);
                w0 w0Var = (w0) gVar.f903b;
                Bundle bundle = mVar.f5234g;
                LinkedHashMap linkedHashMap = mVar.f5228a;
                LinkedHashMap linkedHashMap2 = mVar.f5233f;
                jc.l.e(str, "key");
                LinkedHashMap linkedHashMap3 = mVar.f5229b;
                if (((Integer) linkedHashMap3.get(str)) == null) {
                    for (Number number : (df.a) df.m.a0(new e(12))) {
                        if (!linkedHashMap.containsKey(Integer.valueOf(number.intValue()))) {
                            int iIntValue = number.intValue();
                            linkedHashMap.put(Integer.valueOf(iIntValue), str);
                            linkedHashMap3.put(str, Integer.valueOf(iIntValue));
                        }
                    }
                    throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                }
                mVar.f5232e.put(str, new g.b(gVar, aVar2));
                if (linkedHashMap2.containsKey(str)) {
                    Object obj7 = linkedHashMap2.get(str);
                    linkedHashMap2.remove(str);
                    ((ic.k) w0Var.getValue()).a(obj7);
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    objB = d.j.b(str, bundle);
                } else {
                    Parcelable parcelable = bundle.getParcelable(str);
                    if (g.a.class.isInstance(parcelable)) {
                        objB = parcelable;
                    }
                }
                g.a aVar3 = (g.a) objB;
                if (aVar3 != null) {
                    bundle.remove(str);
                    ((ic.k) w0Var.getValue()).a(aVar2.J(aVar3.f7105b, aVar3.f7104a));
                }
                aVar.f6013a = new g.c(mVar, str, aVar2);
                return new h0(4, aVar);
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                w wVar = (w) obj4;
                h7.g gVar2 = (h7.g) obj3;
                Bundle bundle2 = (Bundle) obj2;
                e7.j jVar = (e7.j) obj;
                jc.l.e(jVar, "entry");
                ((u) obj6).f10834a = true;
                int iIndexOf = arrayList.indexOf(jVar);
                if (iIndexOf != -1) {
                    int i11 = iIndexOf + 1;
                    listSubList = arrayList.subList(wVar.f10836a, i11);
                    wVar.f10836a = i11;
                } else {
                    listSubList = r.f22819a;
                }
                gVar2.a(jVar.f6334b, bundle2, jVar, listSubList);
                return a0Var;
            case 2:
                f1 f1Var = (f1) obj;
                jc.l.e(f1Var, "action");
                ((w0) obj2).setValue(Boolean.FALSE);
                pf.e eVar = l0.f8566a;
                hf.a0.y((y) obj5, pf.d.f17138c, null, new e0((e1) ((t) obj6), f1Var, (w0) obj4, (ic.a) obj3, null, 1), 2);
                return a0Var;
            default:
                fg.f fVar = (fg.f) obj5;
                fg.f fVar2 = (fg.f) obj4;
                a0.j jVar2 = (a0.j) obj;
                jc.l.e(jVar2, "$this$LazyColumn");
                jVar2.l(s9.d.f19672a);
                jVar2.l(new f1.f(new p9.b(fVar, fVar2, (e7.a0) obj3), -640865633, true));
                jVar2.l(s9.d.f19679h);
                na.c.h(jVar2, (j7.b) obj6, new f1.f(new ba.e0(fVar, fVar2, (s9.a) obj2, 3), -1288100128, true));
                return a0Var;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f6014a = i10;
        this.f6015b = obj;
        this.f6016c = obj2;
        this.f6017d = obj3;
        this.f6018e = obj4;
        this.f6019f = obj5;
    }
}
