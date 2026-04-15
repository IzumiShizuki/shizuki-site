package z4;

import android.net.Uri;
import androidx.media3.exoplayer.offline.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import m4.b0;
import m4.b1;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f26394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f26395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f26396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ff.g f26397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0 f26398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f26399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f26400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f26401m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, i iVar, ff.g gVar, b0 b0Var, Uri uri, ArrayList arrayList) {
        this.f26389a = j10;
        this.f26390b = j11;
        this.f26391c = j12;
        this.f26392d = z10;
        this.f26393e = j13;
        this.f26394f = j14;
        this.f26395g = j15;
        this.f26396h = j16;
        this.f26400l = iVar;
        this.f26397i = gVar;
        this.f26399k = uri;
        this.f26398j = b0Var;
        this.f26401m = arrayList;
    }

    @Override // androidx.media3.exoplayer.offline.t
    public final Object a(List list) {
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new b1(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f26401m.size()) {
                break;
            }
            if (((b1) linkedList.peek()).f14140a != i10) {
                long jC = c(i10);
                if (jC != -9223372036854775807L) {
                    j11 += jC;
                }
            } else {
                h hVarB = b(i10);
                List list2 = hVarB.f26423c;
                b1 b1Var = (b1) linkedList.poll();
                int i11 = b1Var.f14140a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = b1Var.f14141b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f26381c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(b1Var.f14142c));
                        b1Var = (b1) linkedList.poll();
                        if (b1Var.f14140a != i11) {
                            break;
                        }
                    } while (b1Var.f14141b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f26379a, aVar.f26380b, arrayList3, aVar.f26382d, aVar.f26383e, aVar.f26384f));
                    if (b1Var.f14140a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(b1Var);
                arrayList.add(new h(hVarB.f26421a, hVarB.f26422b - j10, arrayList2, hVarB.f26424d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f26390b;
        return new c(this.f26389a, j13 != -9223372036854775807L ? j13 - j12 : -9223372036854775807L, this.f26391c, this.f26392d, this.f26393e, this.f26394f, this.f26395g, this.f26396h, this.f26400l, this.f26397i, this.f26398j, this.f26399k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f26401m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f26401m;
        if (i10 != list.size() - 1) {
            return ((h) list.get(i10 + 1)).f26422b - ((h) list.get(i10)).f26422b;
        }
        long j10 = this.f26390b;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - ((h) list.get(i10)).f26422b;
    }

    public final long d(int i10) {
        return c0.N(c(i10));
    }
}
