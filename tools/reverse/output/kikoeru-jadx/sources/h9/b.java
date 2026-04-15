package h9;

import j2.h0;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import jc.l;
import wg.g;
import zg.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f8237d;

    public b(yg.c cVar) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        l.e(cVar, "taskRunner");
        l.e(timeUnit, "timeUnit");
        this.f8234a = timeUnit.toNanos(5L);
        this.f8235b = cVar.d();
        this.f8236c = new xg.e(2, this, h0.n(new StringBuilder(), g.f24232b, " ConnectionPool connection closer"));
        this.f8237d = new ConcurrentLinkedQueue();
    }

    public int a(o oVar, long j10) {
        TimeZone timeZone = g.f24231a;
        ArrayList arrayList = oVar.f26900p;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                String str = "A connection to " + oVar.f26887c.f21794a.f21716h + " was leaked. Did you forget to close a response body?";
                fh.e eVar = fh.e.f7102a;
                fh.e.f7102a.k(((zg.l) reference).f26866a, str);
                arrayList.remove(i10);
                if (arrayList.isEmpty()) {
                    oVar.f26901q = j10 - this.f8234a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public b(String str, String str2, String str3, long j10) {
        this.f8234a = j10;
        this.f8235b = str;
        this.f8236c = str2;
        this.f8237d = str3;
    }
}
