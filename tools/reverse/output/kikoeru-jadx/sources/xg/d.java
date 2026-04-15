package xg;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import jc.l;
import lh.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f25045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f25046d;

    public d(g gVar, String str, long j10, ArrayList arrayList, long[] jArr) {
        l.e(str, "key");
        l.e(jArr, "lengths");
        this.f25046d = gVar;
        this.f25043a = str;
        this.f25044b = j10;
        this.f25045c = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f25045c.iterator();
        while (it.hasNext()) {
            wg.e.b((h0) it.next());
        }
    }
}
