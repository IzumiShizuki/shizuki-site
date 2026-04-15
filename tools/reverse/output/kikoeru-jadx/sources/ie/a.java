package ie;

import bd.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import vb.n;
import vb.r;

/* JADX INFO: loaded from: classes.dex */
public final class a implements bf.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9515b = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9516a;

    public /* synthetic */ a(int i10) {
        this.f9516a = i10;
    }

    @Override // bf.b
    public final Iterable d(Object obj) {
        Collection collectionA;
        switch (this.f9516a) {
            case 0:
                int i10 = d.f9520a;
                Collection collectionA2 = ((y0) obj).A();
                ArrayList arrayList = new ArrayList(n.K(collectionA2, 10));
                Iterator it = ((ArrayList) collectionA2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((y0) it.next()).a());
                }
                return arrayList;
            default:
                yc.c cVar = (yc.c) obj;
                return (cVar == null || (collectionA = cVar.A()) == null) ? r.f22819a : collectionA;
        }
    }
}
