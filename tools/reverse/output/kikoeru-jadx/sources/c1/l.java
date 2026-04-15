package c1;

import df.q;
import e7.y;
import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends vb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3231b;

    public /* synthetic */ l(int i10, Object obj) {
        this.f3230a = i10;
        this.f3231b = obj;
    }

    @Override // vb.a
    public final int a() {
        switch (this.f3230a) {
            case 0:
                c cVar = (c) this.f3231b;
                cVar.getClass();
                return cVar.f3210b;
            default:
                return ((ef.j) this.f3231b).f6571a.groupCount() + 1;
        }
    }

    @Override // vb.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f3230a) {
            case 0:
                return ((c) this.f3231b).containsValue(obj);
            default:
                if (obj == null ? true : obj instanceof ef.h) {
                    return super.contains((ef.h) obj);
                }
                return false;
        }
    }

    public ef.h i(int i10) {
        Matcher matcher = ((ef.j) this.f3231b).f6571a;
        oc.d dVarE = nh.b.E(matcher.start(i10), matcher.end(i10));
        if (dVarE.f16307a < 0) {
            return null;
        }
        String strGroup = matcher.group(i10);
        jc.l.d(strGroup, "group(...)");
        return new ef.h(strGroup, dVarE);
    }

    @Override // vb.a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f3230a) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3230a) {
            case 0:
                m mVar = ((c) this.f3231b).f3209a;
                n[] nVarArr = new n[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    nVarArr[i10] = new o(2);
                }
                return new k(mVar, nVarArr);
            default:
                return new q(df.m.e0(vb.m.R(ud.b.q(this)), new y(2, this)));
        }
    }
}
