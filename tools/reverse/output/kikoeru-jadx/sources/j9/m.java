package j9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Collection f10715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f10716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Collection f10717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f10721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10722l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ArrayList arrayList, yb.c cVar) {
        super(2, cVar);
        this.f10722l = arrayList;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        m mVar = new m(this.f10722l, cVar);
        mVar.f10721k = obj;
        return mVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((m) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00d4 -> B:19:0x00d6). Please report as a decompilation issue!!! */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.m.u(java.lang.Object):java.lang.Object");
    }
}
