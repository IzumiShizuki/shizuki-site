package m7;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import i7.j1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f14878e = new ThreadLocal();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final gb.j f14879f = new gb.j(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f14880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f14883d;

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.f1037n && this.f14881b == 0) {
            this.f14881b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        j1 j1Var = recyclerView.U;
        j1Var.f9176a = i10;
        j1Var.f9177b = i11;
    }

    public final void b(long j10) {
        g gVar;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f14883d;
        ArrayList arrayList2 = this.f14880a;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList2.get(i11);
            int windowVisibility = recyclerView2.getWindowVisibility();
            j1 j1Var = recyclerView2.U;
            if (windowVisibility == 0) {
                j1Var.f9178c = 0;
                i10 += j1Var.f9178c;
            }
        }
        arrayList.ensureCapacity(i10);
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i12);
            if (recyclerView3.getWindowVisibility() == 0) {
                j1 j1Var2 = recyclerView3.U;
                Math.abs(j1Var2.f9176a);
                Math.abs(j1Var2.f9177b);
                if (j1Var2.f9178c * 2 > 0) {
                    if (arrayList.size() <= 0) {
                        arrayList.add(new g());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList, f14879f);
        if (arrayList.size() <= 0 || (recyclerView = (gVar = (g) arrayList.get(0)).f14874d) == null) {
            return;
        }
        int i13 = gVar.f14875e;
        if (recyclerView.f1028e.F() > 0) {
            RecyclerView.p(recyclerView.f1028e.E(0));
            throw null;
        }
        y yVar = recyclerView.f1025b;
        try {
            recyclerView.f1052x++;
            yVar.d(i13);
            throw null;
        } catch (Throwable th2) {
            int i14 = recyclerView.f1052x - 1;
            recyclerView.f1052x = i14;
            if (i14 < 1) {
                recyclerView.f1052x = 0;
            }
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f14880a;
        try {
            int i10 = r3.a.f18745a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f14882c);
                }
            }
            this.f14881b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f14881b = 0L;
            int i12 = r3.a.f18745a;
            Trace.endSection();
            throw th2;
        }
    }
}
